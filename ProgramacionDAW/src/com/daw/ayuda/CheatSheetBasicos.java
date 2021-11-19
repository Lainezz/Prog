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
		int x = j++; // j++ incrementar� el valor de j en 1, pero devolver� el valor de j ANTES de ser incrementado
		// ( j = 2 ; x = 1 )

		// ++i
		j = 1;
		x = ++j; // ++j incrementar� el valor de j en 1, y despu�s retornar� ese valor incrementado
		// ( k = 2 ; p = 2)


		/*
		 * Operadores l�gicos
		 */

		int num1 = 1;
		int num2 = 5;
		int aux1 = 1;

		// == (IGUAL QUE)
		if(num1 == aux1) {
			//Esta condici�n se eval�a a true porque
			//num1 es igual a aux1 (ambos son 1)
		}

		// != (DISTINTO QUE)
		if(num1 != num2) {
			//Esta condici�n se eval�a a true porque
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
		 * Operadores l�gicos complejos
		 */

		boolean boolT = true;
		boolean boolF = false;
		int num5 = 5;
		int num6 = 16;
		int aux5 = 5;

		// & (AND estricto)
		// Devuelve true si todas las condiciones son true
		// EVAL�A TODAS CONDICIONES SIEMPRE

		if(boolT & num5 == 5) {
			// TRUE. Porque ambas condiciones son true.
			// Si boolT es igual a true Y num5 es igual a 5 => entonces TRUE
		}

		if(boolT & num5 <= aux5 & num6 < 100) {
			// TRUE. Porque todas las condiciones son true
			// �boolT es igual a true? => true
			// �num5 es menor o igual que aux5? => true
			// �num6 es menor que 100? => true
			// Entonces, todo es true.
		}

		// | (OR estricto)
		// Devuelve true si alguna de las condiciones es true
		// EVAL�A TODAS LAS CONDICIONES SIEMPRE

		if(boolT | num5 == 6) {
			// TRUE. Porque al menos una condici�n es true.
			// �boolT es igual a true? => true
			// �num5 es igual a 6? => false
			// Todo es true porque al menos 1 condici�n ha sido true
		}

		if(!boolT | num5 > aux5 | num6 == 16) {
			// TRUE. Porque al menos una condici�n es true.
			// �boolT es distinto a true? => false
			// �num5 es mayor que aux5? => false
			// �num6 es igual que 16? => true
			// Todo es true porque al menos 1 condici�n ha sido true
		}

		// && (AND con cortocircuito)
		// Devuelve true si todas las condiciones son true
		// o devuelve false en el momento en que encuentre que una condici�n sea false.
		// EN EL MOMENTO QUE ENCUENTRA UNA CONDICI�N A FALSE, NO EVAL�A EL RESTO DE CONDICIONES

		if(!boolT && num5 == 5) {
			// No entra
		}
		// �boolT es igual a false? => false
		// No eval�a la otra condici�n y devuelve FALSE


		if(!boolT && num5 <= aux5 && num6 < 100) {
			// No entra
		}
		// �boolT es igual a false? => false
		// No eval�a las otras condiciones y devuelve FALSE

		// || (OR con cortocircuito)
		// Devuelve true en el momento que encuentre una condici�n que sea true
		// EN EL MOMENTO QUE ENCUENTRA UN TRUE NO EVAL�A EL RESTO DE CONDICIONES

		if(boolT || num5 != 6) {
			// TRUE. Porque al menos una condici�n es true.
			// �boolT es igual a true? => true
			// No eval�a el resto de condiciones y
			// todo es true porque al menos 1 condici�n ha sido true
		}

		if(boolT || num5 > aux5 || num6 < 16) {
			// TRUE. Porque al menos una condici�n es true.
			// �boolT es igual a true? => true
			// No eval�a el resto de condiciones y
			// todo es true porque al menos 1 condici�n ha sido true
		}

		// ! (NOT negaci�n)
		// Devuelve true si se cumple lo contrario a lo que ! acompa�a
		//
		if( !!boolT ) {
			// TRUE porque:
			// �boolT == false? => false
			// !false => TRUE
		}

	}

}
