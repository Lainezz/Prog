package com.daw.tema5.teoria;

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
		
		// Menu de bienvenida
		bienvenida();
		
		// 1. balon de futbol
		// 2. ordenador
		// 3. tablet
		
		// 1 (el usuario quiere un balon de futbol)
		
		// Se crea un pedido nuevo (hashMap) (clave, valor) => La clave identifica al pedido, y el valor es el producto
		// vuestro hashMap se quedaría más o menos así: hashM {000 = [balon de futbol]}
		
		// 1. balon
		// 2. orde
		
		// 2 (el user quiere un pc)
		
		// Se crea un pedido nuevo y se añade al hashMap
		// el hashM se quedaría así: hashM {000=[balon], 001=[ordenador]}
		
		// el user marca 0 para salir
		// Se muestran todos los pedidos con el producto asociado
		
		
		
		//	//	//
		// String producto;
		// ¿Qué producto quiere revisar?
		// 1. Balon
		// 2. Ordenador
		
		// 1 (el usser quiere revisar los pedidos que contengan un Balon)
		// if else anidados si == 1 entonces producto = "balon".
		// si == 2 entonces producto = "ordenador"
		
		// Recorremos el hashM
		// Comparamos "Balon" con el valor de cada uno de los elementos del hashM
		// if(hashM.getValue().equalsIgnoreCase(producto))
		// Mostrar por pantalla el Id del pedido
		
		
		
		/*
		 * Ejercicio 3.
		 * Se tiene que implementar un programa que almacene todas las calles de un apartado postal
		 * "Una clave con muchos valores"
		 */

	}
	
	public static void bienvenida() {
		System.out.print("\n COMIENZO DEL PROGRAMA\n");
		int i, j;
		int whiteSpaces=5;
		int dots=0;
		
		while(dots<=whiteSpaces) {
			for(i=0; i<(whiteSpaces-dots); i++) {
				System.out.print(" ");
			}
			for(j=0; j<dots; j++) {
				System.out.print("*");
			}
			
			dots+=1;
			System.out.print("\n");
		}
		
		System.out.print("\n Bienvenido a Bike Taller");
	}
	
	public static void impIzq() {
		int i, j;
		int whiteSpaces=5;
		int dots=0;
		
		while(dots<=whiteSpaces) {
			for(i=0; i<(whiteSpaces-dots); i++) {
				System.out.print(" ");
			}
			for(j=0; j<dots; j++) {
				System.out.print("*");
			}
			
			dots+=1;
			System.out.print("\n");
		}
	}
	
	public static void impDcha() {
		
	}
	
	public static void salto() {
		
	}

}
