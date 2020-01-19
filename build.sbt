import Dependencies._

lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      organization := "me.boldyrev",
      scalaVersion := "2.13.1",
      version := "0.0.1-SNAPSHOT"
    )
  ),
  name := "Template Project",
  libraryDependencies ++= Seq(
    commons,
    guava,
    httpClient,
    jacksonCore,
    jacksonDataBind
  ),
  libraryDependencies ++= Seq(
    junit % Test,
    junitInterface % Test,
    hamcrest % Test,
    mockito % Test,
    equalsverifier % Test,
    scalaTest % Test
  ),
  libraryDependencies ++= Seq(akkaActor, akkaStream, akkaHttp),
  libraryDependencies ++= Seq(
    akkaTestkit % Test,
    akkaStreamTestkit % Test,
    akkaHttpTestkit % Test
  ),
  testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-q", "-v"))
)
