package org.cscie88c.week2

import org.cscie88c.testutils.{StandardTest}

// write unit tests for Student below

class StudentTest extends StandardTest {
  "Student" when {
    "instantiated" should {
      "Verify info of Emmy" in {
        val emmy = Student("1,Emmy,Conrart,econrart0@gizmodo.com,Male,China")
        emmy.id shouldBe "1"
        emmy.firstName shouldBe "Emmy"
        emmy.lastName shouldBe "Conrart"
        emmy.email shouldBe "econrart0@gizmodo.com"
        emmy.gender shouldBe "Male"
        emmy.country shouldBe "China"
      }
      "Verify info of Marin" in {
        val emmy =
          Student("2,Marin,Blasoni,mblasoni1@edublogs.org,Female,United States")
        emmy.id shouldBe "2"
        emmy.firstName shouldBe "Marin"
        emmy.lastName shouldBe "Blasoni"
        emmy.email shouldBe "mblasoni1@edublogs.org"
        emmy.gender shouldBe "Female"
        emmy.country shouldBe "United States"
      }

      "Verify student names from China with student Names By Country" in {
        Student.studentNamesByCountry("China") shouldBe List(
          "Emmy Conrart",
          "Jesse Chismon",
          "Jocelyn Blaxlande"
        )
      }
      "Verify student names from US with student Names By Country" in {
        Student.studentNamesByCountry("United States") shouldBe List(
          "Marin Blasoni",
          "Delmore Scriver"
        )
      }
      "Verify quantity of students from US" in {
        Student.studentTotalsByCountry("United States") shouldBe 2
      }
      "Verify quantity of students from China" in {
        Student.studentTotalsByCountry("China") shouldBe 3
      }
    }
  }
}
