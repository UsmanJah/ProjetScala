
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

object Notes extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Hello")/*1.15*/ {_display_(Seq[Any](format.raw/*1.17*/("""
"""),format.raw/*2.1*/("""<section id="content">
  <div class="wrapper doc">
    <article>
      <h1></h1>
    </article>

  </div>
</section>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="../../webapp/css/default.css">
  <style>
    label
"""),format.raw/*21.1*/("""{"""),format.raw/*21.2*/("""
	"""),format.raw/*22.2*/("""display: block;
	width: 150px;
	float: left;
"""),format.raw/*25.1*/("""}"""),format.raw/*25.2*/("""
  """),format.raw/*26.3*/("""</style>
<script type="text/javascript" >

function identification ()   """),format.raw/*29.30*/("""{"""),format.raw/*29.31*/("""
          """),format.raw/*30.11*/("""var nom=document.getElementById("nom").value.toUpperCase();
          var prenom=document.getElementById("prenom").value;
          var ine=document.getElementById("ine").value;
          document.getElementById("Prenom").innerHTML=prenom ; 
          document.getElementById("Nom").innerHTML=nom;
          document.getElementById("ide").innerHTML=ine;
"""),format.raw/*36.1*/("""}"""),format.raw/*36.2*/("""
"""),format.raw/*37.1*/("""function clickSurEffacer () """),format.raw/*37.29*/("""{"""),format.raw/*37.30*/("""          
          """),format.raw/*38.11*/("""document.getElementById("nom").value="";
          document.getElementById("prenom").value="";
          document.getElementById("ine").value="";
          
          document.getElementById("reset").innerHTML="Effacé";

"""),format.raw/*44.1*/("""}"""),format.raw/*44.2*/("""
"""),format.raw/*45.1*/("""function affichageDansLeTableau () """),format.raw/*45.36*/("""{"""),format.raw/*45.37*/("""

"""),format.raw/*47.1*/("""var noteDevoir=parseFloat(document.getElementById("nd").value);
var noteProjet=parseFloat(document.getElementById("np").value);
var noteExamen=parseFloat(document.getElementById("ne").value);
var Matiere=document.getElementById("matiere").value;
var moyenneFinale=( (((noteDevoir+noteProjet)/2)+(noteExamen))/2);

var Credit=document.getElementById("nc").value;
var tab= document.getElementById("lignetab");
var ligne=tab.insertRow();
var matiere=ligne.insertCell(0);
var moy=ligne.insertCell(1);
var nbCredits=ligne.insertCell(2);
var mention=ligne.insertCell(3);
matiere.innerHTML=Matiere;
moy.innerHTML=moyenneFinale;
nbCredits.innerHTML = Credit;
     

if (moyenneFinale < 5) """),format.raw/*65.24*/("""{"""),format.raw/*65.25*/("""

"""),format.raw/*67.1*/("""mention.innerHTML = "FAIBLE";
document.getElementById("ment").innerHTML = "<strong>FAIBLE</strong>";
"""),format.raw/*69.1*/("""}"""),format.raw/*69.2*/("""
"""),format.raw/*70.1*/("""else if (moyenneFinale < 10) """),format.raw/*70.30*/("""{"""),format.raw/*70.31*/("""

"""),format.raw/*72.1*/("""mention.innerHTML = "INSUFFISANT";
document.getElementById("ment").innerHTML = "<strong>INSUFFISANT</strong>";
"""),format.raw/*74.1*/("""}"""),format.raw/*74.2*/("""
"""),format.raw/*75.1*/("""else if (moyenneFinale < 12) """),format.raw/*75.30*/("""{"""),format.raw/*75.31*/("""
"""),format.raw/*76.1*/("""mention.innerHTML = "PASSABLE";
document.getElementById("ment").innerHTML = "<strong>PASSABLE</strong>";

"""),format.raw/*79.1*/("""}"""),format.raw/*79.2*/("""
"""),format.raw/*80.1*/("""else if (moyenneFinale < 14) """),format.raw/*80.30*/("""{"""),format.raw/*80.31*/("""
"""),format.raw/*81.1*/("""mention.innerHTML = "ASSEZ BIEN";
document.getElementById("ment").innerHTML = "<strong>ASSEZ BIEN</strong>";  

"""),format.raw/*84.1*/("""}"""),format.raw/*84.2*/("""
"""),format.raw/*85.1*/("""else if (moyenneFinale < 16) """),format.raw/*85.30*/("""{"""),format.raw/*85.31*/("""
"""),format.raw/*86.1*/("""mention.innerHTML = "BIEN";
document.getElementById("ment").innerHTML = "<strong>BIEN</strong>";  


"""),format.raw/*90.1*/("""}"""),format.raw/*90.2*/("""
"""),format.raw/*91.1*/("""else if (moyenneFinale < 18) """),format.raw/*91.30*/("""{"""),format.raw/*91.31*/("""
"""),format.raw/*92.1*/("""mention.innerHTML = "TRES BIEN";
document.getElementById("ment").innerHTML = "<strong>TRES BIEN</strong>"; 


"""),format.raw/*96.1*/("""}"""),format.raw/*96.2*/("""
"""),format.raw/*97.1*/("""else if (moyenneFinale <= 20) """),format.raw/*97.31*/("""{"""),format.raw/*97.32*/("""
"""),format.raw/*98.1*/("""mention.innerHTML = "EXCELLENT";
document.getElementById("ment").innerHTML = "<strong>EXCELLENT</strong>"; 
  
  
"""),format.raw/*102.1*/("""}"""),format.raw/*102.2*/("""
"""),format.raw/*103.1*/("""else """),format.raw/*103.6*/("""{"""),format.raw/*103.7*/("""
"""),format.raw/*104.1*/("""mention.innerHTML="";
"""),format.raw/*105.1*/("""}"""),format.raw/*105.2*/("""





"""),format.raw/*111.1*/("""}"""),format.raw/*111.2*/("""






