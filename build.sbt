ThisBuild / organization := "ch.unibas.cs.gravis"
ThisBuild / version      := "0.1.0-SNAPSHOT"
ThisBuild / crossPaths := false
ThisBuild / autoScalaLibrary := false
ThisBuild / versionScheme := Some("semver-spec")
ThisBuild / homepage :=  Some(url("https://github.com/unibas-gravis/niftijio-maven"))
ThisBuild / licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))
ThisBuild / scmInfo := Some(
      ScmInfo(url("https://github.com/unibas-gravis/niftijio-maven"), "git@github.com:unibas-gravis/niftijio-maven.git")
    )
ThisBuild / developers := List(
      Developer("marcelluethi", "marcelluethi", "marcel.luethi@unibas.ch", url("https://github.com/marcelluethi"))
    )
ThisBuild / publishMavenStyle := true
ThisBuild / publishTo := Some(Opts.resolver.sonatypeSnapshots)


/*
 * dummy package to manage vtk.jar
 */   
lazy val niftijioJar = (project in file("niftijio"))
    .settings(
        name := "scalismo-niftijio",
        Compile / packageBin := baseDirectory.value / "lib"/ "niftijio.jar"
    )


