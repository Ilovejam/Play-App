
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String)(implicit flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Play with Scala.js")/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""
	"""),format.raw/*4.2*/("""<h2>Play Framework Test Application</h2><br>
	
	<div class="card">
	  <div class="container">
	    <a href=""""),_display_(/*8.16*/routes/*8.22*/.TaskList1.login()),format.raw/*8.40*/(""""><b>Version 1</b></a> 
	    <p>Description about version 1</p> 
	  </div>
	</div>

	<div class="card">
	  <div class="container">
	    <a href=""""),_display_(/*15.16*/routes/*15.22*/.TaskList2.login()),format.raw/*15.40*/(""""><b>Version 2</b></a> 
	    <p>Description about version 1</p> 
	  </div>
	</div>

	<br>

		<div class="card">
	  <div class="container">
	    <a href=""""),_display_(/*24.16*/routes/*24.22*/.TaskList3.load()),format.raw/*24.39*/(""""><b>Version 3</b></a> 
	    <p>Description about version 1</p> 
	  </div>
	</div>

	<div class="card">
	  <div class="container">
	    <a href=""""),_display_(/*31.16*/routes/*31.22*/.TaskList4.load()),format.raw/*31.39*/(""""><b>Version 4</b></a> 
	    <p>Description about version 1</p> 
	  </div>
	</div>
	<br><br><br><br><br><br>

	<div class="card">
		<div class="container">
			<h4>Random number & Random String</h4>
				<p id="randomText">Click for a new random number: <span id="random">4</span></p>
				<input id="lengthValue" type="text" value="5">
				<p id="randomStringText">Click for a new random string: <span id="randomString">word</span></p>
		</div>	
	</div>


	<div class="card">
	  <div class="container">
	    <a href=""""),_display_(/*49.16*/routes/*49.22*/.WebSocketChat.index()),format.raw/*49.44*/(""""><b>Chat Page</b></a> 
	    <p>Description about version 1</p> 
	  </div>
	</div>
	<script src=""""),_display_(/*53.16*/routes/*53.22*/.Assets.versioned("javascript/basicStuff.js")),format.raw/*53.67*/(""""></script>
	<style type="text/css">
		.card """),format.raw/*55.9*/("""{"""),format.raw/*55.10*/("""
		  """),format.raw/*56.5*/("""box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
		  transition: 0.3s;
		  width: 40%;
		  border-radius: 5px;
		  float: left;
		"""),format.raw/*61.3*/("""}"""),format.raw/*61.4*/("""

		"""),format.raw/*63.3*/(""".card:hover """),format.raw/*63.15*/("""{"""),format.raw/*63.16*/("""
		  """),format.raw/*64.5*/("""box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
		"""),format.raw/*65.3*/("""}"""),format.raw/*65.4*/("""

		"""),format.raw/*67.3*/(""".container """),format.raw/*67.14*/("""{"""),format.raw/*67.15*/("""
		  """),format.raw/*68.5*/("""padding: 2px 16px;
		"""),format.raw/*69.3*/("""}"""),format.raw/*69.4*/("""

		"""),format.raw/*71.3*/("""body"""),format.raw/*71.7*/("""{"""),format.raw/*71.8*/("""
			
			"""),format.raw/*73.4*/("""background: rgb(2,0,36);
			background: linear-gradient(90deg, rgba(2,0,36,1) 0%, rgba(234,209,40,1) 0%, rgba(208,227,47,1) 43%, rgba(200,220,53,1) 61%, rgba(0,212,255,1) 100%);

		"""),format.raw/*76.3*/("""}"""),format.raw/*76.4*/("""


	"""),format.raw/*79.2*/("""</style>
""")))}),format.raw/*80.2*/("""
"""))
      }
    }
  }

  def render(message:String,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(message)(flash)

  def f:((String) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (message) => (flash) => apply(message)(flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-02-04T15:21:59.411
                  SOURCE: C:/Users/Lenovo/Desktop/Play-Videos-master/server/app/views/index.scala.html
                  HASH: d6981a33415eda1140e1c926c908661cc1801d53
                  MATRIX: 735->1|869->42|896->44|930->70|969->72|997->74|1132->183|1146->189|1184->207|1357->353|1372->359|1411->377|1592->531|1607->537|1645->554|1818->700|1833->706|1871->723|2414->1239|2429->1245|2472->1267|2597->1365|2612->1371|2678->1416|2750->1461|2779->1462|2811->1467|2960->1589|2988->1590|3019->1594|3059->1606|3088->1607|3120->1612|3191->1656|3219->1657|3250->1661|3289->1672|3318->1673|3350->1678|3398->1699|3426->1700|3457->1704|3488->1708|3516->1709|3551->1717|3759->1898|3787->1899|3818->1903|3858->1913
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|32->8|32->8|32->8|39->15|39->15|39->15|48->24|48->24|48->24|55->31|55->31|55->31|73->49|73->49|73->49|77->53|77->53|77->53|79->55|79->55|80->56|85->61|85->61|87->63|87->63|87->63|88->64|89->65|89->65|91->67|91->67|91->67|92->68|93->69|93->69|95->71|95->71|95->71|97->73|100->76|100->76|103->79|104->80
                  -- GENERATED --
              */
          