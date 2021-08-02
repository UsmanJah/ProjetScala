
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

object Etudiant extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
<script>
 function Fonction1() """),format.raw/*11.23*/("""{"""),format.raw/*11.24*/("""
		"""),format.raw/*12.3*/("""// Les données sous format Json ()
        var master1bigdata = [
            """),format.raw/*14.13*/("""{"""),format.raw/*14.14*/("""'#': '1', 'IDE': '000001',
                'NOM': 'Diaw', 'PRENOM': 'Aliou'
            """),format.raw/*16.13*/("""}"""),format.raw/*16.14*/(""",
            """),format.raw/*17.13*/("""{"""),format.raw/*17.14*/("""'#': '2', 'IDE': '000002',
                'NOM': 'Tall', 'PRENOM': 'Masamba'
            """),format.raw/*19.13*/("""}"""),format.raw/*19.14*/(""",
            """),format.raw/*20.13*/("""{"""),format.raw/*20.14*/("""'#': '3', 'IDE': '000003',
                'NOM': 'Kobor', 'PRENOM': 'Djibi'
            """),format.raw/*22.13*/("""}"""),format.raw/*22.14*/("""
            

        """),format.raw/*25.9*/("""]
        var master2bigdata = [
            """),format.raw/*27.13*/("""{"""),format.raw/*27.14*/("""'#': '1', 'IDE': '000011',
                'NOM': 'Deme', 'PRENOM': 'Matar'
            """),format.raw/*29.13*/("""}"""),format.raw/*29.14*/(""",
            """),format.raw/*30.13*/("""{"""),format.raw/*30.14*/("""'#': '2', 'IDE': '000012',
                'NOM': 'Samba', 'PRENOM': 'Ngom'
            """),format.raw/*32.13*/("""}"""),format.raw/*32.14*/(""",
            """),format.raw/*33.13*/("""{"""),format.raw/*33.14*/("""'#': '3', 'IDE': '000013',
                'NOM': 'Cisse', 'PRENOM': 'Fadel'
            """),format.raw/*35.13*/("""}"""),format.raw/*35.14*/("""

        """),format.raw/*37.9*/("""]
        var master1AI = [
            """),format.raw/*39.13*/("""{"""),format.raw/*39.14*/("""'#': '1', 'IDE': '000021',
                'NOM': 'Samb', 'PRENOM': 'Racky'
            """),format.raw/*41.13*/("""}"""),format.raw/*41.14*/(""",
            """),format.raw/*42.13*/("""{"""),format.raw/*42.14*/("""'#': '2', 'IDE': '000022',
                'NOM': 'Magueye', 'PRENOM': 'Mbothiee'
            """),format.raw/*44.13*/("""}"""),format.raw/*44.14*/(""",
            """),format.raw/*45.13*/("""{"""),format.raw/*45.14*/("""'#': '3', 'IDE': '000033',
                'NOM': 'Ba', 'PRENOM': 'Djenaba'
            """),format.raw/*47.13*/("""}"""),format.raw/*47.14*/("""

        """),format.raw/*49.9*/("""]
        var master2AI = [
            """),format.raw/*51.13*/("""{"""),format.raw/*51.14*/("""'#': '1', 'IDE': '000031',
                'NOM': 'Sana', 'PRENOM': 'Mouhamad'
            """),format.raw/*53.13*/("""}"""),format.raw/*53.14*/(""",
            """),format.raw/*54.13*/("""{"""),format.raw/*54.14*/("""'#': '2', 'IDE': '0000032',
                'NOM': 'Mboy', 'PRENOM': 'Demba'
            """),format.raw/*56.13*/("""}"""),format.raw/*56.14*/(""",
            """),format.raw/*57.13*/("""{"""),format.raw/*57.14*/("""'#': '3', 'IDE': '000033',
                'NOM': 'khadija', 'PRENOM': 'Sene'
            """),format.raw/*59.13*/("""}"""),format.raw/*59.14*/("""

        """),format.raw/*61.9*/("""]
        
        var laclass=document.getElementById("nivetude").value;
        if (laclass="Master 1") """),format.raw/*64.33*/("""{"""),format.raw/*64.34*/("""
          """),format.raw/*65.11*/("""fil.innerHTML=="Big Data Analytics";
          niv.innerHTML=="Master 1";
          var donnee = master1bigdata;
        """),format.raw/*68.9*/("""}"""),format.raw/*68.10*/("""
        """),format.raw/*69.9*/("""if (laclass="Master 2") """),format.raw/*69.33*/("""{"""),format.raw/*69.34*/("""
          """),format.raw/*70.11*/("""fil.innerHTML=="Big Data Analytics";
          niv.innerHTML=="Master 2";
          var donnee = master2bigdata;
        """),format.raw/*73.9*/("""}"""),format.raw/*73.10*/("""
        """),format.raw/*74.9*/("""if (laclass="Master1") """),format.raw/*74.32*/("""{"""),format.raw/*74.33*/("""
          """),format.raw/*75.11*/("""fil.innerHTML=="Intelligence Artificielle";
          niv.innerHTML=="Master 1";
          var donnee = master1AI;
        """),format.raw/*78.9*/("""}"""),format.raw/*78.10*/("""
        """),format.raw/*79.9*/("""if (laclass="Master2") """),format.raw/*79.32*/("""{"""),format.raw/*79.33*/("""
          """),format.raw/*80.11*/("""fil.innerHTML=="Intelligence Artificielle";
          niv.innerHTML=="Master 2";
          var donnee = master2AI;
        """),format.raw/*83.9*/("""}"""),format.raw/*83.10*/("""

        """),format.raw/*85.9*/("""// Extraction des Valeurs 
        // ('#', 'Ide', 'NOM' and 'PRENOM')
        
        var col = [];
        for (var i = 0; i < donnee.length; i++) """),format.raw/*89.49*/("""{"""),format.raw/*89.50*/("""
            """),format.raw/*90.13*/("""for (var key in donnee[i]) """),format.raw/*90.40*/("""{"""),format.raw/*90.41*/("""
                """),format.raw/*91.17*/("""if (col.indexOf(key) === -1) """),format.raw/*91.46*/("""{"""),format.raw/*91.47*/("""
                    """),format.raw/*92.21*/("""col.push(key);
                """),format.raw/*93.17*/("""}"""),format.raw/*93.18*/("""
            """),format.raw/*94.13*/("""}"""),format.raw/*94.14*/("""
        """),format.raw/*95.9*/("""}"""),format.raw/*95.10*/("""

        """),format.raw/*97.9*/("""// Créer le tablau
        var table = document.createElement("table");

        // Créer le header du tableau
        var tr = table.insertRow(-1);                   // table row.

        for (var i = 0; i < col.length; i++) """),format.raw/*103.46*/("""{"""),format.raw/*103.47*/("""
            """),format.raw/*104.13*/("""var th = document.createElement("th");      // table header.
            th.innerHTML = col[i];
            tr.appendChild(th);
        """),format.raw/*107.9*/("""}"""),format.raw/*107.10*/("""

        """),format.raw/*109.9*/("""// ajouter les données dans les celllules du tableau
        for (var i = 0; i < donnee.length; i++) """),format.raw/*110.49*/("""{"""),format.raw/*110.50*/("""

            """),format.raw/*112.13*/("""tr = table.insertRow(-1);

            for (var j = 0; j < col.length; j++) """),format.raw/*114.50*/("""{"""),format.raw/*114.51*/("""
                """),format.raw/*115.17*/("""var tabCell = tr.insertCell(-1);
                tabCell.innerHTML = donnee[i][col[j]];
            """),format.raw/*117.13*/("""}"""),format.raw/*117.14*/("""
        """),format.raw/*118.9*/("""}"""),format.raw/*118.10*/("""

      
        """),format.raw/*121.9*/("""var divShowData = document.getElementById('showData');
        divShowData.innerHTML = "";
        divShowData.appendChild(table);

  

  //Ecriture
       

"""),format.raw/*130.1*/("""}"""),format.raw/*130.2*/("""
"""),format.raw/*131.1*/("""</script>
<style>
table, td, th """),format.raw/*133.15*/("""{"""),format.raw/*133.16*/("""
  """),format.raw/*134.3*/("""border: 1px solid rgb(255, 255, 255);
"""),format.raw/*135.1*/("""}"""),format.raw/*135.2*/("""

