package org.cscie88c.week6

// Problem 4.1 Write a generic trait AddableTypeclass parameterized by type A 
trait AddableTypeclass[A] {
  // add trait methods below
  def addTwoValues(a: A, b: A): A 
}

// Problem 4.2
object AddableTypeclass {
  
  implicit val intAddableTypeclass: AddableTypeclass[Int] = {
    def addTwoValues(a:Int, b: Int): Int = {
      a+b
    }
    addTwoValues
  }

  //Problem 4.3
  implicit val boolAddableTypeclass: AddableTypeclass[Boolean] = {
    def addTwoValues(a:Boolean, b:Boolean): Boolean = {
      a||b
    }
    addTwoValues
  }

}
//Problem 4.4
object AddableAggregator {
  def sumWithAddable[A](list: List[A])(implicit addable: AddableTypeclass[A]): A = {
    list.reduce(addable.addTwoValues)
  }
}
