package com.daw.tema8.teoria;

public class Persona {
	
	//Datos de la clase persona. ATRIBUTOS de la clase persona
	String nombre;
	String primerApellido;
	String segundoApellido;
	byte edad;
	String nif;
	short altura;
	
	
	public void presentacion() {
		System.out.println("Hola, mi nombre es "
				+this.nombre+" "
				+this.primerApellido+" "
				+"y tengo "+this.edad+" anios.");
	}
}