"""),format.raw/*137.1*/("""table """),format.raw/*137.7*/("""{"""),format.raw/*137.8*/("""
  """),format.raw/*138.3*/("""width: 100%;
  border-collapse: collapse;
"""),format.raw/*140.1*/("""}"""),format.raw/*140.2*/("""
"""),format.raw/*141.1*/("""</style>
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
<!-- Inclure Scala.js compiled code -->
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
<section >
  <p style="margin-left: 550px;">Liste des étudiants par Classe</p>
  <div style="background-color:
  #6495ed;
   width: 600px;
   height: 50px;
   margin-left: 350px;
   display: flex;">
    <form method="POST" action="" style=" flex: 1;
    padding: 1em; margin-left: 100px;">
      <label>Choisir CLasse</label>
      <select name="cars" id="nivetude">
        <optgroup label="Big Data Analytics">
          <option value="Master 1">Master 1</option>
          <option value="Master 2">Master 2</option>
        </optgroup>
        <optgroup label="Intelligence Artificielle">
          <option value="Master1">Master1</option>
          <option value="Master2">Master2</option>
        </optgroup>
      </select>
     </form>
     <div style=" flex: 1;
     padding: 1em;">
    <input type="submit" value="Submit" onClick="Fonction1();">
  </div>
   </div>
