
// https://github.com/ghik/silencer
val silencerVersion = "1.6.0"

libraryDependencies in Global ++= Seq(
  compilerPlugin("com.github.ghik" % "silencer-plugin" % silencerVersion cross CrossVersion.full),
  "com.github.ghik" % "silencer-lib" % silencerVersion % Provided cross CrossVersion.full
)

organization in ThisBuild := "com.example"
version in ThisBuild := "1.0-SNAPSHOT"

// the Scala version that will be used for cross-compiled libraries
scalaVersion in ThisBuild := "2.13.1"

lagomServiceGatewayAddress in ThisBuild := "localhost"

val macwire = "com.softwaremill.macwire" %% "macros" % "2.3.3" % "provided"
val scalaTest = "org.scalatest" %% "scalatest" % "3.1.1" % Test

lazy val `hello-world` = (project in file("."))
  .aggregate(`hello-world-api`,
             `hello-world-impl`,
             `hello-world-stream-api`,
             `hello-world-stream-impl`,
             `frontend`)

lazy val `hello-world-api` = (project in file("hello-world-api"))
  .settings(
    libraryDependencies ++= Seq(
      lagomScaladslApi
    )
  )

lazy val `hello-world-impl` = (project in file("hello-world-impl"))
  .enablePlugins(LagomScala)
  .settings(
    libraryDependencies ++= Seq(
      lagomScaladslPersistenceCassandra,
      lagomScaladslKafkaBroker,
      lagomScaladslTestKit,
      macwire,
      scalaTest
    )
  )
  .settings(lagomForkedTestSettings)
  .dependsOn(`hello-world-api`)

lazy val `hello-world-stream-api` = (project in file("hello-world-stream-api"))
  .settings(
    libraryDependencies ++= Seq(
      lagomScaladslApi
    )
  )

lazy val `hello-world-stream-impl` =
  (project in file("hello-world-stream-impl"))
    .enablePlugins(LagomScala)
    .settings(
      libraryDependencies ++= Seq(
        lagomScaladslTestKit,
        macwire,
        scalaTest
      )
    )
    .dependsOn(`hello-world-stream-api`, `hello-world-api`)

lazy val `frontend` = (project in file("frontend"))
  .enablePlugins(PlayScala, LagomPlay)
  .disablePlugins(PlayLayoutPlugin)
  .settings(
    libraryDependencies ++= Seq(
      lagomScaladslServer,
      lagomScaladslAkkaDiscovery,
      lagomScaladslTestKit,
      macwire,
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test,

      // https://github.com/webjars/bootstrap
      // https://github.com/webjars/bootstrap/releases
      "org.webjars" % "bootstrap" % "3.3.6",

      // https://github.com/webjars/webjars-play
      // https://github.com/webjars/webjars-play/releases
      "org.webjars" %% "webjars-play" % "2.8.0",

      // https://github.com/webjars/foundation
      // https://github.com/webjars/foundation/releases
      "org.webjars" % "foundation" % "6.4.3-1",

      // https://github.com/webjars/foundation-icon-fonts
      // https://github.com/webjars/foundation-icon-fonts/releases
      "org.webjars" % "foundation-icon-fonts" % "d596a3cfb3",

      // https://github.com/webjars/swagger-ui/releases
      "org.webjars" % "swagger-ui" % "3.23.8"
    ),
    // https://www.playframework.com/documentation/2.8.x/AssetsOverview#Reverse-routing-and-fingerprinting-for-public-assets
    pipelineStages := Seq(rjs, digest, gzip)
  )
  .dependsOn(`hello-world-api`,
    // For tests.
    `hello-world-impl`)
