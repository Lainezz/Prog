package com.daw.ayuda;

public class CheatSheetBasicos {

	public static void main(String[] args) {

		// TODO crear clase con conceptos b�sicos de JAVA. Variables... m�todos...
		// clases... condicionales... etc
		/*
		 * Tipos de dato
		 */

		// Hay m�s tipos de datos, pero estos son los m�s b�sicos
		int entero = 5;
		double real = 2.01;
		boolean booleano = true;
		char caracter = 'c';
		String cadena = "Mundo";

		/*
		 * Operadores aritm�ticos
		 */

		// Operador aritmetico de suma (+)
		int res = 1 + entero;
		// Tambi�n se usa para concatenar cadenas
		String holaMundo = "Hola " + cadena;

		// Operador de resta, multiplicador, divisor y resto
		int res2 = entero - 4;
		int res3 = 4 * 3;
		int res4 = res2 / 2;
		int res5 = res3 % 3; // res5 = resto de dividir res3/3

		/*
		 * Operadores de asignacion
		 */

		// Operador de asignacion =

		// Operadores += , *= , /= , %=
		double num = 1;
		num += 2; // num = num + 2;
		num *= 2; // num = num * 2;
		num /= 2; // num = num / 2;
		num %= 2; // num = num % 2;

	}

}
