enablePlugins(ScalaJSPlugin)

name := "example-scala.js"

version := "1.0"

scalaVersion := "2.11.7"

//scalaJSUseRhino in Global := false

libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.0"
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.0" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")

skip in packageJSDependencies := false
jsDependencies +=
  "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"

jsDependencies += RuntimeDOM

persistLauncher in Compile := true
