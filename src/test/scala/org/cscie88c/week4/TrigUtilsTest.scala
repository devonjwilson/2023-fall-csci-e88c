package org.cscie88c.week4

import org.cscie88c.testutils.{StandardTest}

class TrigUtilsTest extends StandardTest {
  
  "TrigUtils" when {
    "calling sin" should {
      "return the correct sin value for 0 and 90" in {
        val sin90 = TrigUtils.sinDegrees(90)
        //1.2 Round to two decimal places for atching. Source for rounding https://stackoverflow.com/questions/11106886/scala-doubles-and-precision
        val sin90rounded = BigDecimal(sin90).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
        assert(sin90rounded == 0.89)   
        assert(TrigUtils.sinDegrees(0) == 0)
     
      }
    }

    // 1.2 write tests for cos below
    "calling cos" should {
      "return the correct cos value for 0 and 90" in {
        val cos90 = TrigUtils.cosDegrees(90)
        val cos90rounded = BigDecimal(cos90).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
        assert(cos90rounded == -.45)     
        assert(TrigUtils.cosDegrees(0) == 1)

      }
    }


    // 1.4 write tests for squared below
    "calling squared" should {
      "return the correct value for 10 and 20 squared" in {
        //Source for rounding https://stackoverflow.com/questions/11106886/scala-doubles-and-precision
        assert(TrigUtils.squared(10) == 100)   
        assert(TrigUtils.squared(20) == 400)   
     
      }
    }

  }
}
