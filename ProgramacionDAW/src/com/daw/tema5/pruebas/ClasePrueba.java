package com.daw.tema5.pruebas;

import java.util.ArrayList;
import java.util.Scanner;

public class ClasePrueba {
	public static void main(String[] args) {
		
		//Colecciones
		
		//Los arraylists
		
		//TIPOS DE DATOS QUE ADMITEN LOS ARRAYLISTS (hay más)
		//Integer = int
		//Double = double
		//String = String
		//Boolean = boolean
		//Character = char
		
		//ArrayList<tipo de dato que se va a almacenar> nombreVariable = new ArrayList<tipo de dato>();
		//Un arraylist de enteros
		ArrayList<Integer> arr = new ArrayList<Integer>();
		//Un arraylist de double
		ArrayList<Double> arrDoub = new ArrayList<Double>();
		//Un arraylist de Strings donde se van a almacenar los alumnos de una clase
		ArrayList<String> arrStr = new ArrayList<String>();
		//Un arraylist de booleanos
		ArrayList<Boolean> arrBool = new ArrayList<Boolean>();
		
		
		//A mi array de String le voy a añadir nuevos alumnos
		arrStr.add("Luis");
		arrStr.add("Fran");
		arrStr.add("Sebas");
		arrStr.add("Antonio");
		arrStr.add("Carlos");
		arrStr.add("Roberto");
		arrStr.add("Alba");
		arrStr.add("Joseph");
		arrStr.add("Miguel Angel");
		arrStr.add("Conrado");
		
		System.out.println("Alumnos 1º: "+arrStr);  //Mostramos por pantalla el array list
		
		arrStr.add("Mbappé"); //Añado al alumno Mbappé
		
		System.out.println("Alumnos 1º: "+arrStr);  //Mostramos por pantalla el array list
		
		arrStr.add("CR7"); //Añado al alumno CR7
		System.out.println("Alumnos 1º: "+arrStr);  //Mostramos por pantalla el array list
		
		//Devuelve la cantidad de elementos que tiene la colección
		int tamano = arrStr.size();
		System.out.println("El tamaño es: "+tamano); //Imprimo por pantalla el tamaño de mi arraylist
		
		//Elimina todos los elementos de una colección
		arrStr.clear();
		
		//Mostramos por pantalla el tamaño de nuestro arraylist
		System.out.println("El tamano es: "+arrStr.size());
		
		//Mostramos por pantalla el array list
		System.out.println("Alumnos 1º: "+arrStr);
		
		//Insertamos elementos en el arraylist
		arrStr.add("Luis");
		arrStr.add("Fran");
		arrStr.add("Sebas");
		arrStr.add("Antonio");
		arrStr.add("Carlos");
		arrStr.add("Roberto");
		arrStr.add("Alba");
		arrStr.add("Joseph");
		arrStr.add("Miguel Angel");
		arrStr.add("Conrado");
		System.out.println("Alumnos 1º: "+arrStr); //Mostramos por pantalla el array list
		
		//Eliminamos lo que contiene la posición 7 del arraylist
		System.out.println("Remove");
		arrStr.remove(7);
		
		System.out.println("Alumnos 1º: "+arrStr);  //Mostramos por pantalla el array list
		
		
		//Eliminamos algún elemento del arraylist
		System.out.println("Remove a Antonio");
		arrStr.remove("Antonio");
		
		System.out.println("Alumnos 1º: "+arrStr);  //Mostramos por pantalla el array list
		
		
		//Index of -> te devuelve la posición de un elemento que nosotros le indicamos
		int posicion = arrStr.indexOf("Fran");
		
		System.out.println("La posición de Fran es: "+posicion); //Imprimo por pantalla la posición del elemento dado
		
		//Last index of -> te devuelve la última posición de un elemento que nosotros le indicamos.
		arrStr.add("Fran"); //Añado un nuevo alumno
		System.out.println("Alumnos 1º: "+arrStr); //Mostramos por pantalla el array list
		System.out.println("La última posición de Fran es: "+arrStr.lastIndexOf("Fran")); //Muestro por pantalla la última posición de un elemento que nosotros le indicamos
		
		
		//Llamo a mi método sumatoria
		sumatoria(10);
		
		
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
	
	
	/**
	 * Método que calcula la suma de todos los elementos de un arraylist
	 * @param num
	 */
	public static void sumatoria(int num) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int numeroParaIntroducir = 0;
		
		//Con este for tendría un arraylist relleno de todos los números que quisiera
		for(int i=0; i<num; i++) {
			System.out.println("Introduzca un número al array"); //muestro un mensaje al usuario
			numeroParaIntroducir = scan.nextInt(); //leo por teclado lo que el usuario nos ha dicho
			arr.add(numeroParaIntroducir); //Añado el elemento a mi arraylist
		}
		
		//Con este for realizaría la sumatoria de los elementos
		int sumatoria = 0;
		for(int i=0; i<arr.size(); i++) {
			sumatoria += arr.get(i); //Obtengo lo que contiene la posición i del arraylist, y lo sumo
		}
		
		System.out.println("La sumatoria es: "+sumatoria);
		
		/*
		CREAR UNA LISTA CON LAS LETRAS DEL ALFABETO
		MOSTRAR LA LISTA
		BUSCAR Y MOSTRAR LA POSICIÓN DE ‘E’, ‘H’ Y ‘O’
		ELIMINAR ELEMENTO EN LA POSICIÓN 1 Y ‘U’
		MOSTRAR LA LISTA DE NUEVO.
		*/
		
		
	}
	
	
	
	
}
