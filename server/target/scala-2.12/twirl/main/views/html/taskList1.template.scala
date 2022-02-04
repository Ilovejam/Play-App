
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

object taskList1 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Seq[String],RequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /* taskList1 Template File */
  def apply/*2.2*/(tasks: Seq[String])(implicit request: RequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Task List")/*4.19*/ {_display_(Seq[Any](format.raw/*4.21*/("""
	"""),format.raw/*5.2*/("""<h2>Task List</h2>
	
	<ul>
		"""),_display_(/*8.4*/for((task, i) <- tasks.zipWithIndex) yield /*8.40*/ {_display_(Seq[Any](format.raw/*8.42*/("""
			"""),format.raw/*9.4*/("""<li>"""),_display_(/*9.9*/task),format.raw/*9.13*/("""</li>
			<form method="post" action=""""),_display_(/*10.33*/routes/*10.39*/.TaskList1.deleteTask),format.raw/*10.60*/("""">
				"""),_display_(/*11.6*/helper/*11.12*/.CSRF.formField),format.raw/*11.27*/("""
				"""),format.raw/*12.5*/("""<input type="hidden" name="index" value=""""),_display_(/*12.47*/i),format.raw/*12.48*/(""""/>
				<input type="submit" value="Delete" id="delete-"""),_display_(/*13.53*/i),format.raw/*13.54*/(""""/>
			</form>
		""")))}),format.raw/*15.4*/("""
	"""),format.raw/*16.2*/("""</ul>
	
	<form method="post" action=""""),_display_(/*18.31*/routes/*18.37*/.TaskList1.addTask()),format.raw/*18.57*/("""">
		"""),_display_(/*19.4*/helper/*19.10*/.CSRF.formField),format.raw/*19.25*/("""
		"""),format.raw/*20.3*/("""<input type="text" name="newTask"></input>
		<input type="submit"></input>
	</form>
	
	<div>
		<a href=""""),_display_(/*25.13*/routes/*25.19*/.TaskList1.logout()),format.raw/*25.38*/("""" id="logout">Logout</a>
	</div>
""")))}),format.raw/*27.2*/("""
"""))
      }
    }
  }

  def render(tasks:Seq[String],request:RequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(tasks)(request,flash)

  def f:((Seq[String]) => (RequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (tasks) => (request,flash) => apply(tasks)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-02-04T03:03:42.175
                  SOURCE: C:/Users/Lenovo/Desktop/Play-Videos-master/server/app/views/taskList1.scala.html
                  HASH: 152a1868d9302ac7c9094c4aaec21df5d5142b3e
                  MATRIX: 783->31|944->99|971->101|996->118|1035->120|1063->122|1118->152|1169->188|1208->190|1238->194|1268->199|1292->203|1357->241|1372->247|1414->268|1448->276|1463->282|1499->297|1531->302|1600->344|1622->345|1705->401|1727->402|1775->420|1804->422|1869->460|1884->466|1925->486|1957->492|1972->498|2008->513|2038->516|2170->621|2185->627|2225->646|2289->680
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|31->8|31->8|31->8|32->9|32->9|32->9|33->10|33->10|33->10|34->11|34->11|34->11|35->12|35->12|35->12|36->13|36->13|38->15|39->16|41->18|41->18|41->18|42->19|42->19|42->19|43->20|48->25|48->25|48->25|50->27
                  -- GENERATED --
              */
          