package org.cscie88c.week6

// Problem 1.1 - define the trait AddableTrait with parameterized type A below
trait AddableTrait[A] {
    def plus(other: A): A
}

// Problem 1.2 define the case class MyInt that implements AddableTrait for MyInt type below

case class MyInt(value: Int) extends AddableTrait[MyInt] {
    def plus(other: MyInt): MyInt = {
        MyInt(value + other.value)
    }
}

//Problem 1.4 define the case class MyBool that implements AddableTrait for MyBool type below
case class MyBool(value: Boolean) extends AddableTrait[MyBool]{
     def plus(other: MyBool): MyBool = {
        MyBool(value || other.value)
    }
}
