package com.daw.tema5.ejercicios;

public class EjercicioColecciones {

	public static void main(String[] args) {

		/*
		 * Ejercicio 1.
		 * ¿Arraylist, Set o Maps?
		 * ¿En qué situaciones es mejor utilizar una colección con respecto a otra?
		 */


		/*
		 * Ejercicio 2.
		 * Implementar un sistema que almacene los números de pedido de vuestra tienda de barrio.
		 *
		 * Hacen un pedido a la tienda (por teclado) y se almacena el pedido con un numero de referencia y un valor
		 *
		 * Por último, tiene que poder consultar los números de referencia asociados un valor en concreto.
		 */


		/*
		 * Ejercicio 3.
		 * Se tiene que implementar un programa que almacene todas las calles de un apartado postal
		 * "Una clave con muchos valores"
		 */
		bienvenida();


	}

	public static void bienvenida() {
		System.out.print("\nCOMIENZO DEL PROGRAMA\n");
		int espacios=5;
		int puntos=0;

		while(puntos<=espacios) {
			
			impIzq(espacios, puntos);
			impDcha(puntos-1);
			saltoDeLinea();

			puntos+=1;

		}
	}

	public static void impIzq(int espacios, int puntos) {
		for(int i=0; i<(espacios-puntos); i++) {
			System.out.print(" ");
		}
		for(int j=0; j<puntos; j++) {
			System.out.print("*");
		}
	}

	public static void impDcha(int puntos) {
		for(int j=0; j<puntos; j++) {
			System.out.print("*");
		}
	}

	public static void saltoDeLinea() {
		System.out.print("\n");
	}

}
