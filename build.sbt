name := "sbt-demo"

version := "0.1"

scalaVersion := "2.13.4"

libraryDependencies += "org.codehaus.jackson" % "jackson-mapper-asl" % "1.9.13"

libraryDependencies += "com.fasterxml.jackson.dataformat" % "jackson-dataformat-xml" % "2.12.1"

assemblyMergeStrategy in assembly := {
 case PathList("META-INF", xs @ _*) => MergeStrategy.discard
 case x => MergeStrategy.first
}
