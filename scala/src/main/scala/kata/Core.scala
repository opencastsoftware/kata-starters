package kata

class Core {

  def isPalindrome(input: String): Int = {

    val validatedInput = input.replaceAll("\\s", "").toLowerCase

  
    if(validatedInput == validatedInput.reverse) {
      100
     } else  {
       val zippedStrings = validatedInput.zip(validatedInput.reverse)
     }
  }
}



