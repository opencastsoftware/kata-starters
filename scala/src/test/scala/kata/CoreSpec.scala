package kata

import org.scalatest._
import wordspec._
import matchers.must._

class CoreSpec extends AnyWordSpec with Matchers {

  "readFile" must {
    "read a file" when {
      "given a file name" in {
        val file = "src/main/scala/resources/Dave.txt"
        val core = new Core
        val result: Seq[String] = core.readFile(file)
        result.length mustBe 7
        result.head mustBe "// This file contains 3 lines of code"
      }
    }
  }

  "findCommentedLines" must {
    "find the commented lines" when {
      "line starts with double slash" in {
        val lines = Seq(
          "// This is a comment",
          "this is some code",
          "this is some more code"
        )
        val core = new Core
        val result: Seq[String] = core.findCommentedLines(lines)
        result.length mustBe 1
        result.head mustBe "// This is a comment"
      }
    }
  }

}
