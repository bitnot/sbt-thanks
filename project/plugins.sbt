addSbtPlugin("com.lucidchart"    % "sbt-scalafmt" % "1.12")
addSbtPlugin("com.typesafe.sbt"  % "sbt-git"      % "0.9.3")
addSbtPlugin("de.heikoseeberger" % "sbt-header"   % "3.0.2")
addSbtPlugin("org.xerial.sbt"    % "sbt-sonatype" % "2.3")

libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.25" // Needed by sbt-git
