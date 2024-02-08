package presentation

import com.kslides.Presentation
import com.kslides.Transition

fun Presentation.proguardintroPage() {
	markdownSlide {
		slideConfig {
			// Assign slide config defaults for all slides in this presentation
			//backgroundColor = "red"
			transition = Transition.ZOOM
		}
		content {
			"""
			![Alt text](images/proguardlogo.webp)
			Shrink, optimize and obfuscate
				 
			[Repo Url](https://github.com/Guardsquare/proguard)		
				 
			Notes: ProGuard è un separatore, ottimizzatore e offuscatore per Java bytecode
			"""
		}
	}
}