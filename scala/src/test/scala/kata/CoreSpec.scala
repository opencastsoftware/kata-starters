package kata

import org.scalatest._
import wordspec._
import matchers.must._

class CoreSpec extends AnyWordSpec with Matchers {

  "calculate" must {
    "throw an error" when {
      "right number is invalid" when {
        "foo" in {
          val core = new Core

          val input = "2 + foo"
          val result = core.calculate(input)

          result mustBe Left("Error: Invalid input in right value. Expected a number but found 'foo'")
        }

        "bar" in {
          val core = new Core

          val input = "2 + bar"
          val result = core.calculate(input)

          result mustBe Left("Error: Invalid input in right value. Expected a number but found 'bar'")
        }
      }

      "left number is invalid" when {
        "foo" in {
          val core = new Core

          val input = "foo + 2"
          val result = core.calculate(input)

          result mustBe Left("Error: Invalid input in left value. Expected a number but found 'foo'")
        }

        "bar" in {
          val core = new Core

          val input = "bar + 2"
          val result = core.calculate(input)

          result mustBe Left("Error: Invalid input in left value. Expected a number but found 'bar'")
        }
      }

      "both 'numbers' are invalid" when {
        "foo and bar" in {
          val core = new Core

          val input = "foo + bar"
          val result = core.calculate(input)

          result mustBe Left("Error: Invalid input in both left and right values. Expected two numbers but found 'foo' and 'bar'")
        }

        "bar and foo" in {
          val core = new Core

          val input = "bar + foo"
          val result = core.calculate(input)

          result mustBe Left("Error: Invalid input in both left and right values. Expected two numbers but found 'bar' and 'foo'")
        }
      }

      "operation is invalid" in {
        val core = new Core

        val input = "1 foo 2"
        val result = core.calculate(input)

        result mustBe Left("Error: Invalid input. Binary operator not supported")
      }
    }

    "add 2 numbers" when {
      "1 + 2" must {
        "return 3" in {
          val core = new Core

          val input = "1 + 2"
          val result = core.calculate(input)

          result mustBe Right(3)
        }
      }
    }
  }

}
