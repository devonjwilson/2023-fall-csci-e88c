package org.cscie88c.week6

final case class Employee(name: String, age: Int, salary: Int)

object Employee {
  //Problem 3.1
  implicit val employeeOrdering: Ordering[Employee] = {
    Ordering.by[Employee, (String)](employee => (employee.name))
    }
  //Problem 3.2
    def defaultSortEmployees(employees: List[Employee]): List[Employee] = {
      employees.sorted(employeeOrdering)
    }

  //Problem 3.3
    def sortEmployeesBySalary(employees: List[Employee]): List[Employee] = {
      implicit val employeeSalaryOrdering: Ordering[Employee] = {
    Ordering.by[Employee, (Int)](employee => (employee.salary))
    }
      employees.sorted(employeeSalaryOrdering)
    }

    //Problem 5.2
    implicit val employeeAddableTypeclass: AddableTypeclass[Employee] = {
      def addTwoValues(a:Employee, b:Employee): Employee = {
        Employee(a.name + " " + b.name, a.age+b.age, a.salary+b.salary)
      }
      addTwoValues 
    }

  }
  


  
