package org.cscie88c.week5

import java.util.UUID
import scala.util.Random

object Streams {
  val rnd = new Random()
  def uuid: String = UUID.randomUUID.toString.replaceAll("-", "")

  case class Dog(name: String, age: Int, hasCurrentShots: Boolean)

  //Problem 4.1
  val mult5: LazyList[Int] = {
    LazyList.range(0,100,5)
  }

  //Problem 4.2
  val randIntStream: LazyList[Int] = {
     LazyList.continually(rnd.nextInt(15))
  }

  //Problem 4.3 
  val dogs: LazyList[Dog] = {
  val hasCurrentShots = List(true,false)
  val dogsStream = LazyList.iterate(Dog("dog-"+uuid, rnd.nextInt(15) ,hasCurrentShots(rnd.nextInt(2)))) (p=> 
    p.copy(name="dog-"+uuid, age=rnd.nextInt(15),hasCurrentShots=hasCurrentShots(rnd.nextInt(2))))
    dogsStream
  }

  //Problem 4.4
  def healthyDogs(dogs: LazyList[Dog]): LazyList[Dog] = {
    dogs.filter(dog=> dog.hasCurrentShots)
  }

//Problem 4.5
  def averageHealthyAge(allDogs: LazyList[Dog], sampleSize: Int): Double = {
    val totalAge = allDogs.take(sampleSize).filter(dog=>dog.hasCurrentShots).map(dog=>dog.age).sum
    totalAge/sampleSize.toDouble
  }
}
