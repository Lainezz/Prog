package com.daw.tema9.teoria;

public class Pais {
	

	private String nombre;
	private int poblacion;
	
	//CONSTRUCTOR PERSONALIZADO
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	
	@Override
	public String toString() {
		String presentacion = this.nombre+" con "+this.poblacion+" habitantes";
		return presentacion;
	}
}
