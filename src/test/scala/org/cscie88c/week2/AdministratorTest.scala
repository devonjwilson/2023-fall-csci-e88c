package org.cscie88c.week2

import org.cscie88c.testutils.{StandardTest}

// write unit tests for Administrator below
class AdministratorTest extends StandardTest {

  "Administrator" when {
    "instantiated" should {
      "Verify name, email and budget of Faculty member bridget" in {
        val bridget =
          new Administrator("Bridget Jones", "b@harvard.edu", 1000000)
        bridget.displayString shouldBe "Name: Bridget Jones, Email: b@harvard.edu, Budget: 1000000"
      }
      "Verify name, email and budget of Faculty member ryan" in {
        val ryan = new Administrator("Ryan Scott", "r@harvard.edu", 10000000)
        ryan.displayString shouldBe "Name: Ryan Scott, Email: r@harvard.edu, Budget: 10000000"
      }
    }
  }
}
