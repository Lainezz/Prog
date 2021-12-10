package com.daw.tema5.ejercicios;

public class EjercicioExamen {

	public static void main(String[] args) {
		System.out.print("COMIENZO DEL PROGRAMA\n");
		int espacios=5;
		int puntos=0;

		while(puntos<=espacios) {
			
			for(int i=0; i<(espacios-puntos); i++) {
				System.out.print(" ");
			}
			for(int j=0; j<puntos; j++) {
				System.out.print("*");
			}
			for(int j=0; j<puntos-1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");

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
