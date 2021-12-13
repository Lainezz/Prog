package com.daw.tema8.teoria;

public class Persona {
	
	//ATRIBUTOS
	String nombre;
	String colorPelo;
	String colorOjos;
	String dni;
	String situacionLaboral;
	
	double altura;
	double peso;
	
	int anio;
	int longitudPelo;
	int ci;
	int edad;
	final int esperanzaVida = 84;
	
	String[] parejas;
	
	boolean carnetConducir;
	boolean conGafas;
	
	//CONSTRUCTOR
	public Persona(String nombre, String dni, int edad, int anio) {
		
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.anio = anio;
		System.out.println("Hola amijo");
		
	}
	
	public Persona(String nombre) {
		
		this.nombre = nombre;		
	}
	
	public Persona() {
		
	}
	
	//FUNCIONALIDADES
	public void presentacion() {
		System.out.println("Hola, mi nombre es "+this.nombre+" y tengo "+this.edad+" anios");
	}
	
	public void cumplirAnios() {
		
		//se suma 1 a edad
		this.edad++;
		
		//a cierta edad se nos empieza a caer el pelo
		if(!this.nombre.equals("Luis")) {
			if(this.edad>50) {
				this.longitudPelo--;
			}
		}else {
			if(this.edad>16) {
				this.longitudPelo--;
			}
		}
	}
	
	public void empleo(boolean empleado) {
		System.out.print("Situacion Laboral: ");
		if(empleado == true) {
			this.situacionLaboral = "Trabajando";
			System.out.print(this.situacionLaboral);
		}else {
			this.situacionLaboral = "Desempleado";
			System.out.print(this.situacionLaboral);
		}
		
	}
	
	
	
}
