package kata

class Core {

  def calculate(input: String): Either[String, Int] = {
    println(input.head.toInt)

    val pattern = "(.+) (.+) (.+)".r
    val pattern(leftValue, operation, rightValue) = input

    (leftValue.toIntOption, rightValue.toIntOption) match {
      case (None, Some(_)) => Left(s"Error: Invalid input in left value. Expected a number but found '$leftValue'")
      case (Some(_), None) => Left(s"Error: Invalid input in right value. Expected a number but found '$rightValue'")
      case (None, None) => Left(s"Error: Invalid input in both left and right values. Expected two numbers but found '$leftValue' and '$rightValue'")
      case (Some(leftValue), Some(rightValue)) =>
        operation match {
          case "+" => Right(leftValue + rightValue)
          case _ => Left("Error: Invalid input. Binary operator not supported")
        }
    }
  }

}
