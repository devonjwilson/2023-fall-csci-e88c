package org.cscie88c.week4

import org.cscie88c.testutils.{StandardTest}

class FunctionUtilsTest extends StandardTest {

   "FunctionUtils" when {
    "calling applyNtimes" should {
      "return the correct value" in {
        def add5(x:Int) = x+5
        val add5Value0Times3 = FunctionUtils.applyNtimes(3)(0)(add5)
        assert(add5Value0Times3 == 15)     

        val add5Value5Times3 = FunctionUtils.applyNtimes(5)(2)(add5)
        assert(add5Value5Times3 == 27)     
      }
    }

    // write unit tests for other functions here
    "calling deferredExecutor" should {
      "return the correct value" in {
        def add5(x:Int) = x+5
        val myDeferredFunction = FunctionUtils.deferredExecutor("CPU Pool")(add5)
        val result = myDeferredFunction(4)
        assert(result == 9)     
      }
    }
  }
 
}
