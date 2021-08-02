
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="../../webapp/css/default.css">
</head>
<body>
<nav class="navbar navbar-inverse" style="background-color:#2980B9; height:100px;">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" ><p style="color: cornsilk;">School-Gess</p></a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="#" style="color: cornsilk;">Admin</a></li>
    </ul>

    
    
  </div>
</nav>
<section>
  <div style=" display: flex;"> 
  <div style="margin-left: 100px; margin-top: 50px;
  flex: 1; 
  padding: 1em;
    
  ">
  <h1>School-Gess</h1>
   <p>Lorem ipsum dolor sit amet, consectetur </p>
   <p>adipiscing elit, sed do eiusmod </p>
   <p>incididunt ut labore</p>
   <a href="Interface">
   <button type="button" class="btn btn-success">Start</button></a>
  </div>
  <div style="flex: 1; 
  padding: 1em;
  margin-top: 75px;
 "> 
  <img src="https://cdn1.iconfinder.com/data/icons/school-and-education-84/64/School-512.png" class="img-rounded" alt="Cinque Terre" style="width: 300px; height: 250px;" > 
  </div>
</div>
   
</section>
<!-- Footer -->
<footer style="position: fixed;
    left: 0;
    bottom: 0;
    width: 100%;
    height: 75px;
    background-color:#2980B9;
    color: white;
    text-align: center;">
  <!-- Copyright -->
  <div class="text-center p-3">
    © 2021 Copyright:Usman Jah
  
  </div>
  <!-- Copyright -->
</footer>


<!-- Footer -->
</body>
</html>
""")))}),format.raw/*73.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 2e9baf2fa7783582d0b336d0571595dd87162f0f
                  MATRIX: 722->1|818->4|845->6|876->29|915->31|944->34|2877->1937
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|97->73
                  -- GENERATED --
              */
          