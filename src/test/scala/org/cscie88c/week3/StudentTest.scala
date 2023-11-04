package org.cscie88c.week3

import org.cscie88c.testutils.{StandardTest}

class StudentTest extends StandardTest {
  "Student Management System" when {
    "creating a student" should {
      "have properties - name, email, subject and score" in {
        val teststudent =
          Student("Marin", "mblasoni1@edublogs.org", "physics", 92)
        teststudent.name shouldBe "Marin"
        teststudent.email shouldBe "mblasoni1@edublogs.org"
        teststudent.subject shouldBe "physics"
        teststudent.score shouldBe 92
      }
    }

    "calculating subject averages" should {
      "Verify average physics score of 94 " in {
        val studentTestList = List(
          Student("Marin", "mblasoni1@edublogs.org", "physics", 92),
          Student("Marin", "mblasoni1@edublogs.org", "math", 88),
          Student("Tim", "tim@edublogs.org", "physics", 96)
        )
        assert(Student.averageScoreBySubject("physics", studentTestList) == 94)
      }
    }

    "calculating student averages" should {
      "Verify Marin physics score of 90 " in {
        val studentTestList = List(
          Student("Marin", "mblasoni1@edublogs.org", "physics", 92),
          Student("Marin", "mblasoni1@edublogs.org", "math", 88),
          Student("Tim", "tim@edublogs.org", "physics", 96)
        )

        val marin = Student("Marin", "mblasoni1@edublogs.org", "physics", 92)

        assert(Student.averageScoreByStudent(marin, studentTestList) == 90)
      }
    }
  }
}
