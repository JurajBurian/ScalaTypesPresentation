import sbt.Keys._
import com.typesafe.sbt.SbtSite.SiteKeys._
import sbt.Project.projectToRef

lazy val scalaSettings = Seq(scalaVersion := "2.11.7")

lazy val examples = project
		.settings(moduleName := "examples")
		.settings(scalaSettings)


lazy val docs = project
		.settings(moduleName := "docs")
		.settings(site.settings)
		.settings(tutSettings)
		.settings(scalaSettings)
		.settings(site.addMappingsToSiteDir(tut, "tut")).dependsOn(examples)
