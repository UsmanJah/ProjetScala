
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

object statistique extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Hello")/*1.15*/ {_display_(Seq[Any](format.raw/*1.17*/("""
  """),format.raw/*2.3*/("""<html>
    <head> 
        <!--Ici commence le premier chart
        
        <script src="chart.js-3.5.0/package/dist/chart.js"></script>
      -->
    
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.5.0/chart.min.js  "></script>
    <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="../../webapp/css/default.css">
    </head>
   
    <body >
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
    <!-- Include Scala.js compiled code -->
<div style="width: 1000px; height: 500px; margin-left: 150px;">
<script type="text/javascript" src="./target/scala-2.13/scala-js-tutorial-fastopt/main.js"></script>

        
        <div style="display: flex;">
         <!--Ici commence le premier chart-->
            <div style="flex: 1; 
            padding: 1em; width: 100px; height: 100px;">
            <p style="margin-left: 100px;">Représentation de la moyenne par Classe</p>
         <canvas id="myChart" width="300" height="300" style="display: block; box-sizing: border-box; height: 1262px; width: 1262px;"></canvas>
          <script>
            
            var ctx = document.getElementById('myChart');
            var ctx = 'myChart';
var myChart = new Chart(ctx, """),format.raw/*47.30*/("""{"""),format.raw/*47.31*/("""
    """),format.raw/*48.5*/("""type: 'bar',
    data: """),format.raw/*49.11*/("""{"""),format.raw/*49.12*/("""
        """),format.raw/*50.9*/("""labels: ['Master 1 : Big Data', 'Master 2 :Big Data', 'Master 1: IA', 'Master 2:IA'],
        datasets: ["""),format.raw/*51.20*/("""{"""),format.raw/*51.21*/("""
            """),format.raw/*52.13*/("""label: '# of Votes',
            data: [13, 16, 14, 17],
            backgroundColor: [
                'rgba(255, 99, 132, 0.2)',
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',
                'rgba(75, 192, 192, 0.2)'
                
            ],
            borderColor: [
                'rgba(255, 99, 132, 1)',
                'rgba(54, 162, 235, 1)',
                'rgba(255, 206, 86, 1)',
                'rgba(75, 192, 192, 1)'
                
            ],
            borderWidth: 1
        """),format.raw/*69.9*/("""}"""),format.raw/*69.10*/("""]
    """),format.raw/*70.5*/("""}"""),format.raw/*70.6*/(""",
    options: """),format.raw/*71.14*/("""{"""),format.raw/*71.15*/("""
        """),format.raw/*72.9*/("""scales: """),format.raw/*72.17*/("""{"""),format.raw/*72.18*/("""
            """),format.raw/*73.13*/("""y: """),format.raw/*73.16*/("""{"""),format.raw/*73.17*/("""
                """),format.raw/*74.17*/("""beginAtZero: true
            """),format.raw/*75.13*/("""}"""),format.raw/*75.14*/("""
        """),format.raw/*76.9*/("""}"""),format.raw/*76.10*/("""
    """),format.raw/*77.5*/("""}"""),format.raw/*77.6*/("""
"""),format.raw/*78.1*/("""}"""),format.raw/*78.2*/(""");

        
          </script>
            </div>

     <!--Ici commence le second chart-->     
            <div style="flex: 1; 
            padding: 1em;">
             <p style="margin-left: 100px;">Représentation de la moyenne par Matiére</p>
              <canvas id="marksChart" width="" height=""></canvas>
              <script>
                  var marksCanvas = document.getElementById("marksChart");
  
  
  var marksData = """),format.raw/*93.19*/("""{"""),format.raw/*93.20*/("""
    """),format.raw/*94.5*/("""labels: ["Optimisation Contiinue", "Programmation Fonctionnelle", "UMl", "Statistique", "Big Data"],
    datasets: ["""),format.raw/*95.16*/("""{"""),format.raw/*95.17*/("""
      """),format.raw/*96.7*/("""label: "Master 1: Big Data",
      backgroundColor: "transparent",
      borderColor: "rgba(200,0,0,0.6)",
      fill: false,
      radius: 6,
      pointRadius: 6,
      pointBorderWidth: 3,
      pointBackgroundColor: "orange",
      pointBorderColor: "rgba(200,0,0,0.6)",
      pointHoverRadius: 10,
      data: [14, 15, 16, 17, 13]
    """),format.raw/*107.5*/("""}"""),format.raw/*107.6*/(""", """),format.raw/*107.8*/("""{"""),format.raw/*107.9*/("""
      """),format.raw/*108.7*/("""label: "Master 2: Big Data",
      backgroundColor: "transparent",
      borderColor: "rgba(0,0,200,0.6)",
      fill: false,
      radius: 6,
      pointRadius: 6,
      pointBorderWidth: 3,
      pointBackgroundColor: "cornflowerblue",
      pointBorderColor: "rgba(0,0,200,0.6)",
      pointHoverRadius: 10,
      data: [12, 18, 19, 13, 20]
    """),format.raw/*119.5*/("""}"""),format.raw/*119.6*/(""",
    """),format.raw/*120.5*/("""{"""),format.raw/*120.6*/("""
      """),format.raw/*121.7*/("""label: "Master 1: IA",
      backgroundColor: "transparent",
      borderColor: "rgba(0,0,200,0.6)",
      fill: false,
      radius: 6,
      pointRadius: 6,
      pointBorderWidth: 3,
      pointBackgroundColor: "cornflowerblue",
      pointBorderColor: "rgba(0,0,200,0.6)",
      pointHoverRadius: 10,
      data: [13, 14, 16, 17, 14]
    """),format.raw/*132.5*/("""}"""),format.raw/*132.6*/(""","""),format.raw/*132.7*/("""{"""),format.raw/*132.8*/("""
    """),format.raw/*133.5*/("""label: "Master 2: IA",
      backgroundColor: "transparent",
      borderColor: "rgba(0,0,200,0.6)",
      fill: false,
      radius: 6,
      pointRadius: 6,
      pointBorderWidth: 3,
      pointBackgroundColor: "cornflowerblue",
      pointBorderColor: "rgba(0,0,200,0.6)",
      pointHoverRadius: 10,
      data: [13, 14, 16, 17, 15]
    """),format.raw/*144.5*/("""}"""),format.raw/*144.6*/("""]
  """),format.raw/*145.3*/("""}"""),format.raw/*145.4*/(""";
  
  var chartOptions = """),format.raw/*147.22*/("""{"""),format.raw/*147.23*/("""
    """),format.raw/*148.5*/("""scale: """),format.raw/*148.12*/("""{"""),format.raw/*148.13*/("""
      """),format.raw/*149.7*/("""ticks: """),format.raw/*149.14*/("""{"""),format.raw/*149.15*/("""
        """),format.raw/*150.9*/("""beginAtZero: true,
        min: 0,
        max: 100,
        stepSize: 20
      """),format.raw/*154.7*/("""}"""),format.raw/*154.8*/(""",
      pointLabels: """),format.raw/*155.20*/("""{"""),format.raw/*155.21*/("""
        """),format.raw/*156.9*/("""fontSize: 18
      """),format.raw/*157.7*/("""}"""),format.raw/*157.8*/("""
    """),format.raw/*158.5*/("""}"""),format.raw/*158.6*/(""",
    legend: """),format.raw/*159.13*/("""{"""),format.raw/*159.14*/("""
      """),format.raw/*160.7*/("""position: 'left'
    """),format.raw/*161.5*/("""}"""),format.raw/*161.6*/("""
  """),format.raw/*162.3*/("""}"""),format.raw/*162.4*/(""";
  
  var radarChart = new Chart(marksCanvas, """),format.raw/*164.43*/("""{"""),format.raw/*164.44*/("""
    """),format.raw/*165.5*/("""type: 'radar',
    data: marksData,
    options: chartOptions
  """),format.raw/*168.3*/("""}"""),format.raw/*168.4*/(""");
              </script>
     
           
            </div>
        </div>




        <div style="display: flex;">
 <!--Ici commence le troisiéme chart-->
            <div style="flex: 1; 
            padding: 1em; width: 200px; height: 200px;">
            <p style="margin-left: 100px;">Fais pour éviter un espace vide</p>
            <canvas id="birdsChart" width="" height=""></canvas>
            
            <script> 
              var birdsCanvas = document.getElementById("birdsChart");

