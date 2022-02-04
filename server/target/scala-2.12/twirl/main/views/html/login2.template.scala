
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

object login2 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /* login2 Template File */
  def apply/*2.2*/()(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<h2>Login:</h2>
<br>
Username: <input type="text" id="loginName">
<br>
Password: <input type="password" id="loginPass">
<br>
<button onclick="login()">Login</button>

<h2>Create User:</h2>
<br>
Username: <input type="text" id="createName">
<br>
Password: <input type="password" id="createPass">
<br>
<button onclick="createUser()">Create User</button>"""))
      }
    }
  }

  def render(request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply()(request)

  def f:(() => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = () => (request) => apply()(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-02-04T03:03:42.134
                  SOURCE: C:/Users/Lenovo/Desktop/Play-Videos-master/server/app/views/login2.scala.html
                  HASH: 3b4986b449cbad8d80eedf0f5fb43767345156e4
                  MATRIX: 759->28|888->64|915->65
                  LINES: 21->2|26->3|27->4
                  -- GENERATED --
              */
          