"""),format.raw/*118.1*/("""</script>





</head>
<body style="background-color:#e6f3ff; height: 1000px;" >
<!-- Inclure Scala.js compile code -->
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

<section>
  <h4 style="margin-left: 500px;">Calculer les notes d'un étudiants</h4>
  <div style="background-color:
 #6495ed;
  width: 1000px;
  height: 400px;
  margin-left: 175px;">
 
      

     <div  style="display: flex;">
      <div style="flex: 1;
      padding: 1em;">
<!-- Formulaire 1-->
<form name="form1">
  <fieldset>
    <legend>Informations de l'étudiant</legend>
    <label>Nom:</br></label>
    <input type="text" required="required" placeholder="mettez le nom en MAJUSCULE" id="nom" ></br></br></br>
    <label>Prenom :</br></label>
    <input type="text" required="required" placeholder="mettez votre prenom ici" id="prenom" ></br></br></br>
   
    <label>IDE :</br></label>
    <input type="text" required="required" placeholder="mettez votre ine ici" id="ine" ></br></br></br>
  </fieldset>
</form> <br>
<button type="button" class="btn btn-success" id="submit"  onClick="identification()">Valider</button>
<button type="button" class="btn btn-light" id="reset" onClick="clickSurEffacer()">Effacer</button>

      </div>
      <div style="flex: 1;
      padding: 1em;">
 <!--Formulaire2-->
