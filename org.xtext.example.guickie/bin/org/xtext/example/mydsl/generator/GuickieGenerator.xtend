/*
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.guickie.*

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class GuickieGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

	val gui = resource.allContents.next
	val guiClass = gui as org.xtext.example.mydsl.guickie.GUI

			fsa.generateFile("Guickie.html",compileGUI(guiClass))
			if (guiClass.getStyle() != null){
				val style = guiClass.getStyle().type.class.toString()
				fsa.generateFile("Style.css",compileStyle(style))
			}
			
	}
		def compileStyle(String style){
		'''
		�IF style.equals("class org.xtext.example.mydsl.guickie.impl.NeonImpl")�
					body {
					    background-color: lightblue;
					}
					
					p {
					    color: rgba(194, 91, 197);
					}
					
					button[type=button] {
					    background-color: rgb(74, 15, 88);
					    color: white;
					    padding: 2px 2px;
					    border: none;
					    cursor: pointer;
					    float: middle;
					    cursor: pointer;
					}
		�ELSEIF style.equals("class org.xtext.example.mydsl.guickie.impl.GreyImpl")�
					body {
					    background-color: grey;
					}
					
					p {
					    color: rgba(240, 240, 240);
					}
					
					button[type=button] {
					    background-color: rgb(0, 0, 0);
					    color: white;
					    padding: 2px 2px;
					    border: none;
					    cursor: pointer;
					    float: middle;
					    cursor: pointer;
					}
		�ENDIF�
		
		'''
}
	
	def compileGUI (GUI gui){
		'''
		<!-- Generated By Guickie -->
<!DOCTYPE html>
<html>

    �IF gui.getStyle() != null�
     <head>
	 <link rel="stylesheet" href="Style.css">
	 �ENDIF�
	 
	 �IF gui.title != null�
	 <title>�gui.title�</title>
     �ELSE�
     <title>GUICKIE</title>
     </head>
     
    �ENDIF�

<body>
	�FOR e: gui.getContainers()�
		�compileContainer(e)�
	�ENDFOR�
	


</body>
</html>
		
		'''
	}
	
	def compileContainer(Container con){
		var output = ''		
		var temp = ''
		var align = ''
		
		// Checks alignment chosen for container (Horizontal / Vertical)
		if (con.align.class.toString !== null){
			if (con.align.class.toString.equals("class org.xtext.example.mydsl.guickie.impl.VerticalImpl")){
				align = 'tr'
			}
			else if (con.align.class.toString.equals("class org.xtext.example.mydsl.guickie.impl.HorizontalImpl")){
				align = 'td'
				}
			}
		// Iterate through all elements in every container	
		for(e: con.getElements()){
			
			
			// Button generator
			if(e.type.class.toString.equals("class org.xtext.example.mydsl.guickie.impl.ButtonImpl")){
				
				if(e.link !== null){
					if(e.link.type.class.toString.equals("class org.xtext.example.mydsl.guickie.impl.TextFieldImpl")){
						
						temp = '<'+align+'>'+'<button type="button" onclick="document.getElementById('+"'"+e.link.name+"'"+').value = '+"''"+'">'+'Clear '+e.link.name.toString+ '</button>'+'</'+align+'>'
					
					}else if(e.link.type.class.toString.equals("class org.xtext.example.mydsl.guickie.impl.HyperLinkImpl")){
						
						temp = '<'+align+'>'+'<button type="button" onclick="document.getElementById('+"'"+e.link.name+"'"+').value = '+"''"+'">'+'Clear '+e.link.name.toString+ '</button>'+'</'+align+'>'
					}
				}else{
					temp = '<'+align+'>'+'<button type="button">'+e.name.toString+ '</button>'+'</'+align+'>'
				}
			
			// Label generator
			}else if (e.type.class.toString.equals("class org.xtext.example.mydsl.guickie.impl.LabelImpl")){
				
				temp = '<'+align+'>'+'<p>'+e.name.toString+ '</p>'+'</'+align+'>'
			
			// Textfield generator
			}else if (e.type.class.toString.equals("class org.xtext.example.mydsl.guickie.impl.TextFieldImpl")){
				
				//temp = '<'+align+'>'+'<input type="text" id="'+e.eContainingFeature()'" name="'+e.name.toString+ '">'+'</'+align+'>'
				temp = '<'+align+'>'+'<input type="text" id="'+e.name.toString+'" name="'+e.name.toString+ '">'+'</'+align+'>'
			
			
			// Hyperlink generator
			}else if (e.type.class.toString.equals("class org.xtext.example.mydsl.guickie.impl.HyperLinkImpl")){
				temp  = '<'+align+'>'+'<a href="https://www.'+e.name.toString+'.com">'+e.name.toString+'</a>' +'</'+align+'>'
			}
			
			// TO BE IMPLEMENTED
			else if (e.type.class.toString.equals("class org.xtext.example.mydsl.guickie.impl.ImageImpl")){
				temp  = '<'+align+'>'+'<a href="https://www.'+e.name.toString+'.com">'+e.name.toString+'</a>' +'</'+align+'>'
				/*
				var check = e.name.toString()
				var dot = 0
				for (i : 0 ..check.length()){
					
 					var c = check.charAt(i);
 					        if (c == "."){
 					        	dot++
 					        }  
 					    if(dot == 2){
 					    	
 					    }
				}
				 */

			}
			output+='\n'+temp
			temp = ''
		}
		output = '<table>'+'\n' + output + '\n' + '</table>' + '\n' 
		return output
	}
}
