
scalaVersion := "2.11.7"

addCompilerPlugin("com.github.ghik" % "silencer-plugin" % "0.3")

libraryDependencies += "com.github.ghik" % "silencer-lib" % "0.3"

addCommandAlias("replicate", ";clean ;coverage ;compile")

