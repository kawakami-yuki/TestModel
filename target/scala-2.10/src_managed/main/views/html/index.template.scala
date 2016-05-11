
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(msg: String, datas: List[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.37*/("""

"""),_display_(Seq[Any](/*3.2*/main("Sample Page")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""

  <h1>ホーム画面</h1>
  <a href="/add" role="button">新規</a>
  <a href="/setItem" role="button">投稿編集</a>
  <a href="/delete" role="button">削除</a>
  <a href="/find" role="button">投稿者検索</a>
  <hr>
  <p>"""),_display_(Seq[Any](/*11.7*/msg)),format.raw/*11.10*/("""</p>
  <pre>"""),_display_(Seq[Any](/*12.9*/datas)),format.raw/*12.14*/("""</pre>
""")))})))}
    }
    
    def render(msg:String,datas:List[Message]): play.api.templates.HtmlFormat.Appendable = apply(msg,datas)
    
    def f:((String,List[Message]) => play.api.templates.HtmlFormat.Appendable) = (msg,datas) => apply(msg,datas)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 11 11:41:15 JST 2016
                    SOURCE: /Users/yuki.kawakami/Downloads/play-2.2.6/TestModel/app/views/index.scala.html
                    HASH: 0424ddecec770831385c51482fa0f6e4b8c48892
                    MATRIX: 788->1|917->36|954->39|981->58|1020->60|1252->257|1277->260|1325->273|1352->278
                    LINES: 26->1|29->1|31->3|31->3|31->3|39->11|39->11|40->12|40->12
                    -- GENERATED --
                */
            