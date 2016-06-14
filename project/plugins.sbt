addSbtPlugin("com.typesafe.play" % "interplay" % sys.props.get("interplay.version").getOrElse("1.1.2"))
addSbtPlugin("com.typesafe.play" % "play-docs-sbt-plugin" % sys.props.getOrElse("play.version", "2.5.0"))

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0")
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-M12")
