package presentation

import com.kslides.Presentation
import com.kslides.Transition

fun Presentation.proguardR8Difference() {
	htmlSlide {
		slideConfig {
			// Assign slide config defaults for all slides in this presentation
			transition = Transition.SLIDE
		}
		content {

			"""
				<style>
				#mioDiv::-webkit-scrollbar {
				  width: 20px;
				}
				
				/* Track */
				#mioDiv::-webkit-scrollbar-track {
				  box-shadow: inset 0 0 5px grey; 
				  border-radius: 10px;
				}
				 
				/* Handle */
				#mioDiv::-webkit-scrollbar-thumb {
				  background: #8fb0e0; 
				  border-radius: 10px;
				}
				
				/* Handle on hover */
				#mioDiv::-webkit-scrollbar-thumb:hover {
				  background: #8fb0e0; 
				}
				
				#mioDiv {
				  overflow: auto;
				  height: 500px;
				}
				
				</style>
				
				<div id="mioDiv">
				
				<table cellspacing="0" style="border-width: 1px; border-style: solid; margin-left: auto; margin-right: auto;">
				<tbody>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;" width="70%"><strong>Optimization</strong></td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;" width="15%"><strong>ProGuard</strong></td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;" width="15%"><strong>R8</strong></td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Remove unused classes/fields/methods</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Inline constants</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Propagate constants</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Remove unused code</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Propagate constant arguments</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;"> </td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Propagate constant fields</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Remove write-only fields</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Make classes/fields/methods final/...</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;"> </td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Simplify plain enum types</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Simplify basic container classes</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;"> </td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Merge interfaces with single implementations</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Merge classes</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Remove unused parameters</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Propagate constant return values</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Make methods private</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;"> </td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Make methods static</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;"> </td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Desynchronize methods</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;"> </td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Simplify tail recursion</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;"> </td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Inline methods</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Outline common code into new methods</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;"> </td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Merge code</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Backport Java 8 closures</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Optimize Kotlin constructs</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;"> </td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Optimize use of GSON</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;"> </td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Remove logging calls</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Remove logging code</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">x</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">/</td>
				</tr>
				<tr>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">Peephole optimizations</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">520</td>
				<td style="border-width: 1px; border-style: solid; padding: 0px;">6</td>
				</tr>
				</tbody>
				</table>
				</div>
			"""
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
				Differenza peso tra Proguard e R8
				![Nothing](https://media1.tenor.com/m/dG_tr_lmYHkAAAAC/looking-around.gif)
				""".trimIndent()
			}
		}

		markdownSlide {
			slideConfig {
			}
			content {
				"""
					OK va bene ci ho provato, ma hanno reso quasi impossibile tornare a proguard su AGP 7,
					e AGP8 è fuori supporto da Guardsquare per mancanza di interesse.
					
					[AGP8 Nope](https://github.com/Guardsquare/proguard/issues/280)
				""".trimIndent()
			}
		}
	}
}