package org.cscie88c.week2

// complete the definition of the Student case class and companion object
final case class Student(
    id: String,
    firstName: String,
    lastName: String,
    email: String,
    gender: String,
    country: String
)

object Student {
  def apply(csvRow: String): Student = {
    val fields = csvRow.split(",")
    Student(
      id = fields(0),
      firstName = fields(1),
      lastName = fields(2),
      email = fields(3),
      gender = fields(4),
      country = fields(5)
    )
  }
  val allStudents: List[Student] = List(
    Student("1,Emmy,Conrart,econrart0@gizmodo.com,Male,China"),
    Student("2,Marin,Blasoni,mblasoni1@edublogs.org,Female,United States"),
    Student("3,Jesse,Chismon,jchismon2@hostgator.com,Male,China"),
    Student("4,Delmore,Scriver,dscriver3@boston.com,Male,United States"),
    Student("5,Jocelyn,Blaxlande, jblaxlande4@europa.eu,Female,China")
  )

  def firstLast(student: Student) = {
    student.firstName + " " + student.lastName
  }
  // x is each student object in the list
  def studentNamesByCountry(country: String): List[String] = {
    val studentsFromCountry = allStudents.filter(x => x.country == country)
    studentsFromCountry.map(firstLast)
  }

  def studentTotalsByCountry(country: String): Int = {
    val studentCountryCount = allStudents.filter(x => x.country == country)
    studentCountryCount.size
  }

}
