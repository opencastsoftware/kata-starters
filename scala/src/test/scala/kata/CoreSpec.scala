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

}
