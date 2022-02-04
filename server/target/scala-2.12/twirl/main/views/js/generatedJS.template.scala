
package views.js

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.js._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object generatedJS extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.JavaScriptFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.JavaScriptFormat.Appendable]](play.twirl.api.JavaScriptFormat) with _root_.play.twirl.api.Template0[play.twirl.api.JavaScriptFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.JavaScriptFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""$("#contents").load(""""),_display_(/*3.23*/routes/*3.29*/.TaskList2.login()),format.raw/*3.47*/("""")

function login() """),format.raw/*5.18*/("""{"""),format.raw/*5.19*/("""
	"""),format.raw/*6.2*/("""const username = $("#loginName").val();
	const password = $("#loginPass").val();
	$("#contents").load("/validate2?username=" + username + "&password=" + password);
"""),format.raw/*9.1*/("""}"""),format.raw/*9.2*/("""

"""),format.raw/*11.1*/("""function createUser() """),format.raw/*11.23*/("""{"""),format.raw/*11.24*/("""
	"""),format.raw/*12.2*/("""const username = $("#createName").val();
	const password = $("#createPass").val();
	$("#contents").load("/create2?username=" + username + "&password=" + password);
"""),format.raw/*15.1*/("""}"""),format.raw/*15.2*/("""

"""),format.raw/*17.1*/("""function deleteTask(index) """),format.raw/*17.28*/("""{"""),format.raw/*17.29*/("""
	"""),format.raw/*18.2*/("""$("#contents").load("/deleteTask2?index=" + index);
"""),format.raw/*19.1*/("""}"""),format.raw/*19.2*/("""

"""),format.raw/*21.1*/("""function addTask() """),format.raw/*21.20*/("""{"""),format.raw/*21.21*/("""
	"""),format.raw/*22.2*/("""const task = $("#newTask").val();
	$("#contents").load("/addTask2?task=" + encodeURIComponent(task));
"""),format.raw/*24.1*/("""}"""))
      }
    }
  }

  def render(): play.twirl.api.JavaScriptFormat.Appendable = apply()

  def f:(() => play.twirl.api.JavaScriptFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-02-04T03:03:42.077
                  SOURCE: C:/Users/Lenovo/Desktop/Play-Videos-master/server/app/views/generatedJS.scala.js
                  HASH: 2c5b660a79a0af2669a0a68bfc03518b7ef780c9
                  MATRIX: 748->1|850->4|877->5|925->27|939->33|977->51|1025->72|1053->73|1081->75|1271->239|1298->240|1327->242|1377->264|1406->265|1435->267|1626->431|1654->432|1683->434|1738->461|1767->462|1796->464|1875->516|1903->517|1932->519|1979->538|2008->539|2037->541|2166->643
                  LINES: 21->1|26->2|27->3|27->3|27->3|27->3|29->5|29->5|30->6|33->9|33->9|35->11|35->11|35->11|36->12|39->15|39->15|41->17|41->17|41->17|42->18|43->19|43->19|45->21|45->21|45->21|46->22|48->24
                  -- GENERATED --
              */
          