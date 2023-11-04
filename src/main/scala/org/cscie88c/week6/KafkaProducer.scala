package org.cscie88c.week6

// Problem 2.1 define trait KafkaProducer below
trait KafkaProducer {
    def send(message: String): String = 
      s"This is Kafka's Message: $message"
    }

// Problem 2.3 define the companion object KafkaProducer below
//DW Name val is defaultKafkaProducer: output type is Simple Kafka Producer

object KafkaProducer{
  implicit val defaultKafkaProducer:  SimpleKafkaProducer = new SimpleKafkaProducer("default-topic")
}

// Problem 2.2 define the case class SimpleKafkaProducer below

case class SimpleKafkaProducer(topic: String) extends KafkaProducer {
    //Don't pass in topic below, because it has it passed in when creating the case class
    override def send(message: String): String = {
        s"This is the topic name: $topic, and message: $message"
    }
}

// Problem 2.4 - uncomment the lines below once you have implemented KafkaProducer and SimpleKafkaProducer
object KafkaClient {
  // sends a status message to kafka
  def sendStatusEvent(status: String)(implicit kafkaProducer: KafkaProducer) = {
    kafkaProducer.send(status) // use the implicit KafkaProducer provided
  }  
}

