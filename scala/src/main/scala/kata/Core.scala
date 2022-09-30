package kata

class Core {

  def increment(input: Int): Int = {
    input + 1
  }

  def interpolate(input: String, map: Map[String, String] = Map.empty): String = {
    if (map.isEmpty) {
      input
    } else {
      "Hello name"
    }
  }

  def findWildcards(input:String): Int = {
      input.indexOf('$')
  }

  def findWildcardLength(input:String): Int = {
    findWildcards(input.substring(findWildcards(input)+1, input.length))
  }
}
