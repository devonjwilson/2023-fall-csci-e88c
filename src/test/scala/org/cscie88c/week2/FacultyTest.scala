package org.cscie88c.week2

import org.cscie88c.testutils.{StandardTest}

// write unit tests for Faculty below
class FacultyTest extends StandardTest {

  "UniversityEmployee" when {
    "instantiated" should {
      "Verifies name, email and CourseID of Faculty member adam" in {
        val adam =
          new Faculty("Adam Jones", "aj@harvard.edu", "California History")
        adam.displayString shouldBe "Name: Adam Jones, Email: aj@harvard.edu, Course: California History"
      }
      "Verifies name, email and CourseID of Faculty member ogo" in {
        val ogo = new Faculty("Ogo Scott", "os@harvard.edu", "Nevada History")
        ogo.displayString shouldBe "Name: Ogo Scott, Email: os@harvard.edu, Course: Nevada History"
      }
    }
  }
}
