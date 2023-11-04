package org.cscie88c.week3

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks
import org.scalacheck._

class UtilFunctionsPropertyTest
    extends AnyFunSuite
    with Matchers
    with ScalaCheckPropertyChecks {

  val triplesGen: Gen[(Int, Int, Int)] = {
    val triplesPythList = UtilFunctions.pythTriplesUpto100
    val triplesPythListRandomSet = Gen.oneOf(triplesPythList)
    triplesPythListRandomSet
  }
//Pass in the triplesGen which will give one triplet, name that triplet data, run pythTest with data
  test("pyth triplets xyz yxz result test") {
    val tripletsAssociative = Prop.forAll(triplesGen) { data =>
      val newBool = UtilFunctions.pythTest(data._1, data._2, data._3)
      newBool
    }
    tripletsAssociative.check()
  }

  test("mult2 result test") {
    forAll { (x: Int, y: Int) =>
      UtilFunctions.mult2(x, y) shouldBe x * y
    }
  }

  test("distributive Property result test") {
    val distributiveProp = Prop.forAll { (a: Int, b: Int, c: Int) =>
      UtilFunctions.mult2(a, (b + c)) == UtilFunctions.mult2(
        a,
        b
      ) + UtilFunctions.mult2(a, c)
    }
    distributiveProp.check()
  }
  //Bonus Question Part 1 (x,y,z) is a pyth triple, verify (2x, 2y,2z) is also
    test("double pyth triple test") {
    val doublePythTrip = Prop.forAll { (x: Int, y: Int, z: Int) =>
      UtilFunctions.pythTest(x, y, z) == UtilFunctions.pythTest(2*x, 2*y, 2*z)
    }
    doublePythTrip.check()
  }
}
