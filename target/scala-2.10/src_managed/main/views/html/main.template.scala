
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Project],User,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(projects: List[Project], user: User)(body: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.51*/("""

<html>
    <head>
        <title>Zentasks</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/main.css"))),format.raw/*7.110*/("""">
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*8.46*/routes/*8.52*/.Assets.at("javascripts/jquery-1.7.1.js"))),format.raw/*8.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*9.46*/routes/*9.52*/.Assets.at("javascripts/jquery-play-1.7.1.js"))),format.raw/*9.98*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*10.46*/routes/*10.52*/.Assets.at("javascripts/underscore-min.js"))),format.raw/*10.95*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*11.46*/routes/*11.52*/.Assets.at("javascripts/backbone-min.js"))),format.raw/*11.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*12.46*/routes/*12.52*/.Assets.at("javascripts/main.js"))),format.raw/*12.85*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*13.46*/routes/*13.52*/.Application.javascriptRoutes)),format.raw/*13.81*/(""""></script>
    </head>
    <body>
        <header>
            <a href=""""),_display_(Seq[Any](/*17.23*/routes/*17.29*/.Projects.index)),format.raw/*17.44*/("""" id="logo"><span>Zen</span>tasks</a>
            <dl id="user">
                <dt>"""),_display_(Seq[Any](/*19.22*/user/*19.26*/.name)),format.raw/*19.31*/(""" <span>("""),_display_(Seq[Any](/*19.40*/user/*19.44*/.email)),format.raw/*19.50*/(""")</span></dt>
                <dd>
                    <a href=""""),_display_(Seq[Any](/*21.31*/routes/*21.37*/.Application.logout())),format.raw/*21.58*/("""">Logout</a>
                </dd>
            </dl>
        </header>
        <nav>
            <h4 class="dashboard"><a href="#/">Dashboard</a></h4>
            <ul id="projects">
                """),_display_(Seq[Any](/*28.18*/projects/*28.26*/.groupBy(_.folder).map/*28.48*/ {/*29.21*/case (group, projects) =>/*29.46*/ {_display_(Seq[Any](format.raw/*29.48*/("""
                        """),_display_(Seq[Any](/*30.26*/views/*30.31*/.html.projects.group(group, projects))),format.raw/*30.68*/("""
                    """)))}})),format.raw/*32.18*/("""
            </ul>
            <button id="newGroup">New group</button>
        </nav>
        <section id="main">
            """),_display_(Seq[Any](/*37.14*/body)),format.raw/*37.18*/("""
        </section>
    </body>
</html>

"""))}
    }
    
    def render(projects:List[Project],user:User,body:Html): play.api.templates.Html = apply(projects,user)(body)
    
    def f:((List[Project],User) => (Html) => play.api.templates.Html) = (projects,user) => (body) => apply(projects,user)(body)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Apr 28 00:32:08 CEST 2013
                    SOURCE: /home/wouter/opt/play-2.1.0/samples/java/zentasks/app/views/main.scala.html
                    HASH: 8a252b5c6a41db8944ecd8a149f2c7c3bd7ccae6
                    MATRIX: 739->1|865->50|1010->160|1024->166|1077->198|1184->270|1198->276|1254->310|1337->358|1351->364|1413->405|1505->462|1519->468|1586->514|1679->571|1694->577|1759->620|1852->677|1867->683|1930->724|2023->781|2038->787|2093->820|2186->877|2201->883|2252->912|2362->986|2377->992|2414->1007|2536->1093|2549->1097|2576->1102|2621->1111|2634->1115|2662->1121|2763->1186|2778->1192|2821->1213|3056->1412|3073->1420|3104->1442|3115->1465|3149->1490|3189->1492|3251->1518|3265->1523|3324->1560|3379->1600|3543->1728|3569->1732
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|45->17|45->17|45->17|47->19|47->19|47->19|47->19|47->19|47->19|49->21|49->21|49->21|56->28|56->28|56->28|56->29|56->29|56->29|57->30|57->30|57->30|58->32|63->37|63->37
                    -- GENERATED --
                */
            