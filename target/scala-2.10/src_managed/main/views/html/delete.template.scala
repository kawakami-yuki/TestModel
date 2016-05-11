
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
object delete extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(msg: String,datas: Form[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.36*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Sample Page")/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""

  <h1>投稿メッセージID削除画面（指定したIDを削除する）</h1>
  <a href="/" role="button">一覧に戻る</a>
  <a href="/add" role="button">新規</a>
  <a href="/setItem" role="button">投稿編集</a>
  <a href="/find" role="button">投稿者検索</a>
  <hr>
  <p>"""),_display_(Seq[Any](/*13.7*/msg)),format.raw/*13.10*/("""</p>
  """),_display_(Seq[Any](/*14.4*/helper/*14.10*/.form(action = routes.Application.doDelete())/*14.55*/ {_display_(Seq[Any](format.raw/*14.57*/(""" 
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
                    SOURCE: /Users/yuki.kawakami/Downloads/play-2.2.6/TestModel/app/views/delete.scala.html
                    HASH: 418d99bbec087252e5629cd8b0e2da60a49abdc3
                    MATRIX: 789->1|933->35|961->54|997->56|1024->75|1063->77|1313->292|1338->295|1381->303|1396->309|1450->354|1490->356|1531->362|1546->368|1610->410|1721->490
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|41->13|41->13|42->14|42->14|42->14|42->14|43->15|43->15|43->15|46->18
                    -- GENERATED --
                */
            