<div style="display: flex; width:500px; margin-left: 500px;" >
  <div style=" flex: 1;
  padding: 1em;"><p id="fil">Filiére</p></div>
  <div style=" flex: 1;
  padding: 1em;" ><p id="niv">Niveau</p></div>
  
</div>
</section>
<table class="table" style="margin-top: 30px; width: 800px; margin-left: 275px;" >
  <thead class="thead-dark" style="background-color: #2980B9;" id ="showData">
  <tr>
    <th scope="col">#</th>
    <th scope="col">IDE</th>
    <th scope="col">NOM</th>
    <th scope="col">PRENOM</th>
  </tr>

  </thead>
    
</table>



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
                  SOURCE: app/views/Etudiant.scala.html
                  HASH: 42cce9a142e195aae5b462e14cbb9ae7784b7676
                  MATRIX: 814->1|835->14|874->16|901->17|1077->165|1106->166|1136->169|1242->247|1271->248|1387->336|1416->337|1458->351|1487->352|1605->442|1634->443|1676->457|1705->458|1822->547|1851->548|1901->571|1974->616|2003->617|2119->705|2148->706|2190->720|2219->721|2335->809|2364->810|2406->824|2435->825|2552->914|2581->915|2618->925|2686->965|2715->966|2831->1054|2860->1055|2902->1069|2931->1070|3053->1164|3082->1165|3124->1179|3153->1180|3269->1268|3298->1269|3335->1279|3403->1319|3432->1320|3551->1411|3580->1412|3622->1426|3651->1427|3768->1516|3797->1517|3839->1531|3868->1532|3986->1622|4015->1623|4052->1633|4186->1739|4215->1740|4254->1751|4402->1872|4431->1873|4467->1882|4519->1906|4548->1907|4587->1918|4735->2039|4764->2040|4800->2049|4851->2072|4880->2073|4919->2084|5069->2207|5098->2208|5134->2217|5185->2240|5214->2241|5253->2252|5403->2375|5432->2376|5469->2386|5647->2536|5676->2537|5717->2550|5772->2577|5801->2578|5846->2595|5903->2624|5932->2625|5981->2646|6040->2677|6069->2678|6110->2691|6139->2692|6175->2701|6204->2702|6241->2712|6497->2939|6527->2940|6569->2953|6733->3089|6763->3090|6801->3100|6931->3201|6961->3202|7004->3216|7109->3292|7139->3293|7185->3310|7314->3410|7344->3411|7381->3420|7411->3421|7456->3438|7642->3596|7671->3597|7700->3598|7761->3630|7791->3631|7822->3634|7888->3672|7917->3673|7947->3675|7981->3681|8010->3682|8041->3685|8111->3727|8140->3728|8169->3729
                  LINES: 26->1|26->1|26->1|27->2|36->11|36->11|37->12|39->14|39->14|41->16|41->16|42->17|42->17|44->19|44->19|45->20|45->20|47->22|47->22|50->25|52->27|52->27|54->29|54->29|55->30|55->30|57->32|57->32|58->33|58->33|60->35|60->35|62->37|64->39|64->39|66->41|66->41|67->42|67->42|69->44|69->44|70->45|70->45|72->47|72->47|74->49|76->51|76->51|78->53|78->53|79->54|79->54|81->56|81->56|82->57|82->57|84->59|84->59|86->61|89->64|89->64|90->65|93->68|93->68|94->69|94->69|94->69|95->70|98->73|98->73|99->74|99->74|99->74|100->75|103->78|103->78|104->79|104->79|104->79|105->80|108->83|108->83|110->85|114->89|114->89|115->90|115->90|115->90|116->91|116->91|116->91|117->92|118->93|118->93|119->94|119->94|120->95|120->95|122->97|128->103|128->103|129->104|132->107|132->107|134->109|135->110|135->110|137->112|139->114|139->114|140->115|142->117|142->117|143->118|143->118|146->121|155->130|155->130|156->131|158->133|158->133|159->134|160->135|160->135|162->137|162->137|162->137|163->138|165->140|165->140|166->141
                  -- GENERATED --
              */
          