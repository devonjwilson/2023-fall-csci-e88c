package org.cscie88c.week5

import org.cscie88c.testutils.{ StandardTest }
import Streams.Dog

class StreamsTest extends StandardTest {

  // Bonus problem unit tests
  //Bonus 1
  "calling dogs" should {
    "return correct results" in {
      assert(Streams.dogs.take(5).size==5)
      Streams.dogs.take(5).foreach(println)
    }
  }

}
