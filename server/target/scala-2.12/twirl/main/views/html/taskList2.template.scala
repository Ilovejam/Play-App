
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object taskList2 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Seq[String],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /* taskList2 Template File */
  def apply/*2.2*/(tasks: Seq[String])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<h2>Task List</h2>
	
<ul>
	"""),_display_(/*7.3*/for((task, i) <- tasks.zipWithIndex) yield /*7.39*/ {_display_(Seq[Any](format.raw/*7.41*/("""
		"""),format.raw/*8.3*/("""<li onclick="deleteTask("""),_display_(/*8.28*/i),format.raw/*8.29*/(""")">"""),_display_(/*8.33*/task),format.raw/*8.37*/("""</li>
	""")))}),format.raw/*9.3*/("""
"""),format.raw/*10.1*/("""</ul>

<input type="text" id="newTask"></input>
<button onclick="addTask()">Add Task</button>

<div>
	<a href=""""),_display_(/*16.12*/routes/*16.18*/.TaskList2.logout()),format.raw/*16.37*/("""">Logout</a>
</div>"""))
      }
    }
  }

  def render(tasks:Seq[String],request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(tasks)(request)

  def f:((Seq[String]) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (tasks) => (request) => apply(tasks)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-02-04T03:03:42.193
                  SOURCE: C:/Users/Lenovo/Desktop/Play-Videos-master/server/app/views/taskList2.scala.html
                  HASH: 026c211c6836e940e2edf8fde05a534293d0d9d9
                  MATRIX: 777->31|924->85|951->86|1004->114|1055->150|1094->152|1123->155|1174->180|1195->181|1225->185|1249->189|1286->197|1314->198|1453->310|1468->316|1508->335
                  LINES: 21->2|26->3|27->4|30->7|30->7|30->7|31->8|31->8|31->8|31->8|31->8|32->9|33->10|39->16|39->16|39->16
                  -- GENERATED --
              */
          