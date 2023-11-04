package org.cscie88c.week7

import scala.concurrent.{Future}
import scala.util.{Try, Success, Failure}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Random
import scala.collection.parallel.CollectionConverters._

object FutureUtils {
  
  val rnd = new Random()

//Problem 3.1
  def creditScoreAPI(applicantId: Int): Future[Int] = Future {
    val creditScoreValue = rnd.between(300,800)
    creditScoreValue
  }

  //Problem 3.2
  def printCreditScore(applicantId: Int): Unit = {
    creditScoreAPI(applicantId).onComplete {
      case Success(creditScore) => 
        println(s"The credit score for ${applicantId} is ${creditScore}")
      case Failure (e)=>
        println(s"Cannot get credit score for ${applicantId} at this time")
    }
  }

  //Problem 4.1
  def passedCreditCheck(applicantId: Int): Future[Boolean] = {
    for {
      creditscore1 <- creditScoreAPI(applicantId)
    } yield {
      if (creditscore1 > 600) true else false
    }
    }


  //Problem 3.4
  def futureFactorial(n: Int): Future[Int] = Future {
    (1 to n).product
  }

  //Problem 4.2
  def futurePermuations(n: Int, r: Int): Future[Int] = {
    for {
      nFact <- futureFactorial(n)
      nMinusRFact <- futureFactorial(n-r)
    }yield {
  nFact/nMinusRFact
}    
}
  
//Problem 4.4
  def asyncAverageCreditScore(idList: List[Int]): Future[Double] = {
    val size = idList.length
    Future.traverse(idList) {
      id => creditScoreAPI(id)
    }.map(_.sum/size)
  }

  //Problem 5.1
  def slowMultiplication(x: Long, y: Long): Long = {
    Thread.sleep(1000)
    x*y
  }

  def concurrentFactorial(n: Long): Long = ???

  def sequentialFactorial(n: Long): Long = ???

}
