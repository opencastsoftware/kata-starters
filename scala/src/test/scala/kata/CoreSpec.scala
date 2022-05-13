package kata

import org.scalatest._
import wordspec._
import matchers.must._

class CoreSpec extends AnyWordSpec with Matchers {

  val core = new Core

  "isPalindrome" must {
    
    "return 0 if the word is not a palindrome" in {
      core.isPalindrome("abc") mustBe 0
    }
    
    "return 100 if the word is a palindrome" in {
      core.isPalindrome("mum") mustBe 100
    }

    "return 100 if the palindrome has spaces" in {
      core.isPalindrome("race car") mustBe 100
    }

    "return 100 if the palindrome has uppercase letters" in {
      core.isPalindrome("Mum") mustBe 100
    }

    "return 50 if the palindrome has uppercase letters" in {
      core.isPalindrome("reed") mustBe 50
    }

    "return 66 if the palindrome has uppercase letters" in {
      core.isPalindrome("redden") mustBe 66
    }
  }
}

// Palindrome Strings
 
// A palindrome is a word, phrase, or sequence that reads the same backwards as forwards,  e.g. madam, radar or race car.
 
// Part 1: Is it a Palindrome?
// Write a function/method/class that when given a string, returns true or false to notify if the given string is a palindrome or not.
 
// Guidance: Don't aim for using a loop, it's unnecessarily complex and takes longer to implement! Working code is the measure of success here.
 
// Part 2: Formatting input
// Can you modify the functionality so that the input can contain spaces that should be ignored and capital letters should not cause a problem.
 
// Example: 
// Never odd or even - true
// Neither odd nor even - false
 
// Part 3: Change that contract!
// We are now interested in the words that aren't palindromes.
// So instead of returning a simple boolean to state if the input is palindromic or not.
// Refactor the method to return a percentage of how close something is to being a palindrome.
 
// Assumption: 
// - We do not care about decimal points of precision - ie return the integer value
 
// Examples:
// Redder - 100%
// a - 100%
// Never odd or even - 100%
// redden - 66%
// reed - 50%
// Reads - 0%
 
// radar - 100%
// radas - 80%
// xo radas ox - 88%
// Note: Odd numbered strings have a different rule! Note that in the two examples only 1 char needs to be changed to make the full string a palindrome.
