package org.cscie88c.week2

// write the class UniversityEmployee below
class UniversityEmployee(val name: String, val email: String) {
  def displayString: String =
    s"Name: ${name}, Email: ${email}"
}
