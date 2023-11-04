package org.cscie88c.week2

import org.cscie88c.testutils.{StandardTest}

// write unit tests for University employee below
class UniversityEmployeeTest extends StandardTest {
  "UniversityEmployee" when {
    "instantiated" should {
      "Verifies name of employee" in {
        val john = new UniversityEmployee("John", "j@harvard.edu")
        john.name shouldBe "John"
      }
      "Verifies email of employee" in {
        val lee = new UniversityEmployee("lee", "l@harvard.edu")
        lee.email shouldBe "l@harvard.edu"
      }
      "Verifies name and email of employee" in {
        val devon = new UniversityEmployee("Devon", "dw@harvard.edu")
        devon.displayString shouldBe "Name: Devon, Email: dw@harvard.edu"
      }

    }

  }
}
