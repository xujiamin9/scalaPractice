val scala3Version = "3.5.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "hello-world",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test
    libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.1"
  )
