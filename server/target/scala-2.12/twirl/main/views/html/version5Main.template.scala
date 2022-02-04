
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

object version5Main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: RequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Task List 5")/*3.21*/{_display_(Seq[Any](format.raw/*3.22*/("""
  """),format.raw/*4.3*/("""<input type="hidden" id="csrfToken" value=""""),_display_(/*4.47*/helper/*4.53*/.CSRF.getToken.value),format.raw/*4.73*/("""">
	<input type="hidden" id="validateRoute" value=""""),_display_(/*5.50*/routes/*5.56*/.TaskList5.validate()),format.raw/*5.77*/("""">
	<input type="hidden" id="tasksRoute" value=""""),_display_(/*6.47*/routes/*6.53*/.TaskList5.taskList()),format.raw/*6.74*/("""">
	<input type="hidden" id="createRoute" value=""""),_display_(/*7.48*/routes/*7.54*/.TaskList5.createUser()),format.raw/*7.77*/("""">
	<input type="hidden" id="deleteRoute" value=""""),_display_(/*8.48*/routes/*8.54*/.TaskList5.delete()),format.raw/*8.73*/("""">
	<input type="hidden" id="addRoute" value=""""),_display_(/*9.45*/routes/*9.51*/.TaskList5.addTask()),format.raw/*9.71*/("""">
  <input type="hidden" id="logoutRoute" value=""""),_display_(/*10.49*/routes/*10.55*/.TaskList5.logout()),format.raw/*10.74*/("""">
  
  <div id="react-root"></div>
  <script src=""""),_display_(/*13.17*/routes/*13.23*/.Assets.versioned("javascript/version5.js")),format.raw/*13.66*/(""""></script>
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
                  DATE: 2022-02-04T03:03:42.287
                  SOURCE: C:/Users/Lenovo/Desktop/Play-Videos-master/server/app/views/version5Main.scala.html
                  HASH: 2ca4b17d339a06fedc6fcc279b3dd9776dd77d73
                  MATRIX: 749->1|892->51|919->53|946->72|984->73|1013->76|1083->120|1097->126|1137->146|1215->198|1229->204|1270->225|1345->274|1359->280|1400->301|1476->351|1490->357|1533->380|1609->430|1623->436|1662->455|1735->502|1749->508|1789->528|1867->579|1882->585|1922->604|2001->656|2016->662|2080->705
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|28->4|28->4|28->4|29->5|29->5|29->5|30->6|30->6|30->6|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|37->13|37->13|37->13
                  -- GENERATED --
              */
          