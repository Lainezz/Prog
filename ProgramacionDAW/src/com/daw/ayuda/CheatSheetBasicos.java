package com.daw.ayuda;

public class CheatSheetBasicos {

	public static void main(String[] args) {

		// TODO crear clase con conceptos básicos de JAVA. Variables... métodos...
		// clases... condicionales... etc
		/*
		 * Tipos de dato
		 */

		// Hay más tipos de datos, pero estos son los más básicos
		int entero = 5;
		double real = 2.01;
		boolean booleano = true;
		char caracter = 'c';
		String cadena = "Mundo";

		/*
		 * Operadores aritméticos
		 */

		// Operador aritmetico de suma (+)
		int res = 1 + entero;
		// También se usa para concatenar cadenas
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

		int i;
		i = 0; //Asigno el valor 0 a la variable de tipo entero con nombre i

		// Operadores += , *= , /= , %=
		double num = 1;
		num += 2; // es equivalente a: num = num + 2;
		num -= 2; // es equivalente a: num = num - 2;
		num *= 2; // num = num * 2;
		num /= 2; // num = num / 2;
		num %= 2; // num = num % 2;

		/*
		 * Operadores incrementales
		 */

		// i++
		int j = 1;
		int x = j++; // j++ incrementará el valor de j en 1, pero devolverá el valor de j ANTES de ser incrementado
		// ( j = 2 ; x = 1 )

		// ++i
		j = 1;
		x = ++j; // ++j incrementará el valor de j en 1, y después retornará ese valor incrementado
		// ( k = 2 ; p = 2)


		/*
		 * Operadores lógicos
		 */

		int num1 = 1;
		int num2 = 5;
		int aux1 = 1;

		// == (IGUAL QUE)
		if(num1 == aux1) {
			//Esta condición se evalúa a true porque
			//num1 es igual a aux1 (ambos son 1)
		}

		// != (DISTINTO QUE)
		if(num1 != num2) {
			//Esta condición se evalúa a true porque
			//num1 es distinto que num2
		}

		// < , > , <= , >=
		//Menor que, mayor que, menor o igual que, mayor o igual que
		if(num1 < num2) {
			//True. Porque num1 es menor que num2
		}

		if(num2 > num1) {
			//True. Porque num2 es mayor que num1
		}

		if(num1 <= aux1) {
			//True. Porque num1 es menor o igual que aux1
			//En este caso, son iguales
		}

		if(num2 >= 5) {
			//True. Porque num2 es mayor o igual que 5
			//En este caso, num2 es igual que 5
		}

		/*
		 * Operadores lógicos complejos
		 */

		boolean boolT = true;
		boolean boolF = false;
		int num5 = 5;
		int num6 = 16;
		int aux5 = 5;

		// & (AND estricto)
		// Devuelve true si todas las condiciones son true
		// EVALÚA TODAS CONDICIONES SIEMPRE

		if(boolT & num5 == 5) {
			// TRUE. Porque ambas condiciones son true.
			// Si boolT es igual a true Y num5 es igual a 5 => entonces TRUE
		}

		if(boolT & num5 <= aux5 & num6 < 100) {
			// TRUE. Porque todas las condiciones son true
			// ¿boolT es igual a true? => true
			// ¿num5 es menor o igual que aux5? => true
			// ¿num6 es menor que 100? => true
			// Entonces, todo es true.
		}

		// | (OR estricto)
		// Devuelve true si alguna de las condiciones es true
		// EVALÚA TODAS LAS CONDICIONES SIEMPRE

		if(boolT | num5 == 6) {
			// TRUE. Porque al menos una condición es true.
			// ¿boolT es igual a true? => true
			// ¿num5 es igual a 6? => false
			// Todo es true porque al menos 1 condición ha sido true
		}

		if(!boolT | num5 > aux5 | num6 == 16) {
			// TRUE. Porque al menos una condición es true.
			// ¿boolT es distinto a true? => false
			// ¿num5 es mayor que aux5? => false
			// ¿num6 es igual que 16? => true
			// Todo es true porque al menos 1 condición ha sido true
		}

		// && (AND con cortocircuito)
		// Devuelve true si todas las condiciones son true
		// o devuelve false en el momento en que encuentre que una condición sea false.
		// EN EL MOMENTO QUE ENCUENTRA UNA CONDICIÓN A FALSE, NO EVALÚA EL RESTO DE CONDICIONES

		if(!boolT && num5 == 5) {
			// No entra
		}
		// ¿boolT es igual a false? => false
		// No evalúa la otra condición y devuelve FALSE


		if(!boolT && num5 <= aux5 && num6 < 100) {
			// No entra
		}
		// ¿boolT es igual a false? => false
		// No evalúa las otras condiciones y devuelve FALSE

		// || (OR con cortocircuito)
		// Devuelve true en el momento que encuentre una condición que sea true
		// EN EL MOMENTO QUE ENCUENTRA UN TRUE NO EVALÚA EL RESTO DE CONDICIONES

		if(boolT || num5 != 6) {
			// TRUE. Porque al menos una condición es true.
			// ¿boolT es igual a true? => true
			// No evalúa el resto de condiciones y
			// todo es true porque al menos 1 condición ha sido true
		}

		if(boolT || num5 > aux5 || num6 < 16) {
			// TRUE. Porque al menos una condición es true.
			// ¿boolT es igual a true? => true
			// No evalúa el resto de condiciones y
			// todo es true porque al menos 1 condición ha sido true
		}

		// ! (NOT negación)
		// Devuelve true si se cumple lo contrario a lo que ! acompaña
		//
		if( !!boolT ) {
			// TRUE porque:
			// ¿boolT == false? => false
			// !false => TRUE
		}

	}

}
