package org.cscie88c.week6

import org.cscie88c.testutils.{ StandardTest }

class AddableTraitTest extends StandardTest {

  "plus" should {
    //Problem 1.3 
    "add two MyInt values correctly" in {
      // add your unit tests for MyInt below
      val sumNumber = MyInt(5).plus(MyInt(3))
      assert(sumNumber == MyInt(8))       
    }

    //Problem 1.5
    "add two MyBool values correctly" in {
      val trueFalse = MyBool(true).plus(MyBool(false))
      val trueTrue = MyBool(true).plus(MyBool(true))
      val falseFalse = MyBool(false).plus(MyBool(false))
      assert(trueFalse == MyBool(true))       
      assert(trueTrue == MyBool(true)) 
      assert(falseFalse == MyBool(false))       
   } 
}
}