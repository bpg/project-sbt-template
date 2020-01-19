import sbt._

object Dependencies {
  val akkaVersion = "2.6.1"
  val akkaHttpVersion = "10.1.11"
  val jacksonVersion = "2.10.1"

  lazy val commons = "org.apache.commons" % "commons-lang3" % "3.9"
  lazy val guava = "com.google.guava" % "guava" % "28.1-jre"
  lazy val vavr = "io.vavr" % "vavr" % "0.10.2"

  lazy val lombok = "org.projectlombok" % "lombok" % "1.18.10"
  lazy val httpClient = "org.apache.httpcomponents" % "httpclient" % "4.5.10"
  lazy val fluentApi = "org.apache.httpcomponents" % "fluent-hc" % "4.5.10"
  lazy val jacksonCore = "com.fasterxml.jackson.core" % "jackson-core" % jacksonVersion
  lazy val jacksonDataBind = "com.fasterxml.jackson.core" % "jackson-databind" % jacksonVersion

  lazy val junit = "junit" % "junit" % "4.12"
  lazy val junitInterface = "com.novocode" % "junit-interface" % "0.11"
  lazy val hamcrest = "org.hamcrest" % "hamcrest-library" % "2.2"
  lazy val mockito = "org.mockito" % "mockito-core" % "3.2.4"
  lazy val equalsverifier = "nl.jqno.equalsverifier" % "equalsverifier" % "3.1.11"
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.8"

  lazy val akkaActor = "com.typesafe.akka" %% "akka-actor" % akkaVersion
  lazy val akkaStream = "com.typesafe.akka" %% "akka-stream" % akkaVersion
  lazy val akkaCluster = "com.typesafe.akka" %% "akka-cluster" % akkaVersion
  lazy val akkaClusterSharding = "com.typesafe.akka" %% "akka-cluster-sharding" % akkaVersion
  lazy val akkaDistributedData = "com.typesafe.akka" %% "akka-distributed-data" % akkaVersion
  lazy val akkaPersistence = "com.typesafe.akka" %% "akka-persistence" % akkaVersion
  lazy val akkaHttp = "com.typesafe.akka" %% "akka-http" % akkaHttpVersion

  lazy val akkaTestkit = "com.typesafe.akka" %% "akka-testkit" % akkaVersion
  lazy val akkaStreamTestkit = "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion
  lazy val akkaHttpTestkit = "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion
}
