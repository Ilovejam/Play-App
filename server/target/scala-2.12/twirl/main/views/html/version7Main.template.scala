
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

object version7Main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: RequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Task List 7")/*3.21*/{_display_(Seq[Any](format.raw/*3.22*/("""
  """),format.raw/*4.3*/("""<div id="react-root"></div>
  <input type="hidden" id="version7" value="">
  <input type="hidden" id="csrfToken" value=""""),_display_(/*6.47*/helper/*6.53*/.CSRF.getToken.value),format.raw/*6.73*/("""">
	<input type="hidden" id="validateRoute" value=""""),_display_(/*7.50*/routes/*7.56*/.TaskList5.validate()),format.raw/*7.77*/("""">
	<input type="hidden" id="tasksRoute" value=""""),_display_(/*8.47*/routes/*8.53*/.TaskList5.taskList()),format.raw/*8.74*/("""">
	<input type="hidden" id="createRoute" value=""""),_display_(/*9.48*/routes/*9.54*/.TaskList5.createUser()),format.raw/*9.77*/("""">
	<input type="hidden" id="deleteRoute" value=""""),_display_(/*10.48*/routes/*10.54*/.TaskList5.delete()),format.raw/*10.73*/("""">
	<input type="hidden" id="addRoute" value=""""),_display_(/*11.45*/routes/*11.51*/.TaskList5.addTask()),format.raw/*11.71*/("""">
  <input type="hidden" id="logoutRoute" value=""""),_display_(/*12.49*/routes/*12.55*/.TaskList5.logout()),format.raw/*12.74*/("""">
""")))}))
      }
    }
  }

  def render(request:RequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply()(request,flash)

  def f:(() => (RequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = () => (request,flash) => apply()(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-02-04T03:03:42.382
                  SOURCE: C:/Users/Lenovo/Desktop/Play-Videos-master/server/app/views/version7Main.scala.html
                  HASH: aa5e250b60acb60af6f5c0c5b2f6a4449f8191ec
                  MATRIX: 749->1|892->51|919->53|946->72|984->73|1013->76|1160->197|1174->203|1214->223|1292->275|1306->281|1347->302|1422->351|1436->357|1477->378|1553->428|1567->434|1610->457|1687->507|1702->513|1742->532|1816->579|1831->585|1872->605|1950->656|1965->662|2005->681
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|30->6|30->6|30->6|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12
                  -- GENERATED --
              */
          