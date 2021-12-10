package com.daw.tema8.teoria;

public class ClasesJava {

	public static void main(String[] args) {

		String prueba = new String("telefono");
		System.out.println(prueba);
		
		
		Persona mbappe = new Persona();
		
		//definimos algunas propiedades
		mbappe.nombre = "Kilyan";
		mbappe.edad = 24;
		mbappe.longitudPelo = 1;
		
		mbappe.presentacion();
		
		//Hacemos que el objeto mbappe cumpla unos cuantos anios
		while(mbappe.edad < 50) {
			mbappe.cumplirAnios();
		}
		
		mbappe.presentacion();
		
		System.out.println("Mi pelo mide "+mbappe.longitudPelo);
		
		mbappe.cumplirAnios();
		
		System.out.println("Mi pelo mide "+mbappe.longitudPelo);
		
		//voy a crear otro objeto amigo de tipo Persona
		Persona amigo = new Persona();
		
		amigo.edad = 37;
		amigo.peso = 95;
		amigo.longitudPelo = 4;
		amigo.carnetConducir = true;
		amigo.parejas = new String[] {"nombreNovia1"};
		amigo.nombre = "tipoDeIncognito";
		
		//Vamos a pensar que mi amigo ha conseguido trabajo
		boolean empleoConseguido = true;
		amigo.empleo(empleoConseguido);
		
		
		//ACTIVIDAD CLASE
		/*
		 * 1. Crear una clase coche 
		 * OPCIONAL
		 * 2. (buscar en Internet) Crear otras clases "Furgoneta" "TodoCamino" "4x4" ...
		 * 3. Realizar herencia entre coche y las demás clases que habéis creado
		 * 
		 * 4. Crear los atributos que creais convenientes (que contenga String... int..
		 * arrays... ArrayLists... lo que queráis)
		 * 
		 * 5. Crear una o dos funcionalidades.
		 * 
		 * 6. En otra clase... crear e instanciar 2 o 3 objetos de tipo Coche
		 * 7. Dar valores a los atributos de los diferentes objetos
		 * 8. Llamar a las funcionalidades de vuestros objetos
		 * 
		 */
	}

}
