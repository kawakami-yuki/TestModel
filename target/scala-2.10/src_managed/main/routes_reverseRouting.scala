// @SOURCE:/Users/yuki.kawakami/Downloads/play-2.2.6/TestModel/conf/routes
// @HASH:f86c6995242ee3ebdcd502c65f838dd3230ab148
// @DATE:Wed May 11 15:35:51 JST 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:17
class ReverseAssets {
    

// @LINE:17
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def delete(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "delete")
}
                                                

// @LINE:12
def edit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "edit")
}
                                                

// @LINE:8
def create(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "create")
}
                                                

// @LINE:14
def find(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "find")
}
                                                

// @LINE:13
def doEdit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "doEdit")
}
                                                

// @LINE:10
def doDelete(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "doDelete")
}
                                                

// @LINE:7
def add(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "add")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:11
def setItem(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "setItem")
}
                                                
    
}
                          
}
                  


// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:17
class ReverseAssets {
    

// @LINE:17
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.delete",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delete"})
      }
   """
)
                        

// @LINE:12
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.edit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "edit"})
      }
   """
)
                        

// @LINE:8
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "create"})
      }
   """
)
                        

// @LINE:14
def find : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.find",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "find"})
      }
   """
)
                        

// @LINE:13
def doEdit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.doEdit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "doEdit"})
      }
   """
)
                        

// @LINE:10
def doDelete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.doDelete",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "doDelete"})
      }
   """
)
                        

// @LINE:7
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.add",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:11
def setItem : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.setItem",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "setItem"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:17
class ReverseAssets {
    

// @LINE:17
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def delete(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.delete(), HandlerDef(this, "controllers.Application", "delete", Seq(), "GET", """""", _prefix + """delete""")
)
                      

// @LINE:12
def edit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.edit(), HandlerDef(this, "controllers.Application", "edit", Seq(), "POST", """""", _prefix + """edit""")
)
                      

// @LINE:8
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.create(), HandlerDef(this, "controllers.Application", "create", Seq(), "POST", """""", _prefix + """create""")
)
                      

// @LINE:14
def find(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.find(), HandlerDef(this, "controllers.Application", "find", Seq(), "GET", """""", _prefix + """find""")
)
                      

// @LINE:13
def doEdit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.doEdit(), HandlerDef(this, "controllers.Application", "doEdit", Seq(), "POST", """""", _prefix + """doEdit""")
)
                      

// @LINE:10
def doDelete(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.doDelete(), HandlerDef(this, "controllers.Application", "doDelete", Seq(), "POST", """""", _prefix + """doDelete""")
)
                      

// @LINE:7
def add(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.add(), HandlerDef(this, "controllers.Application", "add", Seq(), "GET", """""", _prefix + """add""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:11
def setItem(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.setItem(), HandlerDef(this, "controllers.Application", "setItem", Seq(), "GET", """""", _prefix + """setItem""")
)
                      
    
}
                          
}
        
    