// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_0: controllers.HomeController,
  // @LINE:16
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_0: controllers.HomeController,
    // @LINE:16
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Interface""", """controllers.HomeController.Interface"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Etudiant""", """controllers.HomeController.Etudiant"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Notes""", """controllers.HomeController.Notes"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Emploisdutemps""", """controllers.HomeController.Emploisdutemps"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statistique""", """controllers.HomeController.statistique"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_Interface1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Interface")))
  )
  private[this] lazy val controllers_HomeController_Interface1_invoker = createInvoker(
    HomeController_0.Interface,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Interface",
      Nil,
      "GET",
      this.prefix + """Interface""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_Etudiant2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Etudiant")))
  )
  private[this] lazy val controllers_HomeController_Etudiant2_invoker = createInvoker(
    HomeController_0.Etudiant,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Etudiant",
      Nil,
      "GET",
      this.prefix + """Etudiant""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_Notes3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Notes")))
  )
  private[this] lazy val controllers_HomeController_Notes3_invoker = createInvoker(
    HomeController_0.Notes,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Notes",
      Nil,
      "GET",
      this.prefix + """Notes""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_Emploisdutemps4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Emploisdutemps")))
  )
  private[this] lazy val controllers_HomeController_Emploisdutemps4_invoker = createInvoker(
    HomeController_0.Emploisdutemps,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Emploisdutemps",
      Nil,
      "GET",
      this.prefix + """Emploisdutemps""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_statistique5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statistique")))
  )
  private[this] lazy val controllers_HomeController_statistique5_invoker = createInvoker(
    HomeController_0.statistique,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "statistique",
      Nil,
      "GET",
      this.prefix + """statistique""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index())
      }
  
    // @LINE:8
    case controllers_HomeController_Interface1_route(params@_) =>
      call { 
        controllers_HomeController_Interface1_invoker.call(HomeController_0.Interface)
      }
  
    // @LINE:9
    case controllers_HomeController_Etudiant2_route(params@_) =>
      call { 
        controllers_HomeController_Etudiant2_invoker.call(HomeController_0.Etudiant)
      }
  
    // @LINE:10
    case controllers_HomeController_Notes3_route(params@_) =>
      call { 
        controllers_HomeController_Notes3_invoker.call(HomeController_0.Notes)
      }
  
    // @LINE:11
    case controllers_HomeController_Emploisdutemps4_route(params@_) =>
      call { 
        controllers_HomeController_Emploisdutemps4_invoker.call(HomeController_0.Emploisdutemps)
      }
  
    // @LINE:12
    case controllers_HomeController_statistique5_route(params@_) =>
      call { 
        controllers_HomeController_statistique5_invoker.call(HomeController_0.statistique)
      }
  
    // @LINE:16
    case controllers_Assets_versioned6_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
