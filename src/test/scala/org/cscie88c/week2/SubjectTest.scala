package org.cscie88c.week2

import org.cscie88c.testutils.{StandardTest}

// write unit tests for Subject below

class SubjectTest extends StandardTest {
  "Subject" when {
    "instantiated" should {
      "Verify info of Math" in {
        val math = Subject("3,Math,true")
        math.id shouldBe "3"
        math.name shouldBe "Math"
        math.isSTEM shouldBe true
      }
      "Verify info of English" in {
        val english = Subject("4,English,false")
        english.id shouldBe "4"
        english.name shouldBe "English"
        english.isSTEM shouldBe false
      }
    }
  }
}
