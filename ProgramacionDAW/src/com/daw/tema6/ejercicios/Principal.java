package com.daw.tema6.ejercicios;

public class Principal {

	public static void main(String[] args) {
		////////////////////////////////////////////////////////////////////
		////////////////////////IMPORTANTE//////////////////////////////////
		////////////////////////////////////////////////////////////////////

		TratarJSON tratar = new TratarJSON();
		String rutaLectura = "./ejercicioProgramacion/personajes.txt";
		String rutaEscritura = "./ejercicioProgramacion/ejercicioPsjs.txt";
		tratar.obtenerPersonajes(rutaLectura);
		String lectura = tratar.leerFichero(rutaLectura);
		String bestiaDomada = tratar.domarALaBestiaParda(lectura);
		tratar.escribirFichero(bestiaDomada, rutaEscritura);
		
		/*
		 * EJERCICIO.
		 * Os dan un fichero, que se llama ejercicioPsjs.txt que contiene una serie de datos de los personajes del LoL.
		 * Esos datos son:
		 * 
		 * (nombre del personaje):
		 * (attackspeed): (valor)
		 * (title): (valor)
		 * (blurb): (valor)
		 * (roles): (valor)
		 * 
		 * En el nombre del personaje aparece el nombre directamente
		 * En el resto de atributos, sale lo que está en paréntesis.
		 * (blurb) es el lore del personaje.
		 * (roles) son los roles donde destaca ese personaje (mago, tanque, support...)
		 * 
		 * 
		 * Se os pide que:
		 * a) Almacenar todos los datos de los personajes en un Map
		 * b) Una vez almacenados, el usuario debe poder buscar un personaje.
		 * c) Según el personaje que se busque, le aparecerán las opciones de mostrar
		 * 		El título del campeón
		 * 		El lore del campeón
		 * 		Los roles donde el campeón destaca
		 */
	}

}
