name := """reactive-lab3"""

version := "1.2"

scalaVersion := "2.13.6"

val akkaVersion = "2.6.16"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed"         % akkaVersion,
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion % "test",
  "org.scalatest"     %% "scalatest"                % "3.2.9" % "test",
  "ch.qos.logback"    % "logback-classic"           % "1.2.6"
)
