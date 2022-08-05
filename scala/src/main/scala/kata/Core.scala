package kata

import scala.io.Source

class Core {

  def readFile(file: String): Seq[String] = {
    val source = Source.fromFile(file)
    val lines = source.getLines().toSeq
    source.close()
    lines
  }

  def findCommentedLines(lines: Seq[String]): Seq[String] = {
    lines.filter {
      x =>
        x.startsWith("//")
    }
  }

}
