
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

object Interface extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Hello")/*1.15*/ {_display_(Seq[Any](format.raw/*1.17*/("""
"""),format.raw/*2.1*/("""<html lang="en">
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
<nav class="navbar navbar-inverse" style="background-color:#2980B9; height: 75px; ">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" ><p style="color: cornsilk;"> School-Gess</p></a>
        </div>
        <ul class="nav navbar-nav">
            <li><a href="" style="color: cornsilk;">Admin</a></li>
        </ul>

    </div>
</nav>
<section>
    <div style="display: flex;
    margin-top: 50px;" >
        <div style="width: 50px;
 height: 250px;
 background-color:#e6f3ff;
 margin-left: 75px;
 flex: 1;
 padding: 1em;
 ">

            <p style="margin-left: 200px;">Etudiants</p>
            <img src="https://cdn1.iconfinder.com/data/icons/human-resources-management-2-2/128/a-39-128.png" style="height:150px; width:150px;">

            <a href="Etudiant">
                <button type="button" class="btn btn-success" style="margin-left: 190px; margin-bottom: 10px; background-color: chartreuse;" >View</button>
            </a>
        </div>
        <div style="width: 75px;
    height: 250px;
    background-color:#cce6ff;
    margin-left: 150px;
    margin-right: 75px;
    flex: 1;
    padding: 1em;
    ">
            <p style="margin-left: 200px;">Notes</p>

            <img src="https://cdn4.iconfinder.com/data/icons/education-set-2-4/64/x-21-512.png" style="height:150px; width: 150px;">
            <a href="Notes">

                <button type="button" class="btn btn-success" style="margin-left: 190px; margin-bottom: 10px;background-color: chartreuse">View</button>
            </a>
        </div>
    </div>
    <div style="display: flex;
    margin-top: 100px;
    margin-bottom: 100px;" >
        <div style="width: 50px;
        height: 250px;
 background-color:#e6f3ff;

        margin-left: 75px;
        flex: 1;
        padding: 1em;
        ">
            <p style="margin-left: 200px;">Emplois du temps </p>
            <img src="https://cdn1.iconfinder.com/data/icons/education-3-1/256/Schedule-128.png" style="height:150px; width: 150px;">


            <a href="Emploisdutemps">
                <button type="button" class="btn btn-success" style="margin-left: 190px; margin-bottom: 10px;background-color: chartreuse">View</button>
            </a>
        </div>
        <div style="width: 75px;
           height: 250px;
           background-color:#cce6ff;
           margin-left: 150px;
           margin-right: 75px;
           flex: 1;
           padding: 1em;
           ">
            <p style="margin-left: 200px;">Statistiques</p>
            <img src="	https://cdn3.iconfinder.com/data/icons/start-up-4/44/presentation-512.png" style="height:150px; width: 150px;">
            <a href="statistique">
                <button type="button" class="btn btn-success" style="margin-left: 190px; margin-bottom: 10px;background-color: chartreuse">View</button>
            </a>
        </div>

    </div>



</section>



<!-- Footer -->
<footer style="position: fixed;
    left: 0;
    bottom: 0;
    width: 100%;
    height: 50px;
    background-color:#2980B9;
    color: white;
    text-align: center;">
    <!-- Copyright -->
    <div class="text-center p-3">
        © 2021 Copyright:
        Ousmane DIa
    </div>
    <!-- Copyright -->
</footer>


<!-- Footer -->
</body>
</html>
<section id="content">
    <div class="wrapper doc">
        <article>
            <h1></h1>
        </article>

    </div>
</section>

""")))}),format.raw/*131.2*/("""
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
                  SOURCE: app/views/Interface.scala.html
                  HASH: 171fd3acaf4af49bdf1031b799e6d0f52b928cc0
                  MATRIX: 815->1|836->14|875->16|902->17|4888->3972
                  LINES: 26->1|26->1|26->1|27->2|156->131
                  -- GENERATED --
              */
          