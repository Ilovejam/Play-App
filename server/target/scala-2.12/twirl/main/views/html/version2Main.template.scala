
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

object version2Main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,RequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /* version2Main Template File */
  def apply/*2.2*/(startRoute: String)(implicit request: RequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Task List (Version 2)")/*4.31*/ {_display_(Seq[Any](format.raw/*4.33*/("""
	"""),format.raw/*5.2*/("""<div id="contents"></div>
	
	<input type="hidden" id="csrfToken" value=""""),_display_(/*7.46*/helper/*7.52*/.CSRF.getToken.value),format.raw/*7.72*/("""">
	<input type="hidden" id="loginRoute" value=""""),_display_(/*8.47*/startRoute),format.raw/*8.57*/("""">
	<input type="hidden" id="validateRoute" value=""""),_display_(/*9.50*/routes/*9.56*/.TaskList2.validate()),format.raw/*9.77*/("""">
	<input type="hidden" id="createRoute" value=""""),_display_(/*10.48*/routes/*10.54*/.TaskList2.createUser()),format.raw/*10.77*/("""">
	<input type="hidden" id="deleteRoute" value=""""),_display_(/*11.48*/routes/*11.54*/.TaskList2.delete()),format.raw/*11.73*/("""">
	<input type="hidden" id="addRoute" value=""""),_display_(/*12.45*/routes/*12.51*/.TaskList2.addTask()),format.raw/*12.71*/("""">
	
	<script src=""""),_display_(/*14.16*/routes/*14.22*/.Assets.versioned("javascript/version2.js")),format.raw/*14.65*/(""""></script>
	<!-- <script src=""""),_display_(/*15.21*/routes/*15.27*/.TaskList2.generatedJS()),format.raw/*15.51*/(""""></script> -->
""")))}),format.raw/*16.2*/("""
"""))
      }
    }
  }

  def render(startRoute:String,request:RequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(startRoute)(request,flash)

  def f:((String) => (RequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (startRoute) => (request,flash) => apply(startRoute)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-02-04T03:03:42.226
                  SOURCE: C:/Users/Lenovo/Desktop/Play-Videos-master/server/app/views/version2Main.scala.html
                  HASH: a8c65f58132243431563abe9ea64ea9bae94f57d
                  MATRIX: 784->34|945->102|972->104|1009->133|1048->135|1076->137|1175->210|1189->216|1229->236|1304->285|1334->295|1412->347|1426->353|1467->374|1544->424|1559->430|1603->453|1680->503|1695->509|1735->528|1809->575|1824->581|1865->601|1912->621|1927->627|1991->670|2050->702|2065->708|2110->732|2157->749
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|30->7|30->7|30->7|31->8|31->8|32->9|32->9|32->9|33->10|33->10|33->10|34->11|34->11|34->11|35->12|35->12|35->12|37->14|37->14|37->14|38->15|38->15|38->15|39->16
                  -- GENERATED --
              */
          