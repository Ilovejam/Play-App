
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

object version3Main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /* version3Main Template File */
  def apply/*2.2*/()(implicit request: RequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Task List (Version 3)")/*4.31*/ {_display_(Seq[Any](format.raw/*4.33*/("""
	"""),format.raw/*5.2*/("""<div id="contents">Version 3</div>

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

	
	
	<input type="hidden" id="csrfToken" value=""""),_display_(/*41.46*/helper/*41.52*/.CSRF.getToken.value),format.raw/*41.72*/("""">
	<input type="hidden" id="validateRoute" value=""""),_display_(/*42.50*/routes/*42.56*/.TaskList3.validate()),format.raw/*42.77*/("""">
	<input type="hidden" id="tasksRoute" value=""""),_display_(/*43.47*/routes/*43.53*/.TaskList3.taskList()),format.raw/*43.74*/("""">
	<input type="hidden" id="createRoute" value=""""),_display_(/*44.48*/routes/*44.54*/.TaskList3.createUser()),format.raw/*44.77*/("""">
	<input type="hidden" id="deleteRoute" value=""""),_display_(/*45.48*/routes/*45.54*/.TaskList3.delete()),format.raw/*45.73*/("""">
	<input type="hidden" id="addRoute" value=""""),_display_(/*46.45*/routes/*46.51*/.TaskList3.addTask()),format.raw/*46.71*/("""">
	<input type="hidden" id="logoutRoute" value=""""),_display_(/*47.48*/routes/*47.54*/.TaskList3.logout()),format.raw/*47.73*/("""">
	
	<script src=""""),_display_(/*49.16*/routes/*49.22*/.Assets.versioned("javascript/version3.js")),format.raw/*49.65*/(""""></script>
	<!-- <script src=""""),_display_(/*50.21*/routes/*50.27*/.TaskList2.generatedJS()),format.raw/*50.51*/(""""></script> -->
""")))}),format.raw/*51.2*/("""
"""))
      }
    }
  }

  def render(request:RequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply()(request,flash)

  def f:(() => (RequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = () => (request,flash) => apply()(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-02-04T03:03:42.246
                  SOURCE: C:/Users/Lenovo/Desktop/Play-Videos-master/server/app/views/version3Main.scala.html
                  HASH: 9e9abb5f400c4d58c2091bdc453c0b50b74648a0
                  MATRIX: 777->34|920->84|947->86|984->115|1023->117|1051->119|1930->971|1945->977|1986->997|2065->1049|2080->1055|2122->1076|2198->1125|2213->1131|2255->1152|2332->1202|2347->1208|2391->1231|2468->1281|2483->1287|2523->1306|2597->1353|2612->1359|2653->1379|2730->1429|2745->1435|2785->1454|2832->1474|2847->1480|2911->1523|2970->1555|2985->1561|3030->1585|3077->1602
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|64->41|64->41|64->41|65->42|65->42|65->42|66->43|66->43|66->43|67->44|67->44|67->44|68->45|68->45|68->45|69->46|69->46|69->46|70->47|70->47|70->47|72->49|72->49|72->49|73->50|73->50|73->50|74->51
                  -- GENERATED --
              */
          