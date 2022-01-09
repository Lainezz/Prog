package com.daw.ayuda;

public class AyudaExamen {
	public static void main(String[] args) {

		int a = 5;
		int b = 3;
		int c = -12;

		if( ( (a==5 & b>=3) && (c/b>-5) && (a*b==15 || a >= 8) ) || (c<0)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}


		// Un programa que realice el factorial de un número n
		// N! = N*(N-1)*(N-2)...*1
		// 5! = 5 * 4 * 3 * 2 * 1 (o... 1 * 2 * 3 * 4 * 5)

		int n = 0;
		// Pasos
		// Una variable auxiliar para almacenar el resultado de cada multiplicacion
		// Un for que vaya desde 1 hasta N ... o desde N hasta 1.
		// Realizamos la multiplicacion y la almacenamos en nuestra var auxiliar
		// Incrementamos o Decrementamos i o n

		// ATENCIÓN A... LA CONDICIÓN DE SALIDA DE VUESTRO BUCLE.
		// EL PROGRAMA DEBE FUNCIONAR IGUAL PARA CUALQUIER NÚMERO.
		// PRIMERA ITERACIÓN Y ÚLTIMA ITERACIÓN.
		int factorial = n;
		for(int i=n; i>0; i--) {
			factorial = factorial*(n-1);
			n--;
		}
		System.out.println(factorial);

		///////
		n = 0;
		int f = 1;
		for(int i=n; i>0; i--) {
			f*=i;
		}
		System.out.println(f);


	}
}
