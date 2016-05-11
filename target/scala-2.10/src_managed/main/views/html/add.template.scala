
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object add extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(msg: String,datas: Form[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.36*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Sample Page")/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""

  <h1>新規メッセージ作成画面</h1>
  <a href="/" role="button">一覧に戻る</a>
  <a href="/setItem" role="button">投稿編集</a>
  <a href="/delete" role="button">削除</a>
  <a href="/find" role="button">投稿者検索</a>
  <hr>
  <p>"""),_display_(Seq[Any](/*13.7*/msg)),format.raw/*13.10*/("""</p>
  """),_display_(Seq[Any](/*14.4*/helper/*14.10*/.form(action = routes.Application.create())/*14.53*/ {_display_(Seq[Any](format.raw/*14.55*/(""" 
	  """),_display_(Seq[Any](/*15.5*/helper/*15.11*/.inputText(datas("name"),'_help->"Required"))),format.raw/*15.55*/("""
	  """),_display_(Seq[Any](/*16.5*/helper/*16.11*/.inputText(datas("mail"),'_help->"Email"))),format.raw/*16.52*/("""
	  """),_display_(Seq[Any](/*17.5*/helper/*17.11*/.textarea(datas("message"),'_help->"constraint.pattern"))),format.raw/*17.67*/("""
	  <input type="submit">
   """)))})),format.raw/*19.5*/(""" 
""")))})))}
    }
    
    def render(msg:String,datas:Form[Message]): play.api.templates.HtmlFormat.Appendable = apply(msg,datas)
    
    def f:((String,Form[Message]) => play.api.templates.HtmlFormat.Appendable) = (msg,datas) => apply(msg,datas)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 11 11:38:42 JST 2016
                    SOURCE: /Users/yuki.kawakami/Downloads/play-2.2.6/TestModel/app/views/add.scala.html
                    HASH: 55319dac81dad8e4c6a998ee9f42ac6b821e59d7
                    MATRIX: 786->1|930->35|958->54|994->56|1021->75|1060->77|1298->280|1323->283|1366->291|1381->297|1433->340|1473->342|1514->348|1529->354|1595->398|1635->403|1650->409|1713->450|1753->455|1768->461|1846->517|1907->547
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|41->13|41->13|42->14|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|47->19
                    -- GENERATED --
                */
            