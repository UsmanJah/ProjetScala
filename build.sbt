name := """MonprojetScala"""
organization := "com.github.UsmanJah"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.6"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"
scalaVersion := "2.13.6" // or any other Scala version >= 2.11.12
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.1.0"
// This is an application with a main method
scalaJSUseMainModuleInitializer := true
// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.github.UsmanJah.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.github.UsmanJah.binders._"
