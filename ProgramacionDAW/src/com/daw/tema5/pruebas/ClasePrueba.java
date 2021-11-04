package com.daw.tema5.pruebas;

import java.util.ArrayList;
import java.util.Scanner;

public class ClasePrueba {
	public static void main(String[] args) {
		/*
		//Colecciones
		
		//Los arraylists
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		//Inserta un elemento en la lista (al final)
		arr.add(1);
		//Inserta un elemento en la lista en una posición dada (posicion, valor)
		arr.add(0, 4);
		
		System.out.println(arr);
		
		
		ArrayList<Character> arrC = new ArrayList<Character>();
		arrC.add('H');
		arrC.add('O');
		arrC.add('L');
		arrC.add('A');
		
		System.out.println(arrC);
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduzca el primer número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Gracias, introduzca a continuación el siguiente número: ");
		int num2 = scan.nextInt();
		
		int suma = sumar(num1, num2);
		System.out.println("El resultado de la suma sería: "+suma);
		
		
		int num3;
		int num4;
		
		System.out.println("Por favor, introduzca el primer número: ");
		num3 = scan.nextInt();
		
		System.out.println("Introduzca el segundo número: ");
		num4 = scan.nextInt();
		
		int mayor = mayorQue(num3, num4);
		
		System.out.println("El numero mayor es "+mayor);
		
		/*
		1º Programa que lea por teclado 3 números y que muestre por pantalla el mayor número
		de esos 3.
			a) Hacer un método que reciba 3 variables int por parámetro y que devuelva la suma de los 3
			b) Hacer un método que reciba 3 variables int por parámetro y que devuelva el número
				mayor de esos 3 números.
		
		2º Programa que lea por teclado 5 números y que los almacene dentro de un array de enteros.
		El programa muestra la suma de todos los números introducidos.
			a) Hacer un método que reciba un array de enteros y devuelva la suma de los elementos de
			ese array.
		
		
		3º Buscar por internet cómo convertir un String a un array de caracteres.
			a) Hacer un método que reciba un String por parámetros y devuelva un array de caracteres.
		
		
		4º Buscar información de varios métodos de la clase String ¿Qué hacen? ¿Qué reciben por parámetros? ¿Qué devuelven?
			Conrado y M.A
			a) .charAt() y .equals()
			Joseph Alba
			a) .contains() .replaceAll()
			Luis Fran Sebas
			a) .toLowerCase() .concat() .equalsIgnoreCase()
			Antonio Carlos Roberto
			a) .toUpperCase() .indexOf() .lastIndexOf()
		
		 */
		
		
		
		
		
		
		
		
	}
	
	
	/**
	 * Método que suma dos variables y devuelve el resultado de la suma. Pepito
	 * @param x
	 * @param y
	 * @return
	 */
	public static int sumar(int x, int y) {
		//Sumamos las dos variables que nos vienen por parámetros y las almacenamos en resultado
		int resultado = x+y;
		
		//Devolvemos el resultado de la suma
		return resultado;
	}
	
	
	/**
	 * Método que multiplica 3 variables y devuelve el resultado de la multiplicacion
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public static int multiplicar(int x, int y, int z) {
		
		int resultado = x*y*z;
		
		return resultado;
	}
	
	
	/**
	 * Método que recibe 2 parámetros y devuelve el mayor de esos dos.
	 * @param x
	 * @param y
	 * @return
	 */
	public static int mayorQue(int x, int y) {
		
		int resultado;
		
		if(x>y) {
			resultado = x;
		}else {
			resultado = y;
		}
		return resultado;
	}
	
	
	/**
	 * Método que comprueba si un número es cero
	 * @param x
	 * @return true si 0, false si != 0
	 */
	public static boolean esCero(int x) {
		
		boolean esCero = false;
		
		if(x==0) {
			esCero = true;
		}
		
		return esCero;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