<form name="form2">
  <fieldset>
  <legend> Saisie des notes</legend>
  <label>Matiére</br></label>
  <select id="matiere" placeholder="Veuillez choisir la matière">
      <option value="Programmation fonctionnelle avancée">Programmation fonctionnelle avancée</option>
      <option value="Optimisation">Méthodes d'Optimisation pour la Gestion</option>
      <option value="Analyse MAthématique">Comptabilité Analytique</option>
      <option value="Machine Learning">Sociologie des Organisations</option>
      <option value="Modélisation UML">Introduction au Marketing</option>
      <option value="Anglais">Anglais</option>
      <option value="Statistique">Analyse Conception et Systèmes d'information</option>
 </select></br></br>
 <label>Nombre de crédits :</br></label>
 <input type="number" id="nc"></br></br>
 <label>Note devoir 1:</br></label>
 <input type="number" min="0" max="20" required="required" placeholder="entrer votre note de devoir" id="nd"></br></br>
 <label>Note devoir 2:</br></label>
 <input type="number" min="0" max="20" placeholder="entrer votre note de projet" id="np"></br></br> 
 <label>Note examen :</br></label>
 <input type="number" min="0" max="20" required="required" placeholder="entrer votre note d'examen" id="ne"></br></br> 
 </fieldset>
</form>
<a href="#t">
<button type="submit" class="btn btn-success" id="submit"  onClick="affichageDansLeTableau()">Envoyer</button>
</a>
</td>

      </div>



     </div>












      </div>
      <div class="checkbox">

       
    </form>
  </div>
</section>

<section style="margin-top: 50px; ">
  <div style="display: flex;width: 800px; margin-left: 350px;" >
    <div style="flex: 1;
padding: 1em;">
      <h4 id="Nom">Nom</h4>
    </div>
    <div style="flex: 1;
padding: 1em;">
      <h4 id="Prenom">Prenom</h4>
    </div>
    <div style="flex: 1;
padding: 1em;">
      <h4 id="ide">IDE</h4>
    </div>
   
  </div>
  <div id="t">
  <table  class="table table-hover table-dark" style="margin-top: 30px; width: 800px; margin-left: 275px;" >
    <thead class="thead-dark">
        <tr>
            <th>Matière</th>
            <th>Moyenne  Semestrielle</th>
            <th>Nombre de crédits</th>
            <th>Mention</th>
        </tr>
    </thead>
    <tbody id="lignetab"></tbody>
  </table>
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
    © 2021 Copyright:Ousmane Dia

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
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Notes.scala.html
                  HASH: 3550014d7d39f8d351fb3dd5ee728e529568780e
                  MATRIX: 811->1|832->14|871->16|898->17|1567->659|1595->660|1624->662|1696->707|1724->708|1754->711|1854->783|1883->784|1922->795|2303->1149|2331->1150|2359->1151|2415->1179|2444->1180|2493->1201|2741->1422|2769->1423|2797->1424|2860->1459|2889->1460|2918->1462|3627->2143|3656->2144|3685->2146|3813->2247|3841->2248|3869->2249|3926->2278|3955->2279|3984->2281|4122->2392|4150->2393|4178->2394|4235->2423|4264->2424|4292->2425|4425->2531|4453->2532|4481->2533|4538->2562|4567->2563|4595->2564|4734->2676|4762->2677|4790->2678|4847->2707|4876->2708|4904->2709|5032->2810|5060->2811|5088->2812|5145->2841|5174->2842|5202->2843|5339->2953|5367->2954|5395->2955|5453->2985|5482->2986|5510->2987|5652->3101|5681->3102|5710->3103|5743->3108|5772->3109|5801->3110|5851->3132|5880->3133|5914->3139|5943->3140|5978->3147
                  LINES: 26->1|26->1|26->1|27->2|46->21|46->21|47->22|50->25|50->25|51->26|54->29|54->29|55->30|61->36|61->36|62->37|62->37|62->37|63->38|69->44|69->44|70->45|70->45|70->45|72->47|90->65|90->65|92->67|94->69|94->69|95->70|95->70|95->70|97->72|99->74|99->74|100->75|100->75|100->75|101->76|104->79|104->79|105->80|105->80|105->80|106->81|109->84|109->84|110->85|110->85|110->85|111->86|115->90|115->90|116->91|116->91|116->91|117->92|121->96|121->96|122->97|122->97|122->97|123->98|127->102|127->102|128->103|128->103|128->103|129->104|130->105|130->105|136->111|136->111|143->118
                  -- GENERATED --
              */
          