
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

object version6Main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: RequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Task List 6")/*3.21*/{_display_(Seq[Any](format.raw/*3.22*/("""
  """),format.raw/*4.3*/("""<div id="contents">Version 6</div>

	<div id="login-section">
		<h2>Login:</h2>
		<br>
		Username: <input type="text" id="loginName">
		<br>
		Password: <input type="password" id="loginPass">
		<br>
		<button onclick="login()">Login</button><span id="login-message"></span>
		
		<h2>Create User:</h2>
		<br>
		Username: <input type="text" id="createName">
		<br>
		Password: <input type="password" id="createPass">
		<br>
		<button onclick="createUser()">Create User</button><span id="create-message"></span>
	</div>

	<div id="task-section" hidden>
		<h2>Task List</h2>
	
		<ul id="task-list">
		</ul>
		
		<input type="text" id="newTask"></input>
		<button onclick="addTask()">Add Task</button><span id="task-message"></span>
		
		<div>
			<button onclick="logout()">Logout</button>
		</div>
	</div>

  <input type="hidden" id="version6" value="">
  <input type="hidden" id="csrfToken" value=""""),_display_(/*39.47*/helper/*39.53*/.CSRF.getToken.value),format.raw/*39.73*/("""">
	<input type="hidden" id="validateRoute" value=""""),_display_(/*40.50*/routes/*40.56*/.TaskList5.validate()),format.raw/*40.77*/("""">
	<input type="hidden" id="tasksRoute" value=""""),_display_(/*41.47*/routes/*41.53*/.TaskList5.taskList()),format.raw/*41.74*/("""">
	<input type="hidden" id="createRoute" value=""""),_display_(/*42.48*/routes/*42.54*/.TaskList5.createUser()),format.raw/*42.77*/("""">
	<input type="hidden" id="deleteRoute" value=""""),_display_(/*43.48*/routes/*43.54*/.TaskList5.delete()),format.raw/*43.73*/("""">
	<input type="hidden" id="addRoute" value=""""),_display_(/*44.45*/routes/*44.51*/.TaskList5.addTask()),format.raw/*44.71*/("""">
  <input type="hidden" id="logoutRoute" value=""""),_display_(/*45.49*/routes/*45.55*/.TaskList5.logout()),format.raw/*45.74*/("""">
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
                  DATE: 2022-02-04T03:03:42.369
                  SOURCE: C:/Users/Lenovo/Desktop/Play-Videos-master/server/app/views/version6Main.scala.html
                  HASH: 8baaf660ba0652603dfa7dc1f2270a8cea66d859
                  MATRIX: 749->1|892->51|919->53|946->72|984->73|1013->76|1936->972|1951->978|1992->998|2071->1050|2086->1056|2128->1077|2204->1126|2219->1132|2261->1153|2338->1203|2353->1209|2397->1232|2474->1282|2489->1288|2529->1307|2603->1354|2618->1360|2659->1380|2737->1431|2752->1437|2792->1456
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|63->39|63->39|63->39|64->40|64->40|64->40|65->41|65->41|65->41|66->42|66->42|66->42|67->43|67->43|67->43|68->44|68->44|68->44|69->45|69->45|69->45
                  -- GENERATED --
              */
          