package org.cscie88c.week8

import com.typesafe.scalalogging.LazyLogging
import scala.util.{Try, Success, Failure}
import scala.io.Source
import org.cscie88c.config.{ConfigUtils}
//DW imported pureconfig._
import pureconfig._
import pureconfig.generic.auto._

//DW imported
import scala.reflect.ClassTag

// write case class here 3.2
case class simpleApp2Config(
  fileName: String,
  month: String
)

// run with: sbt "runMain org.cscie88c.week8.SimpleApp2"
object SimpleApp2 extends LazyLogging{
  
//Provided
  def lineStreamFromFile(fileName: String): Option[LazyList[String]] =
    Try {
      LazyList.from(Source.fromResource(fileName).getLines())
    }.toOption
  
  //Prob 3.3
  def monthLines(month: String)(lines: LazyList[String]): LazyList[String] = {
    lines.filter({ line => 
      val cols = line.split(",")
      val date = cols(1)
      date.contains(month)
      })
  }

  private def loadConfig[A: ConfigReader: ClassTag](path: String):A = {
    ConfigSource.default.at(path).loadOrThrow[A]
  }

  def main(args: Array[String]): Unit = {
    val conf = loadConfig[simpleApp2Config]("org.cscie88c.simple-app-2")

    Try{
      val lines = lineStreamFromFile(conf.fileName)
      val linesInMonth = monthLines(conf.month)(lines.get)
      linesInMonth.size
    }match{
      case Success(value) => println(s"Transactions in ${conf.month}: ${value}")
      case Failure(_) => println("No Transactions found for Jan")
    }
    }
  }
