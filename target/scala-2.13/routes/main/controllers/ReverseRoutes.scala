// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def Etudiant: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Etudiant")
    }
  
    // @LINE:8
    def Interface: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Interface")
    }
  
    // @LINE:11
    def Emploisdutemps: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Emploisdutemps")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:12
    def statistique: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "statistique")
    }
  
    // @LINE:10
    def Notes: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Notes")
    }
  
  }

  // @LINE:16
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
