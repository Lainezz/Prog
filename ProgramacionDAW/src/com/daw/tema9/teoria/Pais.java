package com.daw.tema9.teoria;

import java.util.ArrayList;

public class Pais {
	
	//La variable estática numPaises de tipo int pertenece a la clase en sí, no a los objetos que se instancian de la misma
	public static int numPaises;
	
	//Los atributos de la clase, que pertenecerán a cada uno de los objetos que la instancien
	private String nombre;
	private int numProvincias, numHabitantes;
	private ArrayList<String> nombreProvincias;
	private boolean monarquia;
	
	
	
	public Pais(String nombre, int numProvincias, int numHabitantes) {
		this.nombre = nombre;
		this.numProvincias = numProvincias;
		this.numHabitantes = numHabitantes;
		
		//Cada vez que se crea un objeto de tipo Pais... aumenta en 1 la variable estática numPaises;
		numPaises++;
	}
	

}
