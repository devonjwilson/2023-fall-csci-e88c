package org.cscie88c.week3

final case class Student(
    name: String,
    email: String,
    subject: String,
    score: Int
) {
  def description: String =
    s"name: ${name}, email: ${email}, subject: ${subject}, score: ${score}"
}

object Student {

  def validateEmail(student: Student): Boolean = {
    val studentEmail = student.email
    val atBool = studentEmail.contains("@")
    atBool
  }

  def averageScoreBySubject(
      subject: String,
      studentList: List[Student]
  ): Double = {
    val studentScoreList = for {
      i <- studentList
      if i.subject == subject
    } yield (i.score)
    val average_subject_score = (studentScoreList.sum) / studentScoreList.length
    average_subject_score
  }

  def averageScoreByStudent(
      student: Student,
      studentList: List[Student]
  ): Double = {
    val studentScoreList = for {
      i <- studentList
      if i.name == student.name && i.email == student.email
    } yield (i.score)
    val average_student_score = (studentScoreList.sum) / studentScoreList.length
    average_student_score
  }

}
