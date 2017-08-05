import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "coop.rchain",
      scalaVersion := "2.12.3",
      version      := "0.1.0-SNAPSHOT",
      scalafmtOnCompile in Compile := true
    )),
    name := "Rosette",
    libraryDependencies += scalaTest % Test
  )