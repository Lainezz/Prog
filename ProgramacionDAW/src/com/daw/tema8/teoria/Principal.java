package com.daw.tema8.teoria;

import java.util.ArrayList;

public class Principal {

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

		Persona p = new Persona("Diego", "548393747s", 31, 1989);
		System.out.println("PERSONA DE PRUEBA");
		System.out.println(p.nombre);
		System.out.println(p.dni);
		System.out.println(p.edad);


		Pokemon charm = new Pokemon("Charmander", "Fuego", 1200);
		Ataque ataque1 = new Ataque("Ascuas", "Fuego", 100);
		Ataque ataque2 = new Ataque("Placaje", "Normal", 60);
		Ataque ataque3 = new Ataque("Llamarada", "Fuego", 150);

		charm.ataques = new ArrayList<>();
		charm.ataques.add(ataque1);
		charm.ataques.add(ataque2);
		charm.ataques.add(ataque3);
		
		Pokemon pika = new Pokemon("Pikachu", Tipo.ELECTRICO, 1200);
		System.out.println(pika.tipoE);

	}

}
