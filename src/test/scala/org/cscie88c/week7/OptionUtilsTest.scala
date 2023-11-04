package org.cscie88c.week7

import org.cscie88c.testutils.{ StandardTest }
import scala.util.{Try, Success, Failure}

class OptionUtilsTest extends StandardTest {
  "OptionUtils" when {
    //Problem 1.4
    "calling fileCharCount" should {
      "return the correct number of characters in a valid file" in {
        val test = OptionUtils.fileCharCount("data/dirty-retail-data-sample.csv")
        println(test)
        assert (test == Success(195))
      }
    }

    //Problem 1.5
    "calling charCountString" should {
      "return the correct number of characters (in string format) in a valid file" in {
        val existing_file_test = OptionUtils.charCountAsString("data/dirty-retail-data-sample.csv")
        println(existing_file_test)
        assert (existing_file_test == "Success: 195")
   }
      "return the error message for a non existent file file" in {
        val non_existent_file_test = OptionUtils.charCountAsString("data/dirty-retail-data-sample.csv-x")
        println(non_existent_file_test)
        assert (non_existent_file_test == "error opening file")
      }
    }


  }

}
