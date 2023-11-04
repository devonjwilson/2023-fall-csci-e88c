package org.cscie88c.week6

import org.cscie88c.testutils.{ StandardTest }

class EmployeeTest extends StandardTest {
  "Employee" should {
 
    "have a default sort order" in {
    val allEmployees = List(Employee("Scott", 23, 5000), Employee("Ong", 31, 8000), Employee("Suzah", 28, 7000))
    println(Employee.defaultSortEmployees(allEmployees))
    }

    "sort employees by salary" in {
      val allEmployees = List(Employee("Scott", 23, 5000), Employee("Ong", 31, 8000), Employee("Suzah", 28, 7000))
      val testBySalary = Employee.sortEmployeesBySalary(allEmployees)
      assert (List(Employee("Scott",23,5000), Employee("Suzah",28,7000), Employee("Ong",31,8000)) == testBySalary) 
       }
  }
}
