package org.cscie88c.week7

import org.cscie88c.testutils.{ StandardTest }
import scala.util.{Try, Success, Failure}

class CustomerTransactionTest extends StandardTest {
  "CustomerTransaction" should {
    //Problem 2.2
    "load and clean raw CSV data file" in {
      val validTransaction = CustomerTransaction("id1,customer-A,84.5")
      assert(validTransaction == CustomerTransaction("id1,customer-A,84.5"))
      val invalidTransaction = CustomerTransaction("id1,customer-A,84.5x")
      assert(invalidTransaction == None)
    }
//Problem 2.4
      "Return a list of Valid Customer Transactions" in {
        val myValidList = CustomerTransaction.readFromCSVFile("data/dirty-retail-data-sample.csv")
        val customerOneBool = myValidList.contains(CustomerTransaction("CS5295","11-Feb-13",35))
        assert (customerOneBool == true)
        val customerTwoBool = myValidList.contains(CustomerTransaction("CS4768","15-Mar-15",39))
        assert (customerTwoBool == true)
        val customerThreeBool = myValidList.contains(CustomerTransaction("CS1217","16-Nov-11",99))
        assert (customerThreeBool == true)
        val customerFourBool = myValidList.contains(CustomerTransaction("CS1850","20-Nov-13",78))
        assert (customerFourBool == true)
        val customerFiveBool = myValidList.contains(CustomerTransaction("CS2724","06-Feb-12",93))
        assert (customerFiveBool == true)
    }
  }

}
