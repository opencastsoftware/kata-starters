import Dependencies._

ThisBuild / scalaVersion := "2.13.7"
ThisBuild / version := "0.1.0"
ThisBuild / organization := "com.opencastsoftware"
ThisBuild / organizationName := "Opencast Software"

lazy val root = (project in file("."))
  .settings(
    name := "Opencast kata template for Scala",
    libraryDependencies ++= all
  )