var birdsData = """),format.raw/*188.17*/("""{"""),format.raw/*188.18*/("""
    """),format.raw/*189.5*/("""labels: ['Master 1 : Big Data', 'Master 2 :Big Data', 'Master 1: IA', 'Master 2:IA'],
  datasets: ["""),format.raw/*190.14*/("""{"""),format.raw/*190.15*/("""
    """),format.raw/*191.5*/("""data: [13, 16, 14, 17],
    backgroundColor: [
      "rgba(255, 0, 0, 0.5)",
      "rgba(100, 255, 0, 0.5)",
      "rgba(200, 50, 255, 0.5)",
      "rgba(0, 100, 255, 0.5)"
    ]
  """),format.raw/*198.3*/("""}"""),format.raw/*198.4*/("""]
"""),format.raw/*199.1*/("""}"""),format.raw/*199.2*/(""";

var polarAreaChart = new Chart(birdsCanvas, """),format.raw/*201.45*/("""{"""),format.raw/*201.46*/("""
  """),format.raw/*202.3*/("""type: 'polarArea',
  data: birdsData
"""),format.raw/*204.1*/("""}"""),format.raw/*204.2*/(""");
            </script>
          
            </div>
             <!--Ici commence le quatriéme chart-->
            <div style="flex: 1; 
            padding: 1em;">
            <p style="margin-left: 100px;">Représentation des taux d'échec et de réussite</p>
            <canvas id="doughnut-chart" width="" height=""></canvas>
            
            <script>
                new Chart(document.getElementById("doughnut-chart"), """),format.raw/*215.70*/("""{"""),format.raw/*215.71*/("""
    """),format.raw/*216.5*/("""type: 'doughnut',
    data: """),format.raw/*217.11*/("""{"""),format.raw/*217.12*/("""
      """),format.raw/*218.7*/("""labels: ["Taux d'échec", "Taux de réussite"],
      datasets: [
        """),format.raw/*220.9*/("""{"""),format.raw/*220.10*/("""
          """),format.raw/*221.11*/("""label: "Population (millions)",
          backgroundColor: ["#3e95cd", "#8e5ea2"],
          data: [10,90]
        """),format.raw/*224.9*/("""}"""),format.raw/*224.10*/("""
      """),format.raw/*225.7*/("""]
    """),format.raw/*226.5*/("""}"""),format.raw/*226.6*/(""",
    options: """),format.raw/*227.14*/("""{"""),format.raw/*227.15*/("""
      """),format.raw/*228.7*/("""title: """),format.raw/*228.14*/("""{"""),format.raw/*228.15*/("""
        """),format.raw/*229.9*/("""display: true,
        text: 'Predicted world population (millions) in 2050'
      """),format.raw/*231.7*/("""}"""),format.raw/*231.8*/("""
    """),format.raw/*232.5*/("""}"""),format.raw/*232.6*/("""
"""),format.raw/*233.1*/("""}"""),format.raw/*233.2*/(""");
            </script>
            
           
            </div>
        </div>
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
        © 2021 Copyright: Ousmanae Dia

    </div>
    <!-- Copyright -->
