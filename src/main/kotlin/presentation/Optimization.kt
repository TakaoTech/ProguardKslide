package presentation

import com.kslides.Presentation
import com.kslides.Transition
import com.kslides.include

fun Presentation.optimizationConfigPage() {
	markdownSlide {
		slideConfig {
			// Assign slide config defaults for all slides in this presentation
			transition = Transition.SLIDE
		}
		content {
			"""
			```text [1|2|3]
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
			transition = Transition.SLIDE
		}
		content {
			"""
			```
			${include("codes/optimization1.txt")}
			```
	
			Notes:
			Specifica a ProGuard il numero di passaggi di ottimizzazione che devono essere eseguiti.
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
			-assumenosideeffects [specifica classe]
			
			-assumenosideeffects class android.util.Log {    
				public static boolean isLoggable(java.lang.String, int);    
				public static int v(...);    
				public static int i(...);    
				public static int w(...);   
				public static int d(...);    
				public static int e(...);
			}
			```
	
			Notes:
			Specifica i metodi che non hanno nessun effetto collaterale, oltre alla possibilità di restituire un valore.
			Nella fase di ottimizzazione ProGuard rimuoverà tali metodi se determina che i valori restituiti non vengano usati.
			Usare con cautela, potrebbe rompere il codice.
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
			-assumenoexternalsideeffects [specifica classe]
			-assumenoescapingparameters [specifica classe]
			-assumenoexternalreturnvalues [specifica classe]
			```
	
			Notes:
			Usare con cautela, potrebbe rompere il codice.
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
			-assumevalues [specifica classe/i]
			
			-assumevalues class Count {  
				static int count return 0..2147483647;
			}
			
			if (count/* [0..2147483647] */ &lt; 0) {  
				throw new IllegalStateException();
			}
			
			
			if (false) {  
				throw new IllegalStateException();
			}
			```
	
			Notes:
			Specifica dei valori fissi o intervalli di valori per i campi e metodi primitivi, 
			adattando l'ottimizzazione di ProGuard su quei valori.
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
			```Text
			-mergeinterfacesaggressively
			```
	
			Notes:
			Specifica che le interfacce possono essere unite, anche se le relative classi 
			di implementazione non implementano tutti i metodi di interfaccia. 
			Ciò può ridurre la dimensione dell'output riducendo il numero totale di classi. 
			Si noti che le specifiche di compatibilità binaria di Java consentono tali costrutti.
			 l'impostazione di questa opzione può ridurre le prestazioni del codice elaborato su alcune JVM, 
			 poiché la compilazione just-in-time avanzata tende a privilegiare più interfacce con meno classi di implementazione.
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
			```Text
			-optimizeaggressively
			```
	
			Notes:
			
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
			```Text
			-allowaccessmodification

			```
	
			Notes:
			Specifica a ProGuard che i modificatori di accesso alle classi e membri della classe possono essere ampliati, ad esempio con un getter pubblico potrebbe essere necessario rendere pubblica anche il campo.
			Nota: non usare sulle librerie	
			""".trimIndent()
		}
	}

}