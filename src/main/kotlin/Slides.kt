import com.kslides.PresentationTheme
import com.kslides.Speed
import com.kslides.Transition
import com.kslides.kslides
import com.pambrose.srcref.Api.srcrefUrl
import presentation.*

fun main() {

    val slides = "src/main/kotlin/Slides.kt"

    fun srcrefLink(token: String, escapeHtml4: Boolean = false) =
        srcrefUrl(
            account = "kslides",
            repo = "kslides-template",
            path = slides,
            beginRegex = "\\s+// $token begin",
            beginOffset = 1,
            endRegex = "\\s+// $token end",
            endOffset = -1,
            escapeHtml4 = escapeHtml4,
        )

    kslides {

        output {
            // Write the presentation's html files to /docs for GitHub Pages or netlify.com
            enableFileSystem = true

            // Run locally or on Heroku
            enableHttp = true
        }

        // CSS values assigned here are applied to all the presentations
        css +=
            """
      #githubCorner path { 
        fill: #258BD2; 
      }
      """

        presentationConfig {
            history = true
            transition = Transition.SLIDE
            transitionSpeed = Speed.SLOW

            topLeftHref = "https://github.com/kslides/kslides-template/" // Assign to "" to turn this off
            topLeftTitle = "View presentation source on Github"

            topRightHref = "/"  // Assign to "" to turn this off
            topRightTitle = "Go to 1st Slide"
            topRightText = "🏠"

            enableMenu = true
            enableSpeakerNotes = true
            theme = PresentationTheme.SOLARIZED
            slideNumber = "c/t"

            menuConfig {
                numbers = true
            }

            copyCodeConfig {
                timeout = 2000
                copy = "Copy"
                copied = "Copied!"
            }

            slideConfig {
                // Assign slide config defaults for all presentations
                // backgroundColor = "blue"
            }
        }

        presentation {

            css +=
                """
                #ghsrc {
                  font-size: 30px;
                  text-decoration: underline;
                }  
                img[alt=revealjs-image] { 
                  width: 1000px; 
                }
                """

            presentationConfig {
                transition = Transition.CONCAVE

                slideConfig {
                    // Assign slide config defaults for all slides in this presentation
                    //backgroundColor = "red"
                }
            }

            startPage()
            kaiserInsightPage()

            proguardintroPage()
            exclusionConfig()
            shrinkingConfigPage()
            optimizationConfigPage()

            proguardR8Difference()

            proguardTips()

            //TODO DIFFERENCE PROGUARD - R8
        }
    }
}
