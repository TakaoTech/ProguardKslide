package presentation

import com.kslides.Presentation
import com.kslides.Transition
import kotlinx.html.div
import kotlinx.html.h3
import kotlinx.html.img

fun Presentation.startAndClosePage(
    title: String? = null
) {
    dslSlide {
        slideConfig {
            // Assign slide config defaults for all slides in this presentation
            //backgroundColor = "red"
            transition = Transition.NONE
        }

        content {
            div {
                style = "display: flex; align-items: center; font-family: Arial, sans-serif;"
                img(src = "images/qr-code-takaotech.png") {
                    width = "500px"
                    height = "500px"
                }
                div {
                    h3 {
                        if (title != null){
                            + title
                        }else{
                            + "Links Vari, nel caso li vogliate"
                        }

                    }
                }
            }
        }
    }
}