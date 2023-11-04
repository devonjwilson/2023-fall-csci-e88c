package org.cscie88c.week3

import org.cscie88c.testutils.{StandardTest}

class UtilFunctionsTest extends StandardTest {
  "UtilFunctions" when {
    "with pythTriplesUpto100" should {
      "verify elements in list are pythagorean triples" in {
        val pythTriplesList = UtilFunctions.pythTriplesUpto100
        val firstList = pythTriplesList(0)
        val firstBool =
          UtilFunctions.pythTest(firstList._1, firstList._2, firstList._3)
        val secondList = pythTriplesList(1)
        val secondBool =
          UtilFunctions.pythTest(secondList._1, secondList._2, secondList._3)
        firstBool && secondBool shouldBe true
      }
    }
  }
}
