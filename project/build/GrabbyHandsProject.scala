import sbt._

class ConfiggyProject(info: ProjectInfo) extends DefaultProject(info) {
  val specs = "org.scala-tools.testing" %% "specs" % "1.6.5" % "test"
  val vscaladoc = "org.scala-tools" % "vscaladoc" % "1.1-md-3" % "compile"
  val junit = "junit" % "junit" % "4.7" % "test"

  override def compileOptions = super.compileOptions ++ Seq(CompileOption("-Xmigration"), CompileOption("-Xwarninit"))
}
