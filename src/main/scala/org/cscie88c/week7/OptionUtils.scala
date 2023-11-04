package org.cscie88c.week7

import scala.io.Source
import scala.util.{Try, Success, Failure}

object OptionUtils {
  //Problem 1.1
  // Source for reading into a string on Scala https://alvinalexander.com/scala/how-to-open-read-text-files-in-scala-cookbook-examples/
  def fileCharCount(fileName: String): Try[Long] = Try{
    val myData = scala.io.Source.fromResource(fileName).mkString
    val fileContentStringLength = myData.length()
    val fileContentStringLengthLong = fileContentStringLength.toLong
    fileContentStringLengthLong
  } 

  //Problem 1.2 
  def charCountAsString(fileName: String): String = {
    fileCharCount(fileName)
    // val fileCharCountString = fileCharCountValue.toString()
    // fileCharCountString
   match {
    case Success(charCountString) => s"Success: ${charCountString}"
    case Failure(_) => "error opening file"
    }
  }
  //Problem 1.3
  def lineStreamFromFile(fileName: String): Option[LazyList[String]] = {
    Try {
      Source.fromResource(fileName).map(_.toString).to(LazyList)
    }.toOption
  }

  } 