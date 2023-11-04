package org.cscie88c.week6

import org.cscie88c.testutils.{ StandardTest }

//Problem 2.4
class KafkaProducerTest extends StandardTest {
  "KafkaClient" should {
    "send a message to the default topic" in {
      // add your unit tests for KafkaClient.send here
      println(KafkaClient.sendStatusEvent("test") )
      assert (KafkaClient.sendStatusEvent ("test") == "This is the topic name: default-topic, and message: test" )
    }
  }
}
