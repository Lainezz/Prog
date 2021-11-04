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
		//Inserta un elemento en la lista en una posici�n dada (posicion, valor)
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
		
		System.out.println("Introduzca el primer n�mero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Gracias, introduzca a continuaci�n el siguiente n�mero: ");
		int num2 = scan.nextInt();
		
		int suma = sumar(num1, num2);
		System.out.println("El resultado de la suma ser�a: "+suma);
		
		
		int num3;
		int num4;
		
		System.out.println("Por favor, introduzca el primer n�mero: ");
		num3 = scan.nextInt();
		
		System.out.println("Introduzca el segundo n�mero: ");
		num4 = scan.nextInt();
		
		int mayor = mayorQue(num3, num4);
		
		System.out.println("El numero mayor es "+mayor);
		
		/*
		1� Programa que lea por teclado 3 n�meros y que muestre por pantalla el mayor n�mero
		de esos 3.
			a) Hacer un m�todo que reciba 3 variables int por par�metro y que devuelva la suma de los 3
			b) Hacer un m�todo que reciba 3 variables int por par�metro y que devuelva el n�mero
				mayor de esos 3 n�meros.
		
		2� Programa que lea por teclado 5 n�meros y que los almacene dentro de un array de enteros.
		El programa muestra la suma de todos los n�meros introducidos.
			a) Hacer un m�todo que reciba un array de enteros y devuelva la suma de los elementos de
			ese array.
		
		
		3� Buscar por internet c�mo convertir un String a un array de caracteres.
			a) Hacer un m�todo que reciba un String por par�metros y devuelva un array de caracteres.
		
		
		4� Buscar informaci�n de varios m�todos de la clase String �Qu� hacen? �Qu� reciben por par�metros? �Qu� devuelven?
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
	 * M�todo que suma dos variables y devuelve el resultado de la suma. Pepito
	 * @param x
	 * @param y
	 * @return
	 */
	public static int sumar(int x, int y) {
		//Sumamos las dos variables que nos vienen por par�metros y las almacenamos en resultado
		int resultado = x+y;
		
		//Devolvemos el resultado de la suma
		return resultado;
	}
	
	
	/**
	 * M�todo que multiplica 3 variables y devuelve el resultado de la multiplicacion
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
	 * M�todo que recibe 2 par�metros y devuelve el mayor de esos dos.
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
	 * M�todo que comprueba si un n�mero es cero
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
