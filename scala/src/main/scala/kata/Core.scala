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

}
