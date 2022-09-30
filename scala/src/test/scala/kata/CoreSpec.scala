package kata

import org.scalatest._
import wordspec._
import matchers.must._

class CoreSpec extends AnyWordSpec with Matchers {

  "increment" must {
    "return an integer that is 1 larger that the input" when {
      "given an integer" in {
        val core = new Core

        val testValue = 1
        val result = core.increment(testValue)

        (result - testValue) mustBe 1
      }
    }
  }

  "interpolate" must {
    "return a string when a string is provided" when {
      "given a blank string, then the result should be an empty string" in {
        val core = new Core

        val testString = ""
        val result = core.interpolate(testString)

        result mustBe ""
      }

      "given an empty map with a wildcard" in {
        val core = new Core

        val result = core.interpolate("Hello $name$", Map.empty)

        result mustBe "Hello $name$"
      }

      // do we want to introduce arbitrary inputs using the scalacheck library?
      "given a populated map and a key with no wildcard, then the result should be the same as the input" in {
        val core = new Core

        val result = core.interpolate("Hello world", Map("Hello name" -> "Hello name"))

        result mustBe "Hello name"

      }
    }


    "given a full string" ignore {
      val core = new Core

      val result = core.interpolate("$temp$", Map("temp" -> "temporary"))

      result mustBe "temporary"
    }
  }

  "findWildcards" must {
    "given a string containing a wildcard, it should find the wildcard" in {
      val core = new Core 

      var result = core.findWildcards("Test $hello$")

      result mustBe 5 
    }
  }

  "findWildcardLength" must {
    "given a string containing a wildcard, it should find the number of the characters" in {
      val core = new Core 
      var result = core.findWildcardLength("Test $hello$")

      result mustBe 5
    }
  }

}
