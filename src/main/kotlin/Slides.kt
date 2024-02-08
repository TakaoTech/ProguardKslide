import com.kslides.PresentationTheme
import com.kslides.Speed
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

        presentationConfig {
            history = true
            transitionSpeed = Speed.DEFAULT

            enableSpeakerNotes = true
            theme = PresentationTheme.DRACULA
            slideNumber = "c/t"

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
            path = "/"

            startPage()
            kaiserInsightPage()

            proguardintroPage()
            exclusionConfig()
            shrinkingConfigPage()
            optimizationConfigPage()

            proguardR8Difference()

            proguardTips()
        }
    }
}
