
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

object login1 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[LoginData],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /* login1 Template File */
  def apply/*2.2*/(loginForm: Form[LoginData])(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login")/*4.15*/ {_display_(Seq[Any](format.raw/*4.17*/("""
	"""),format.raw/*5.2*/("""<h2>Login</h2>
	
	<form method="get" action="/validateGet1">
		<h3>GET submission (not secure)</h3>
		<br>
		Username: <input type="text" name="username"></input>
		<br>
		Password: <input type="password" name="password"></input>
		<br>
		<input type="submit"></input>
	</form>
	
	<form method="post" action=""""),_display_(/*17.31*/routes/*17.37*/.TaskList1.validateLoginPost()),format.raw/*17.67*/("""">
		"""),_display_(/*18.4*/helper/*18.10*/.CSRF.formField),format.raw/*18.25*/("""
		"""),format.raw/*19.3*/("""<h3>Login with POST</h3>
		<br>
		Username: <input type="text" name="username" id="username-login"></input>
		<br>
		Password: <input type="password" name="password" id="password-login"></input>
		<br>
		<input type="submit"></input>
	</form>
	
	<form method="post" action=""""),_display_(/*28.31*/routes/*28.37*/.TaskList1.createUser()),format.raw/*28.60*/("""">
		"""),_display_(/*29.4*/helper/*29.10*/.CSRF.formField),format.raw/*29.25*/("""
		"""),format.raw/*30.3*/("""<h3>Create User</h3>
		<br>
		Username: <input type="text" name="username" id="username-create"></input>
		<br>
		Password: <input type="password" name="password" id="password-create"></input>
		<br>
		<input type="submit"></input>
	</form>

	"""),_display_(/*39.3*/helper/*39.9*/.form(action = routes.TaskList1.createUserForm())/*39.58*/ {_display_(Seq[Any](format.raw/*39.60*/("""
		"""),_display_(/*40.4*/helper/*40.10*/.CSRF.formField),format.raw/*40.25*/("""
		"""),format.raw/*41.3*/("""<h3>Create User with Play Form</h3>
		"""),_display_(/*42.4*/helper/*42.10*/.inputText(loginForm("Username"))),format.raw/*42.43*/("""
		"""),_display_(/*43.4*/helper/*43.10*/.inputPassword(loginForm("Password"))),format.raw/*43.47*/("""
		"""),format.raw/*44.3*/("""<div class="form-actions">
			<button type="submit">Login</button>
		</div>
	""")))}),format.raw/*47.3*/("""
	

""")))}),format.raw/*50.2*/("""
"""))
      }
    }
  }

  def render(loginForm:Form[LoginData],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)(request,flash)

  def f:((Form[LoginData]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => (request,flash) => apply(loginForm)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-02-04T03:03:42.118
                  SOURCE: C:/Users/Lenovo/Desktop/Play-Videos-master/server/app/views/login1.scala.html
                  HASH: dc47d318d668d58f689f96788ab1fd1a44c944b4
                  MATRIX: 789->28|966->112|993->114|1014->127|1053->129|1081->131|1418->441|1433->447|1484->477|1516->483|1531->489|1567->504|1597->507|1899->782|1914->788|1958->811|1990->817|2005->823|2041->838|2071->841|2341->1085|2355->1091|2413->1140|2453->1142|2483->1146|2498->1152|2534->1167|2564->1170|2629->1209|2644->1215|2698->1248|2728->1252|2743->1258|2801->1295|2831->1298|2939->1376|2974->1381
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|40->17|40->17|40->17|41->18|41->18|41->18|42->19|51->28|51->28|51->28|52->29|52->29|52->29|53->30|62->39|62->39|62->39|62->39|63->40|63->40|63->40|64->41|65->42|65->42|65->42|66->43|66->43|66->43|67->44|70->47|73->50
                  -- GENERATED --
              */
          