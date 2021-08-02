
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

object Emploisdutemps extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Hello")/*1.15*/{_display_(Seq[Any](format.raw/*1.16*/("""

  """),format.raw/*3.3*/("""<section id="content">
    <div class="wrapper doc">
      <article>
        <h1></h1>
      </article>
  
    </div>
  </section>

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script>document.getElementsByTagName("html")[0].className += " js";</script>
    <link rel="stylesheet" href="../../public/stylesheets/style.css">
    <title>PROJET SCALA|</title>
  </head>
  <body>
    <script type="text/javascript" src="./target/scala-2.13/scala-js-tutorial-fastopt/main.js"></script>
<nav class="navbar navbar-inverse" style="background-color:#2980B9; height: 75px; ">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" ><p style="color: cornsilk;"> School-Gess</p></a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="Interface" style="color: cornsilk;">HOME</a></li>
    </ul>

  </div>
</nav>
   
    <p style="margin-left: 400px;">Emplois du temps et Allocatopn des Salles de classe</p>
  <div class="cd-schedule cd-schedule--loading margin-top-lg margin-bottom-lg js-cd-schedule" style="width: 1200px ;">
      <div class="cd-schedule__timeline">
        <ul>
          <li><span>09:00</span></li>
          <li><span>09:30</span></li>
          <li><span>10:00</span></li>
          <li><span>10:30</span></li>
          <li><span>11:00</span></li>
          <li><span>11:30</span></li>
          <li><span>12:00</span></li>
          <li><span>12:30</span></li>
          <li><span>13:00</span></li>
          <li><span>13:30</span></li>
          <li><span>14:00</span></li>
          <li><span>14:30</span></li>
          <li><span>15:00</span></li>
          <li><span>15:30</span></li>
          <li><span>16:00</span></li>
          <li><span>16:30</span></li>
          <li><span>17:00</span></li>
          
        </ul>
      </div> <!-- Emplois du temps -->
    
      <div class="cd-schedule__events">
        <ul>
          <li class="cd-schedule__group">
            <div class="cd-schedule__top-info"><span>Lundi</span></div>
    
            <ul>
              <li class="cd-schedule__event">
                <a data-start="09:00" data-end="11:00" data-content="event-abs-circuit.html" data-event="event-1" href="#0">
                  <em class="cd-schedule__name"></em>
                </a>
              </li>
    
              <li class="cd-schedule__event">
                <a data-start="11:30" data-end="13:30" data-content="event-rowing-workout" data-event="event-2" href="#0">
                  <em class="cd-schedule__name"></em>
                </a>
              </li>
    
              <li class="cd-schedule__event">
                <a data-start="15:00" data-end="17:00"  data-content="event-yoga-1" data-event="event-3" href="#0">
                  <em class="cd-schedule__name"></em>
                </a>
              </li>
            </ul>
          </li>
    
          <li class="cd-schedule__group">
            <div class="cd-schedule__top-info"><span>Mardi</span></div>
    
            <ul>
              <li class="cd-schedule__event">
                <a data-start="9:30" data-end="11:00"  data-content="event-rowing-workout" data-event="event-2" href="#0">
                  <em class="cd-schedule__name"></em>
                </a>
              </li>
    
              <li class="cd-schedule__event">
                <a data-start="11:30" data-end="13:00"  data-content="event-restorative-yoga" data-event="event-4" href="#0">
                  <em class="cd-schedule__name"></em>
                </a>
              </li>
    
              <li class="cd-schedule__event">
                <a data-start="15:30" data-end="17:30" data-content="event-abs-circuit" data-event="event-1" href="#0">
                  <em class="cd-schedule__name"></em>
                </a>
              </li>
    
              
            </ul>
          </li>
    
          <li class="cd-schedule__group">
            <div class="cd-schedule__top-info"><span>Mercredi</span></div>
    
            <ul>
              <li class="cd-schedule__event">
                <a data-start="09:00" data-end="11:00" data-content="event-restorative-yoga" data-event="event-4" href="#0">
                  <em class="cd-schedule__name"></em>
                </a>
              </li>
    
              <li class="cd-schedule__event">
                <a data-start="15:00" data-end="17:00" data-content="event-yoga-1" data-event="event-3" href="#0">
                  <em class="cd-schedule__name"></em>
                </a>
              </li>
            </ul>
          </li>
    
          <li class="cd-schedule__group">
            <div class="cd-schedule__top-info"><span>Jeudi</span></div>
    
            <ul>
              <li class="cd-schedule__event">
                <a data-start="09:00" data-end="11:00" data-content="event-abs-circuit" data-event="event-1" href="#0">
                  <em class="cd-schedule__name"></em>
                </a>
              </li>
    
              <li class="cd-schedule__event">
                <a data-start="15:00" data-end="17:00" data-content="event-restorative-yoga" data-event="event-4" href="#0">
                  <em class="cd-schedule__name"></em>
                </a>
              </li>
            </ul>
          </li>
    
          <li class="cd-schedule__group">
            <div class="cd-schedule__top-info"><span>Vendredi</span></div>
    
            <ul>
              <li class="cd-schedule__event">
                <a data-start="10:00" data-end="11:00"  data-content="event-rowing-workout" data-event="event-2" href="#0">
                  <em class="cd-schedule__name"></em>
                </a>
              </li>
    
              <li class="cd-schedule__event">
                <a data-start="12:30" data-end="14:00" data-content="event-abs-circuit" data-event="event-1" href="#0">
                  <em class="cd-schedule__name"></em>
                </a>
              </li>
    
              <li class="cd-schedule__event">
                <a data-start="15:45" data-end="16:45"  data-content="event-yoga-1" data-event="event-3" href="#0">
                  <em class="cd-schedule__name"></em>
                </a>
              </li>
            </ul>
          </li>
        </ul>
      </div>
    
      <div class="cd-schedule-modal">
        <header class="cd-schedule-modal__header">
          <div class="cd-schedule-modal__content">
            <span class="cd-schedule-modal__date"></span>
            <h3 class="cd-schedule-modal__name"></h3>
          </div>
    
          <div class="cd-schedule-modal__header-bg"></div>
        </header>
    
        <div class="cd-schedule-modal__body">
          <div class="cd-schedule-modal__event-info"></div>
          <div class="cd-schedule-modal__body-bg"></div>
        </div>
    
        <a href="#0" class="cd-schedule-modal__close text-replace">Close</a>
      </div>
    
      <div class="cd-schedule__cover-layer"></div>
    </div> <!-- Lien externe -->
  
    <script src="../../public/javascripts/util.js"></script> <!-- Lien-->
    <script src="../../public/javascripts/main.js"></script>


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
    © 2021 Copyright:Ousmane DIa
    
</div>
<!-- Copyright -->
</footer>


<!-- Footer -->

  </body>
  </html>


""")))}),format.raw/*221.2*/("""r"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Emploisdutemps.scala.html
                  HASH: 170110ffab20a3277bc9f139263e22a8b40d2564
                  MATRIX: 820->1|841->14|879->15|909->19|8458->7537
                  LINES: 26->1|26->1|26->1|28->3|246->221
                  -- GENERATED --
              */
          