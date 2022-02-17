import sbt._

object Dependencies {
  lazy val all = main ++ test

  private lazy val main = Seq.empty

  private lazy val test = Seq(
    "org.scalatest" %% "scalatest" % "3.2.9"
  ).map(_ % Test)

}
