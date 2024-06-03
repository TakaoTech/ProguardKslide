package presentation

import com.kslides.Presentation
import com.kslides.Transition
import kotlinx.html.img

fun Presentation.kotlinItalia() {
    dslSlide {
        slideConfig {
            // Assign slide config defaults for all slides in this presentation
            transition = Transition.FADE
        }
        content {
            img(src = "images/KotlinItaliaLogoRounded.png")
        }
    }
}
