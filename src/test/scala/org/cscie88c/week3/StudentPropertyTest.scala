package org.cscie88c.week3
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks
import org.scalacheck._

class StudentPropertyTest
    extends AnyFunSuite
    with Matchers
    with ScalaCheckPropertyChecks {

  val studentGen: Gen[Student] = for {
    studentName <- Gen.oneOf("Alex", "Jin", "LeBron", "Jim")
    studentEmail <- Gen.oneOf(
      "Alex@gmail.com",
      "Jin@gmail.com",
      "LeBron@gmail.com",
      "Jim@gmail.com"
    )
    studentSubject <- Gen.oneOf("Physics", "Math", "Spanish", "History")
    studentScore <- Gen.choose(1, 100)
  } yield Student(studentName, studentEmail, studentSubject, studentScore)

  // complete the student list generator below if attempting bonus problem
  // val studentListGen: Gen[List[Student]] = ???

  test("description contains name and email") {
    val nameEmailProp = Prop.forAll(studentGen) { (student: Student) =>
      val studentEmail = student.email
      val studentName = student.name
      val emailBool = student.description.contains(studentEmail)
      val nameBool = student.description.contains(studentName)
      emailBool && nameBool
    }
    nameEmailProp.check()
  }
}
