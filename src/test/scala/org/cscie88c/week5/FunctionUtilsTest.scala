package org.cscie88c.week5

import org.cscie88c.testutils.{ StandardTest }
import FunctionUtils.CustomerTransaction

// run using: sbt "testOnly org.cscie88c.week5.FunctionUtilsTest"
class FunctionUtilsTest extends StandardTest {
  "FunctionUtils" when {
    // Problem 1.2 unit tests
    "calling colorToCode" should {
      "return the correct value for white and lime" in {
        val Lime = FunctionUtils.colorToCode("Lime")
        assert(Lime == (0,255,0))        

        val White = FunctionUtils.colorToCode("White")
        assert(White == (255,255,255))          
      }
    }

//Problem 1.4
    "calling fizzBuzzString" should {
      "return the correct value" in {
        val Six = FunctionUtils.fizzBuzzString(6)
        assert(Six == "Fizz")    
        val Ten = FunctionUtils.fizzBuzzString(10)
        assert(Ten == "Buzz")  
        val Fifteen = FunctionUtils.fizzBuzzString(15)
        assert(Fifteen == "FizzBuzz")      
      
         }
    }

    "calling fizzBuzz" should {
      "return the correct value" in {
        // write unit tests here
      }
    }
    
    // Problem 2 unit tests
    //2.2 
    "calling tanDegrees" should {
      "return the correct value" in {
        val Eighty = FunctionUtils.tanDegrees(80)
        assert(Eighty == 9.00365494560708)    
        assertThrows[MatchError](FunctionUtils.tanDegrees(90))
        assertThrows[MatchError](FunctionUtils.tanDegrees(-90))
         }
    }

    //2.4 
      //DW Values 
    val allTransactions = List(
    CustomerTransaction("1","10-09-23", 2.0),
    CustomerTransaction("1","10-09-23", 300.0),
    CustomerTransaction("1","10-09-23", 400.0)
  )
    "calling total high value transactions" should {
      "return the correct value" in {
        val myListSum = FunctionUtils.totalHighValueTransactions(allTransactions)
        assert(myListSum == 700.0)    
         }
    }

    // Problem 3 unit tests

    //Problem 3.2 Unit Tests - Flip
    "Flip2" should {
      "return the correct value" in {
      val twoToFivePower = math.pow(2,5)
      val twoToFivePowerFlip = FunctionUtils.flip2(math.pow)(5,2)
      assert(twoToFivePower == twoToFivePowerFlip)       
         }
    }

    // Problem 3.4 Unit Tests - first five of list
    "Sample Lists" should {
      "return the correct value" in {
        val myList1 = List(5,1,4,6,88,5,3,5)
        val myList2 = List("five","one","four","six","eightyeight", "five", "three")
        val myList1Five = FunctionUtils.sampleList(myList1)
        val myList2Five = FunctionUtils.sampleList(myList2)
        assert(myList1Five == List(5,1,4,6,88))   
        assert(myList2Five == List("five","one","four","six","eightyeight"))    
         }
    }


  }

}
