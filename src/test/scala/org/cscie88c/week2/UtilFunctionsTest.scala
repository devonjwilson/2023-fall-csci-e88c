package org.cscie88c.week2

import org.cscie88c.testutils.{StandardTest}

class UtilFunctionsTest extends StandardTest {

  "UtilFunctions" when {
    "maximum" should {
      "return maximum of two ints when first integer is greater" in {
        UtilFunctions.maximum(2, 1) should be(2)
      }
      "return maximum of two ints when second integer is greater" in {
        UtilFunctions.maximum(1, 3) should be(3)
      }
      "return maximum of second int when int values are the same" in {
        UtilFunctions.maximum(6, 6) should be(6)
      }
    }

    // add unit tests for average below
    "average" should {
      "return average of 5 and 9 should be 7" in {
        UtilFunctions.average(5, 9) should be(7)
      }
      "return average of 5 and 10 should be 7.5" in {
        UtilFunctions.average(5, 10) should be(7.5)
      }
      "return average of -300 and -100 should be 100" in {
        UtilFunctions.average(-300, -100) should be(-200)
      }
    }
  }
}
