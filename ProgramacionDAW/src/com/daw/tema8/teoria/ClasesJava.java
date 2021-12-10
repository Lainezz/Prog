package com.daw.tema8.teoria;

public class ClasesJava {

	public static void main(String[] args) {

		//Clase String... nombre de la variable (nombre del objeto que hemos creado) cadena
		String cadena;
		//La variable cadena es de tipo String (el objeto cadena es de tipo String). Instanciamos la variable (el objeto) para que su valor sean los caracteres "M a r i a"
		cadena = new String("Maria");
		//Vamos a introducir un breakpoint aquí para visualizar qué almacena la variable cadena (el objeto cadena de tipo String)
		System.out.println(cadena);
		
		/*
		 * Creación de una clase Persona
		 */
		//1º Sería crear la clase Persona, es decir, la plantilla que usaremos para crear los diferentes objetos que se instancien de la clase.
		// Hay que tener en cuenta aquí el concepto de "Ocultación de la información".
		
		//2º Una vez creada la clase con sus atributos y funciones. Podemos proceder a la creación de un objeto
		// Creamos un objeto con nombre "yo", que su tipo de dato es Persona (igual que antes... cadena... era de tipo String)
		Persona yo = new Persona();
		//Vamos a poner un punto de depuración para ver cómo se ha inicializado nuestro objeto
		System.out.println(yo);
		//Todo está a 0 o a null... porque si no damos valores a los atributos... se rellenan con el valor por defecto
		
		//Vamos a darles valores y a llamar a la única función que tiene nuestro objeto
		yo.nombre = "Diego";
		yo.primerApellido = "Linares";
		yo.segundoApellido = "Ortiz";
		yo.edad = 31;
		yo.presentacion();
	}

}
