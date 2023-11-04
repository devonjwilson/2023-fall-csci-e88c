package org.cscie88c.week6

import org.cscie88c.testutils.{ StandardTest }

class AddableTypeclassTest extends StandardTest {
  
  "AddableAggregator" should {
    "sum a list of integers" in {
    val intList = List(1,2,8,10)
    val actual = AddableAggregator.sumWithAddable(intList)
    assert (actual == 21)
    }
    "sum a list of booleans" in {
      val boolList = List (false, true, false)
      val actual = AddableAggregator.sumWithAddable(boolList)
      assert(actual)
    }
    "sum a list of employees" in {
      val employees = List(
        Employee("d", 100, 15000),
        Employee("f", 45, 7000),
        Employee("a", 30, 5000),
        Employee("c", 20, 2000)
      )
        val actual  = AddableAggregator.sumWithAddable(employees)
        val expected = Employee("d f a c", 195, 29000)
        assert(actual==expected)
    }
  }
}
