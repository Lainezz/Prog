package com.daw.tema9.teoria;

public class Principal {

	public static void main(String[] args) {
		
		//Vamos a instanciar la clase Pais y vamos a crear un objeto francia
		Pais francia = new Pais("Francia", 8, 60000000);
		System.out.println(Pais.numPaises);
		
		//Ahora vamos a crear otro objeto espania de tipo Pais
		Pais espania = new Pais("Espania", 10, 48000000);
		System.out.println(Pais.numPaises);
		
		//Como vemos, la variable estática numPaises, que no pertenece a los objetos si no a la clase en sí, ha aumentado en 1.
		
		
		
		Pais portugal = new Pais("Portugal", 6, 20000000);
		Pais italia = new Pais("Italia", 20, 59000000);
		Pais grecia = new Pais("Grecia", 15, 40000000);
		
		System.out.println(Pais.numPaises);

	}

}
