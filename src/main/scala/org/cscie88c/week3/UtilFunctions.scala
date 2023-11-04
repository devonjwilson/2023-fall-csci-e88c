package org.cscie88c.week3

object UtilFunctions {

  def mult2(x: Int, y: Int): Int = x * y

  // Problem 1.1 - checks for Pyth triplet
  def pythTest(x: Int, y: Int, z: Int): Boolean = {
    if ((x * x) + (y * y) == (z * z))
      true
    else
      false
  }

  // Problem 1.2 - gives full list of pyth triplets for variable values 1-100
  val pythTriplesUpto100: List[(Int, Int, Int)] = (for {
    x <- 1 to 100
    y <- 1 to 100
    z <- 1 to 100
    if pythTest(x, y, z)
  } yield (x, y, z)).toList
}
