package presentation

import com.kslides.Presentation
import com.kslides.Transition

fun Presentation.optimizationConfigPage() {
	verticalSlides {
		markdownSlide {
			slideConfig {
				// Assign slide config defaults for all slides in this presentation
				transition = Transition.SLIDE
			}
			content {
				"""
					``` [1|2|3]
					-dontoptimize
					-optimizations [filtro ottimizzazione]
					-optimizationpasses n
					```
					
					Notes:
					1) Specifica a ProGuard di non ottimizzare il codice. Di default ProGuard ottimizza tutto il codice a livello di bytecode
					2) Specifica le ottimizzazioni da abilitare e disabilitare, a un livello più preciso. Si applica solo durante l'ottimizzazione. Questa è un'opzione per i maniaci del pulito.
					3) Specifica a ProGuard il numero di passaggi di ottimizzazione che devono essere eseguiti.
				""".trimIndent()
			}
		}

		markdownSlide {
			slideConfig {
				// Assign slide config defaults for all slides in this presentation
				transition = Transition.ZOOM
			}
			content {
				//TODO Inserire qualche filtro esempio
				"""
					[Lista filtri](https://www.guardsquare.com/manual/configuration/optimizations)
					```
				
					```
			
					Notes:
				""".trimIndent()
			}
		}
	}

}