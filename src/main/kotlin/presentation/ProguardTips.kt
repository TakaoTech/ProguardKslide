package presentation

import com.kslides.Presentation
import com.kslides.Transition
import kotlinx.html.img

fun Presentation.proguardTips() {
	verticalSlides {
		markdownSlide {
			slideConfig {
				// Assign slide config defaults for all slides in this presentation
				transition = Transition.SLIDE
			}
			content {
				"""
			 	Tips su proguard
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
				![Alt text]("images/kotlinBytecode.png")
				Notes:
				Arma 1: vedere il bytecode generato da kotlin
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
				[Intrinsics](https://raw.githubusercontent.com/JetBrains/kotlin/master/libraries/stdlib/jvm/runtime/kotlin/jvm/internal/Intrinsics.java)
				
				```Kotlin
				Intrinsics.checkParameterIsNotNull(importantString, "importantString")
				Intrinsics.throwUninitializedPropertyAccessException("importantVar")
				```
				
				```Java
				-assumenosideeffects class kotlin.jvm.internal.Intrinsics {
				    public static void checkNotNull(java.lang.Object);
				    public static void checkNotNull(java.lang.Object, java.lang.String);
				    public static void checkExpressionValueIsNotNull(java.lang.Object, java.lang.String);
				    public static void checkNotNullExpressionValue(java.lang.Object, java.lang.String);
				    public static void checkReturnedValueIsNotNull(java.lang.Object, java.lang.String, java.lang.String);
				    public static void checkReturnedValueIsNotNull(java.lang.Object, java.lang.String);
				    public static void checkFieldIsNotNull(java.lang.Object, java.lang.String, java.lang.String);
				    public static void checkFieldIsNotNull(java.lang.Object, java.lang.String);
				    public static void checkParameterIsNotNull(java.lang.Object, java.lang.String);
				    public static void checkNotNullParameter(java.lang.Object, java.lang.String);
				}
				```
				""".trimIndent()
			}
		}

		dslSlide {
			slideConfig {
				// Assign slide config defaults for all slides in this presentation
				transition = Transition.SLIDE

			}
			content {
				img(src = "images/apkObfuscateBefore.png")
			}
		}

		markdownSlide {
			slideConfig {
				// Assign slide config defaults for all slides in this presentation
				transition = Transition.SLIDE
			}
			content {
				"""
				![Alt text]("images/apkObfuscateAfter.png")
				
				Notes:
				Arma 3: ricordatevi sempre di salvare i file della mappatura
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
				## ReTrace
				
				![Retrace Tool]("images/retrace.png")
				
				https://www.guardsquare.com/manual/tools/retrace
				https://developer.android.com/tools/retrace
				""".trimIndent()
			}
		}
	}
}
