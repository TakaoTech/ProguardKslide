package presentation

import com.kslides.Presentation
import com.kslides.Transition

fun Presentation.shrinkingConfigPage() {
	markdownSlide {
		slideConfig {
			// Assign slide config defaults for all slides in this presentation
			transition = Transition.SLIDE
		}
		content {
			"""
			# Shrinking Configuration
			""".trimIndent()
		}
	}

	verticalSlides {
		markdownSlide {
			slideConfig {
				// Assign slide config defaults for all slides in this presentation
				transition = Transition.SLIDE
			}
			content {
				"""
				```Java
				-dontshrink
				
				-printusage [nome file]
				-printusage &lt;output-dir&gt;/usage.txt
				
				-whyareyoukeeping [specifica classe/i]
				```
				
				Notes:
				1) Specifica a ProGuard di non ridurre il codice. Di default ProGuard rimuove tutte le classi e i membri non usati,
				mantenendo solo le esclusioni. Dopo ogni fase di ottimizzazione viene applicata nuovamente la fase di riduzione.
				2) Specifica a ProGuard di elencare il codice che verrà rimosso dalla classe in input e di stamparlo (o salvarlo su file)
				3) Specifica a ProGuard di stampare il motivo per cui le classi e relativi membri verranno mantenuti dopo la fase di riduzione
			
				""".trimIndent()
			}
		}

		markdownSlide {
			slideConfig {
				// Assign slide config defaults for all slides in this presentation
				transition = Transition.SLIDE
			}
			content {
				"""
				![WhyAreYouKeeping](images/whyareyoukeeping.png)
				""".trimIndent()
			}
		}


	}
}