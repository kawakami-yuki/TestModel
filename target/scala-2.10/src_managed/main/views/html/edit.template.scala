
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
object edit extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(msg: String,datas: Form[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.36*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Sample Page")/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""

  <h1>投稿メッセージ編集画面</h1>
  <a href="/" role="button">一覧に戻る</a>
  <a href="/add" role="button">新規</a>
  <a href="/setItem" role="button">投稿編集</a>
  <a href="/delete" role="button">削除</a>
  <a href="/find" role="button">投稿者検索</a>
  <hr>
  <p>"""),_display_(Seq[Any](/*14.7*/msg)),format.raw/*14.10*/("""</p>
  """),_display_(Seq[Any](/*15.4*/helper/*15.10*/.form(action = routes.Application.doEdit())/*15.53*/ {_display_(Seq[Any](format.raw/*15.55*/(""" 
    <input type="hidden" name="id" value=""""),_display_(Seq[Any](/*16.44*/datas/*16.49*/.get().id)),format.raw/*16.58*/("""">
	  """),_display_(Seq[Any](/*17.5*/helper/*17.11*/.inputText(datas("name"),'_help->"Required"))),format.raw/*17.55*/("""
	  """),_display_(Seq[Any](/*18.5*/helper/*18.11*/.inputText(datas("mail"),'_help->"Email"))),format.raw/*18.52*/("""
	  """),_display_(Seq[Any](/*19.5*/helper/*19.11*/.textarea(datas("message"),'_help->"constraint.pattern"))),format.raw/*19.67*/("""
	  <input type="submit">
   """)))})),format.raw/*21.5*/(""" 
""")))})))}
    }
    
    def render(msg:String,datas:Form[Message]): play.api.templates.HtmlFormat.Appendable = apply(msg,datas)
    
    def f:((String,Form[Message]) => play.api.templates.HtmlFormat.Appendable) = (msg,datas) => apply(msg,datas)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 11 18:27:05 JST 2016
                    SOURCE: /Users/yuki.kawakami/Downloads/play-2.2.6/TestModel/app/views/edit.scala.html
                    HASH: c9fa682d17cb9d2c10788fe247b7ab4dc1a6b54d
                    MATRIX: 787->1|931->35|959->54|995->56|1022->75|1061->77|1337->318|1362->321|1405->329|1420->335|1472->378|1512->380|1593->425|1607->430|1638->439|1680->446|1695->452|1761->496|1801->501|1816->507|1879->548|1919->553|1934->559|2012->615|2073->645
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|42->14|42->14|43->15|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|49->21
                    -- GENERATED --
                */
            