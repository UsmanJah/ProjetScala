// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def Etudiant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Etudiant",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Etudiant"})
        }
      """
    )
  
    // @LINE:8
    def Interface: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Interface",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Interface"})
        }
      """
    )
  
    // @LINE:11
    def Emploisdutemps: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Emploisdutemps",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Emploisdutemps"})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:12
    def statistique: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.statistique",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "statistique"})
        }
      """
    )
  
    // @LINE:10
    def Notes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Notes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Notes"})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
