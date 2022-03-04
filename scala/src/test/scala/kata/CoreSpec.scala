package kata

import org.scalatest._
import wordspec._
import matchers.must._

class CoreSpec extends AnyWordSpec with Matchers {

  "addition" must {
    "return an integer that is the some of the inputs" when {
      "given '15+2''" in {
        val calculator = new Calculator

        val inputString = "15+2"
        val expectResponse = 17
        val result = calculator.calculate(inputString)

        result mustBe expectResponse

      }
      "given '10+2''" in {
        val calculator = new Calculator

        val inputString = "10+2"
        val expectResponse = 12
        val result = calculator.calculate(inputString)

        result mustBe expectResponse
      }

      "given '10+2''" in {
        val calculator = new Calculator

        val inputString = "10+2"
        val expectResponse = 12
        val result = calculator.determineInputs(inputString)

        result mustBe expectResponse
      }
    }
  }

}
