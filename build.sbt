name := "TestAmplifierDemo"

version := "0.1"

scalaVersion := "2.12.7"

libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.5" % "test"

libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-actor" % "2.5.18",
    "com.typesafe.akka" %% "akka-testkit" % "2.5.18" % Test
)