</footer>
</div>

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
                  SOURCE: app/views/statistique.scala.html
                  HASH: 5c76221986c446d61f57dda8ecf4795b47d71274
                  MATRIX: 817->1|838->14|877->16|906->19|2933->2018|2962->2019|2994->2024|3045->2047|3074->2048|3110->2057|3243->2162|3272->2163|3313->2176|3888->2724|3917->2725|3950->2731|3978->2732|4021->2747|4050->2748|4086->2757|4122->2765|4151->2766|4192->2779|4223->2782|4252->2783|4297->2800|4355->2830|4384->2831|4420->2840|4449->2841|4481->2846|4509->2847|4537->2848|4565->2849|5032->3288|5061->3289|5093->3294|5237->3410|5266->3411|5300->3418|5668->3758|5697->3759|5727->3761|5756->3762|5791->3769|6167->4117|6196->4118|6230->4124|6259->4125|6294->4132|6664->4474|6693->4475|6722->4476|6751->4477|6784->4482|7154->4824|7183->4825|7215->4829|7244->4830|7299->4856|7329->4857|7362->4862|7398->4869|7428->4870|7463->4877|7499->4884|7529->4885|7566->4894|7674->4974|7703->4975|7753->4996|7783->4997|7820->5006|7867->5025|7896->5026|7929->5031|7958->5032|8001->5046|8031->5047|8066->5054|8115->5075|8144->5076|8175->5079|8204->5080|8280->5127|8310->5128|8343->5133|8435->5197|8464->5198|9011->5716|9041->5717|9074->5722|9202->5821|9232->5822|9265->5827|9474->6008|9503->6009|9533->6011|9562->6012|9638->6059|9668->6060|9699->6063|9764->6100|9793->6101|10257->6536|10287->6537|10320->6542|10377->6570|10407->6571|10442->6578|10542->6650|10572->6651|10612->6662|10755->6777|10785->6778|10820->6785|10854->6791|10883->6792|10927->6807|10957->6808|10992->6815|11028->6822|11058->6823|11095->6832|11206->6915|11235->6916|11268->6921|11297->6922|11326->6923|11355->6924
                  LINES: 26->1|26->1|26->1|27->2|72->47|72->47|73->48|74->49|74->49|75->50|76->51|76->51|77->52|94->69|94->69|95->70|95->70|96->71|96->71|97->72|97->72|97->72|98->73|98->73|98->73|99->74|100->75|100->75|101->76|101->76|102->77|102->77|103->78|103->78|118->93|118->93|119->94|120->95|120->95|121->96|132->107|132->107|132->107|132->107|133->108|144->119|144->119|145->120|145->120|146->121|157->132|157->132|157->132|157->132|158->133|169->144|169->144|170->145|170->145|172->147|172->147|173->148|173->148|173->148|174->149|174->149|174->149|175->150|179->154|179->154|180->155|180->155|181->156|182->157|182->157|183->158|183->158|184->159|184->159|185->160|186->161|186->161|187->162|187->162|189->164|189->164|190->165|193->168|193->168|213->188|213->188|214->189|215->190|215->190|216->191|223->198|223->198|224->199|224->199|226->201|226->201|227->202|229->204|229->204|240->215|240->215|241->216|242->217|242->217|243->218|245->220|245->220|246->221|249->224|249->224|250->225|251->226|251->226|252->227|252->227|253->228|253->228|253->228|254->229|256->231|256->231|257->232|257->232|258->233|258->233
                  -- GENERATED --
              */
          