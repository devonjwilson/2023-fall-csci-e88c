package org.cscie88c.week5

import scala.math

object FunctionUtils {

  case class CustomerTransaction(customerId: String,transactionDate: String,transactionAmount: Double)

  // Problem 1.1
  def colorToCode(color: String): (Int, Int, Int) = color match {
    case "Black" =>  (0,0,0)
    case "White" =>  (255,255,255)
    case "Red" => (255,0,0)
    case "Lime" => (0,255,0)
    case "Blue" => (0,0,255)
    case "Yellow" => (255,255,0)
  }
//Problem 1.3
  def fizzBuzzString(n: Int): String = n match {
    case n if ((n%3==0)&&(n%5==0))=> "FizzBuzz"    
    case n if (n%3==0)=> "Fizz"    
    case n if (n%5==0)=> "Buzz"    
  }

  //Problem 1.5
  def fizzBuzz(n: Int): List[String] = {
    def toN(n:Int): List[Int] = (1 to n).toList
    val nList = toN(n)

    val evensSquared: PartialFunction [Int, String] = {
      case i if ((i%3==0)&&(i%5==0)) => "FizzBuzz"  
      case i if (i%3==0) => "Fizz"    
      case i if (i%5==0) => "Buzz"
      case i  => i.toString
    }
    nList.collect(evensSquared)
  }

  // Problem 2.1 - trigonimic function tan
  //In partial function [input,result] are in brackets
  def tanDegrees: PartialFunction[Double, Double] = {
      case (x) if (x!=90 && x!=(-90)) => math.tan(x)
  }

  //Problem 2.3
//DW Note: Customer Transaction references case class above (using .transactionAmount)
  def totalHighValueTransactions(transactionList: List[CustomerTransaction]): Double = {
    val highValuesList: PartialFunction[CustomerTransaction, Double] = {
      case i if i.transactionAmount >100 => i.transactionAmount
    }
    transactionList.collect(highValuesList).sum
  }


  // Problem 3.1
  def flip2[A, B, C](f: (A, B) => C): (B, A) => C = {
    case(a,b) => f(b,a)    
  }

  // Problem 3.3 : Write a generic function sampleList parameterized by type A, that returns the first 5 elements of a list of type A. (DW Note: Nothing else given - no start to code)
  def sampleList[A](a:List[A]) = {
     a.take(5)
  }

  //Problem 3.5: Deferred Executor 

  def deferredExecutor[A,B](name: String)(f:A=>B): A =>B = {
    x => f(x)
  }

}
