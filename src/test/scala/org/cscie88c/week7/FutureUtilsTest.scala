package org.cscie88c.week7

import org.cscie88c.testutils.{FuturesTest}
import scala.concurrent.Future

//DW - imported following two for 3.3 Unit tests
import scala.concurrent.{Await, Future}
import scala.concurrent.duration.DurationInt

class FutureUtilsTest extends FuturesTest {
  
  "Any future function" should {
    "return a future assertion" in {
      def futureAdd2(x: Int) = Future(x + 2)
      futureAdd2(5).map { x =>
        x shouldBe 7
      }
    }
  }

  "FutureFunctions" when {
    "calling creditScoreAPI" should {
      "return a credit score greater than 300" in {
        // 3.3 add unit tests below
        val creditScoreTest = FutureUtils.creditScoreAPI(applicantId = 50)
        assert (Await.result(creditScoreTest, 2.seconds) >= 300)
        assert (Await.result(creditScoreTest, 2.seconds) <= 800)


        val creditScoreTest2 = FutureUtils.creditScoreAPI(applicantId = 60)
        assert (Await.result(creditScoreTest, 2.seconds) >= 300)
        assert (Await.result(creditScoreTest, 2.seconds) <= 800)
      }
    }
  }

  //Problem 3.5
    "calling futureFactorial" should {
    "return the correct factorial sum" in {
      FutureUtils.futureFactorial(4).map(
        x => assert(x==24)  )
      }
    }
  
    //Problem 4.3
  "calling future Permutations" should {
    "return the correct value" in {
      val test = FutureUtils.futurePermuations(5,3)
      test.map({value =>
        println(value)
      assert(value==60)})
    }
  }

      //Problem 4.5
  "calling asyncAverageCreditScore" should {
    "return the average credit score " in {
      val idList = List(10,12)
      val actual = FutureUtils.asyncAverageCreditScore(idList)
      actual.map({avg=>
        print(avg)
        assert(avg>=300 && avg<=800)
    })
  }
}
}