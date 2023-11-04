package org.cscie88c.week4

object FunctionUtils {
  // complete the implementation of the higher order functions below
  //Problem 4.1 - n: number of times, x: argument for function being passed in f: passed in function
  //Old Original Way Just calling on it three times 
  def applyNtimes(n: Int)(x: Int)(f: Int => Int): Int = {
    var res = x 
    for (i <- 1 to n) {
      res = f(res)
    }
    res
  }
//Problem 4.3
  def myPositivePower(x: Int, n: Int): Int = {
    applyNtimes(n-1)(x)(v=>x*v)
  }

//Problem 4.4
  def deferredExecutor(name: String)(f: Int => Int): Int => Int = {
    x =>
    println(s"running on deferred executor ${name} with value ${x}") 
    f(x)
  }
}
