package kata

class Core {

  def isPalindrome(input: String): Int = {

    val validatedInput = input.replaceAll("\\s", "").toLowerCase


    if (validatedInput == validatedInput.reverse) {
      100
    } else {
      val matchedStrings = validatedInput.zip(validatedInput.reverse).filter(t => t._1 == t._2)
      if (matchedStrings.length > 1) ((matchedStrings.length.toFloat/validatedInput.length.toFloat)*100).intValue()
      else 0
    }

  }
}



