
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
object setItem extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(msg: String,datas: Form[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.36*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Sample Page")/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""

  <h1>投稿メッセージID検索画面</h1>
  <a href="/" role="button">一覧に戻る</a>
  <a href="/add" role="button">新規</a>
  <a href="/delete" role="button">削除</a>
  <a href="/find" role="button">投稿者検索</a>
  <hr>
  <p>"""),_display_(Seq[Any](/*13.7*/msg)),format.raw/*13.10*/("""</p>
  """),_display_(Seq[Any](/*14.4*/helper/*14.10*/.form(action = routes.Application.edit())/*14.51*/ {_display_(Seq[Any](format.raw/*14.53*/(""" 
	  """),_display_(Seq[Any](/*15.5*/helper/*15.11*/.inputText(datas("id"),'_help->"Required"))),format.raw/*15.53*/("""
    <input type="hidden" name="name" value="hoge">
	  <input type="submit">
   """)))})),format.raw/*18.5*/(""" 
""")))})))}
    }
    
    def render(msg:String,datas:Form[Message]): play.api.templates.HtmlFormat.Appendable = apply(msg,datas)
    
    def f:((String,Form[Message]) => play.api.templates.HtmlFormat.Appendable) = (msg,datas) => apply(msg,datas)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 11 18:27:05 JST 2016
                    SOURCE: /Users/yuki.kawakami/Downloads/play-2.2.6/TestModel/app/views/setItem.scala.html
                    HASH: cffab19c819629ab52290230de75ec7f77946220
                    MATRIX: 790->1|934->35|962->54|998->56|1025->75|1064->77|1298->276|1323->279|1366->287|1381->293|1431->334|1471->336|1512->342|1527->348|1591->390|1703->471
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|41->13|41->13|42->14|42->14|42->14|42->14|43->15|43->15|43->15|46->18
                    -- GENERATED --
                */
            