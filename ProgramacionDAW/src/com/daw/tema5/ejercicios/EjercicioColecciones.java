package com.daw.tema5.ejercicios;

import java.util.Scanner;

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
		System.out.print("\n COMIENZO DEL PROGRAMA\n");
		int whiteSpaces=5;
		int dots=0;
		
		while(dots<=whiteSpaces) {
			impIzq(whiteSpaces, dots);
			impDcha(dots-1);
			salto();
			
			dots+=1;
			
		}
		
		System.out.print("\n Bienvenido a Bike Taller");
	}
	
	public static void impIzq(int whiteSpaces, int dots) {
		for(int i=0; i<(whiteSpaces-dots); i++) {
			System.out.print(" ");
		}
		for(int j=0; j<dots; j++) {
			System.out.print("*");
		}
	}
	
	public static void impDcha(int dots) {
		for(int j=0; j<dots; j++) {
			System.out.print("*");
		}
	}
	
	public static void salto() {
		System.out.print("\n");
	}

}
