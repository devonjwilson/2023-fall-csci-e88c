package org.cscie88c.week4

object TrigUtils {

  // https://www.scala-lang.org/api/2.13.6/scala/math/index.html
  // use the function literal syntax for sin and cos
  //1.1 DW - functions for sin and cos
  val sinDegrees: Double => Double = (x:Double) => math.sin(x) 
  val cosDegrees: Double => Double = (x:Double) => math.cos(x)

  // 1.3 use the placeholder syntax for squared
  val squared: Double => Double = math.pow(_,2) 
  
}
