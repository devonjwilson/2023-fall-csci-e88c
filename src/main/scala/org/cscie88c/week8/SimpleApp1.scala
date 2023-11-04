package org.cscie88c.week8

import com.typesafe.scalalogging.LazyLogging
import scala.util.{Try, Success, Failure}
import scala.io.Source

// run using: sbt "runMain org.cscie88c.week8.SimpleApp1 <args>"
object SimpleApp1 extends LazyLogging {
  //Provided
  def lineStreamFromFile(fileName: String): Option[LazyList[String]] = {
    Try {
      LazyList.from(Source.fromResource(fileName).getLines())
    }.toOption
}
  //Problem 2.1 - 
  def monthLines(month: String)(lines: LazyList[String]): LazyList[String] = {
    lines.filter({ line => 
      val cols = line.split(",")
      val date = cols(1)
      date.contains(month)
    })
  }
      
  def main(args: Array[String]): Unit = {
    val validFileName: String = "data/Retail_Data_Transactions.csv"
    val invalidFileName: String = "data/Retail_Data_Transactions.csvx"
    val month: String = "Jan"
  Try {
    val lines = lineStreamFromFile(invalidFileName)
    val linesInMonth = monthLines(month)(lines.get)
    linesInMonth.size
  } match{
    case Success(value) => println (s"Transactions in ${month}: ${value}")
    case Failure(_) => println("No Transactions found for Jan")
  }
  }
}
