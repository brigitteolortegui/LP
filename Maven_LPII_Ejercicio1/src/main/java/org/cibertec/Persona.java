package org.cibertec;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Persona {
		
		private String nombres,web;//modificador private es opcional
		private int edad;//debido a la clase lombok
		
		
		public Persona(String nombres, String web, int edad) {
			this.nombres = nombres;
			this.web = web;
			this.edad = edad;
		}
		
		
	
	
}
