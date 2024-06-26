package presentation

import com.kslides.Presentation
import com.kslides.Transition
import com.kslides.include

fun Presentation.exclusionConfig() {
	markdownSlide {
		slideConfig {
			// Assign slide config defaults for all slides in this presentation
			transition = Transition.SLIDE
		}
		content {
			"""
			### Exclusion Template
			
			```	
			${include("codes/exclusionTemplate.txt")}
			```
			
			Notes:
			- [] Sono opzionali
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
				# Keep Configuration
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
			``` java [1|3|4-5|7-12|14]
			${include("codes/exclusion1.txt")}
			```
				 
			Notes:
			Specifica la classe o le classi e i membri in esse contenute, devono essere preservati come punto di ingresso del codice
			
			1) Configurato in questo modo salva la classe MyActivity
			2) Configurato in questo modo il nome delle classi e degli attributi che imlementano Parcelable non verranno rimossi o rinominati
			3) Configurato in questo modo tutte le classi pubbliche che estendono View, che hanno i costruttori con i parametri specificati e tutti metodi void che iniziano con set verranno mantenuti. Tutto il resto verrà modificato.
			4) Configurato in questo tutte le classi e tutto il contenuto, dentro al package com.github, non verrà modificato.
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
			```
			-keepclassmembers [modificatore] [specifica classe/i]
			```
			
			``` kotlin
			-keepclassmembers class * implements android.os.Parcelable {    *;}

			```
			Notes:
			Specifica che solo i membri della classe o classi in esse contenute devono essere preservate
			
			1) Configurato in questo modo solo i membri delle classi che implementano Parcelable non verranno rimossi o rinominati
			
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
			```
			-keepclasseswithmembers  [modificatore] [specifica classe/i]
			```
			
			``` kotlin
			${include("codes/exclusion2.txt")}
			```
			Notes:
			Specifica la classe o le classi e i membri in essa contenuti non verranno rinominati o rimossi, a patto che siano presenti nelle classi tutte le condizionali specificate
			
			1) Configurato in questo modo preserverà le classi e i membri che hanno nel costruttore un Context, un AttributeSet e un int.
	
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
			```
			-keepnames [specifica classe/i]
			
			Alternativa a 
			-keep,allowshrinking
			```
			
			``` kotlin
			-keepnames class your.package.name.ClassName
			```
			Notes:
			Specifica la classe o le classi e i membri in esse contenuti devono essere conservati, se non rimossi dopo la fase di riduzione
			
			1) Dopo la fase di riduzione, verrà conservata la classe ClassName e i membri in essa contenuti nella fase di offuscamento
	
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
			```
			-keepclassmembernames [specifica classe/i]
			
			Alternativa a 
			-keepclassmembers,allowshrinking
			```
			
			``` kotlin
			-keepnames class your.package.name.ClassName
			```
			Notes:
			Specifica la classe o le classi e i membri in esse contenuti devono essere conservati, se non rimossi dopo la fase di riduzione
			
			1) Dopo la fase di riduzione, verrà conservata la classe ClassName e i membri in essa contenuti nella fase di offuscamento
	
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
			```
			-keepclasseswithmembernames [specifica classe/i]
			
			Alternativa a 
			-keepclasseswithmembers,allowshrinking [specifica classe/i]
			```
			
			``` kotlin
			-keepclasseswithmembernames class * {        
			  public &lt;init&gt;(android.content.Context, android.util.AttributeSet, int); 
			}

			```
			Notes:
			Specifica la classe o le classi e i membri i cui nomi devono essere conservati se le condizioni vengono rispettate, se sono presenti dopo la fase di riduzione
			
			1) Dopo la fase di riduzione, tutte le classi che contengono il costruttore con parametri Context, AttributeSet e int, non verranno offuscate le classi e i membri
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
			```
			-if [specifica classe/i]
			```
			
			``` kotlin
			${include("codes/exclusion3.txt")}
			```
			Notes:
			Specifies classes and class members that must be present to activate 
			the subsequent keep option (-keep, -keepclassmembers,...). 
			The condition and the subsequent keep option can share wildcards and references to wildcards. For example, you can keep classes on the condition that classes with related names exist in your project, with frameworks like Dagger and Butterknife.
			""".trimIndent()
		}
	}

	dslSlide {
		slideConfig {
			// Assign slide config defaults for all slides in this presentation
			transition = Transition.SLIDE
			backgroundImage = "images/karyl-confused.png"
		}
		content {

		}
	}
}