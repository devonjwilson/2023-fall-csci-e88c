package org.cscie88c.week7

import scala.io.Source
import scala.util.{Try, Success, Failure}

final case class CustomerTransaction(
  customerId: String,
  transactionDate: String,
  transactionAmount: Double
)

object CustomerTransaction {
  //2.1
  // add companion object methods below
  def apply(csvString: String): Option[CustomerTransaction] = Try {
    val Array(customerId, transactionDate, transactionAmount) = csvString.split(",")
    CustomerTransaction(customerId.trim, transactionDate.trim, transactionAmount.toDouble)
  }.toOption

  //2.3
  def readFromCSVFile(fileName: String): List[CustomerTransaction] = {
    val myData = scala.io.Source.fromResource(fileName).mkString
    myData
    .split("\n")
    .map(CustomerTransaction(_))
    .collect {case Some(emp) => emp}
    .toList
 }
}

