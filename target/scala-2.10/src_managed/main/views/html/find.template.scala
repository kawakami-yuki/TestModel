
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
object find extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Form[Message],List[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(msg: String,datasForm: Form[Message],datas: List[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.61*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Sample Page")/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""

  <h1>投稿者検索画面</h1>
  <a href="/" role="button">一覧に戻る</a>
  <a href="/add" role="button">新規</a>
  <a href="/setItem" role="button">投稿編集</a>
  <a href="/delete" role="button">削除</a>
  <hr>
  <p>"""),_display_(Seq[Any](/*13.7*/msg)),format.raw/*13.10*/("""</p>
  """),_display_(Seq[Any](/*14.4*/helper/*14.10*/.form(action = routes.Application.find())/*14.51*/ {_display_(Seq[Any](format.raw/*14.53*/(""" 
	  """),_display_(Seq[Any](/*15.5*/helper/*15.11*/.inputText(datasForm("name"),'_label->"投稿者の名前を入力"))),format.raw/*15.61*/("""
	  <input type="submit">
   """)))})),format.raw/*17.5*/(""" 
  <hr>
  """),_display_(Seq[Any](/*19.4*/if(datas != null)/*19.21*/{_display_(Seq[Any](format.raw/*19.22*/("""
     <pre>"""),_display_(Seq[Any](/*20.12*/datas)),format.raw/*20.17*/("""</pre>
  """)))})),format.raw/*21.4*/("""
""")))})))}
    }
    
    def render(msg:String,datasForm:Form[Message],datas:List[Message]): play.api.templates.HtmlFormat.Appendable = apply(msg,datasForm,datas)
    
    def f:((String,Form[Message],List[Message]) => play.api.templates.HtmlFormat.Appendable) = (msg,datasForm,datas) => apply(msg,datasForm,datas)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 11 18:27:05 JST 2016
                    SOURCE: /Users/yuki.kawakami/Downloads/play-2.2.6/TestModel/app/views/find.scala.html
                    HASH: f34923b64fbabcf39b608f191befebbd31bde4ab
                    MATRIX: 801->1|970->60|998->79|1034->81|1061->100|1100->102|1330->297|1355->300|1398->308|1413->314|1463->355|1503->357|1544->363|1559->369|1631->419|1692->449|1739->461|1765->478|1804->479|1852->491|1879->496|1920->506
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|41->13|41->13|42->14|42->14|42->14|42->14|43->15|43->15|43->15|45->17|47->19|47->19|47->19|48->20|48->20|49->21
                    -- GENERATED --
                */
            