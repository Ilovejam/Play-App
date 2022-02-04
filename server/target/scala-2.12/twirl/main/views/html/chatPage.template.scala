
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

object chatPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: RequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("WebSocket Chat")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
  """),format.raw/*4.3*/("""<input type="hidden" id="ws-route" value=""""),_display_(/*4.46*/routes/*4.52*/.WebSocketChat.socket.absoluteURL()),format.raw/*4.87*/("""">
  <input type="text" id="chat-input" size="80">
  <br>
  <textarea id="chat-area" rows="15" cols="80"></textarea>
  <script src=""""),_display_(/*8.17*/routes/*8.23*/.Assets.versioned("javascript/chat.js")),format.raw/*8.62*/(""""></script>
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
                  DATE: 2022-02-04T03:03:42.034
                  SOURCE: C:/Users/Lenovo/Desktop/Play-Videos-master/server/app/views/chatPage.scala.html
                  HASH: 344232b1ac580c8648ff777b9c41c8e5c7e9a162
                  MATRIX: 745->1|888->51|915->53|945->75|984->77|1013->80|1082->123|1096->129|1151->164|1310->297|1324->303|1383->342
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|28->4|28->4|28->4|32->8|32->8|32->8
                  -- GENERATED --
              */
          