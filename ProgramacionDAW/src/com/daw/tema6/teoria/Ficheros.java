package com.daw.tema6.teoria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ficheros {

	public static void main(String[] args){


		//Ejemplos de escritura en Ficheros
		escrituraFichero();
		
		//Ejemplos de lectura de ficheros
		leerFichero();
		
		//Ejemplo de lectura y escritura
		lecturaYEscrituraFichero();
	}
	
	
	/**
	 * /////////////////////////////////////////////////
	 * //////////////ESCRITURA DE FICHEROS//////////////
	 * /////////////////////////////////////////////////
	 */
	public static void escrituraFichero() {

		/*
		 * Ejemplo 1
		 */
		try {
			//1º Abrimos el fichero donde queramos escribir / leer
			File fichero = new File("./ficheros/prueba.txt");

			//2º Comprobar si el fichero se ha abierto correctamente
			if (fichero.createNewFile()) {
				System.out.println("File created: " + fichero.getName());
			} else {
				System.out.println("File already exists.");
			}

			//3º Crear un flujo de escritura
			FileWriter escritura = new FileWriter(fichero);

			//4º Operar con dicho fichero. Con el flujo de escritura que hemos creado.
			escritura.write("Hola");

			//5º Cerrar el flujo
			escritura.close();


		} catch (IOException e) {
			// TODO: handle exception
			System.err.println(e.getStackTrace());
		}


		/*
		 * Ejemplo 2
		 */
		try {
			//1º Abrimos el fichero donde queramos escribir / leer
			FileWriter fich = new FileWriter("./ficheros/prueba2.txt");

			//3º Crear un flujo de escritura
			PrintWriter escritura2 = new PrintWriter(fich);

			//4º Operar con dicho fichero. Con el flujo de escritura que hemos creado.
			for (int i = 0; i < 10; i++) {
				escritura2.println("Adios");
			}

			//5º Cerrar el flujo
			escritura2.close();


		} catch (IOException e) {
			// TODO: handle exception
			System.err.println(e.getStackTrace());
		}


		/*
		 * Ejemplo 3
		 */
		//Crear un mapa Integer String
		Map<Integer, String> datosAlumnos = new TreeMap<>();
		//Voy a añadir cosas al treeMap creado
		datosAlumnos.put(1, "Linares");
		datosAlumnos.put(2, "Aguilar");
		datosAlumnos.put(7, "Fernandez");
		datosAlumnos.put(9, "Castañeda");
		datosAlumnos.put(5, "Gutierrez");
		datosAlumnos.put(6, "Protasio");
		datosAlumnos.put(3, "Belisario");
		//Compruebo que todo está bien
		System.out.println("\nTreeMap con nombres asociados a una clave:\n" + datosAlumnos);

		//Quiero persistir los datos de los alumnos para que no se pierdan
		try {
			//1º Abrimos el fichero donde queramos escribir / leer
			FileWriter fich = new FileWriter("./ficheros/datosAlumnos.txt");
			//3º Abrir un flujo de escritura
			PrintWriter escrib = new PrintWriter(fich);

			//Recorro mi treeMap para poder escribir sus elementos en mi fichero
			for(Map.Entry<Integer, String> elem : datosAlumnos.entrySet()) {
				escrib.print("Clave: "+elem.getKey());
				escrib.print("\n");
				escrib.print("Alumno: "+elem.getValue());
				escrib.print("\n-----------------\n");
			}

			//Finalmente, cerramos el flujo de escritura
			escrib.close();


		} catch (IOException e) {
			// TODO: handle exception
		}

		/*
		 * Ejemplo 4
		 */
		//Crear un mapa Integer String
		Map<Integer, String> pedidos = new TreeMap<>();
		//Voy a añadir cosas al treeMap creado
		pedidos.put(1, "FIFA 22");
		pedidos.put(2, "Assassin's Creed Valhalla");
		pedidos.put(7, "Assassin's Creed Valhalla");
		pedidos.put(9, "Battlefield 2042");
		pedidos.put(5, "Fornite");
		pedidos.put(6, "Fornite");
		pedidos.put(3, "Fornite");
		//Compruebo que todo está bien
		System.out.println("\nTreeMap con nombres asociados a una clave:\n" + pedidos);

		EscribirPedido ep = new EscribirPedido();
		try {
			//1º Abrimos o creamos el fichero donde queramos operar
			File fich = new File("./ficheros/pedidos.txt");
			//2º Comprobamos que el fichero se haya abierto/creado correctamente. .createNewFile() crea un fichero nuevo
			// cogiendo de nombre lo que se le ha pasado en la ruta especificada.
			if(fich.createNewFile()) {
				System.out.println("Archivo creado: "+fich.getName());
			} else {
				System.out.println("El archivo ya existe en la ruta "+fich.getCanonicalPath());
			}

			//3º Abrimos un flujo de escritura en nuestro fichero
			FileWriter fw = new FileWriter(fich);

			//4º En este punto, debemos llamar al método escribirXML() de la clase EscribirPedido (objeto creado más arriba)
			// Aquí lo que hacemos es operar con nuestro fichero, es decir, escribir todos los datos de los pedidos, PERSISTIR LOS DATOS.
			ep.escribirXML(pedidos, fw);
			ep.escribirJSON(pedidos, fw);

			//5º Cuando hemos terminado de operar con el fichero, cerramos el flujo
			fw.close();

		} catch (IOException e) {
			System.err.println("Error");
			System.err.print(e.getMessage());
		}
	}
	
	/**
	 * /////////////////////////////////////////////////
	 * //////////////LECTURA DE FICHEROS////////////////
	 * ///////////////////////////////////////////////// 
	 */
	public static void leerFichero() {
		/*
		 * Ejemplo 1
		 */

		try {
			//1º Abrimos el fichero que queremos leer
			File fich = new File("./ficheros/pedidos.txt");

			//2º Realizamos una comprobación para saber si el fichero se ha abierto correctamente, es decir,
			// comprobamos si existe.
			if(fich.exists()) {
				System.out.println("El fichero existe, se prosigue con la lectura");

				//3º Creamos/abrimos un flujo de lectura.
				BufferedReader br = new BufferedReader(new FileReader(fich));

				//4º Operamos con nuestro fichero. En este caso, si queremos leer todo el documento, lo hacemos con un while.
				String linea = new String(br.readLine());
				while(linea!=null) {
					System.out.println(linea);
					linea = br.readLine();
				}

				//5º Cerramos el flujo
				br.close();

			} else {
				System.out.println("El fichero no existe");
			}

		} catch (NullPointerException | IOException e) {
			System.err.println("Error");
			System.err.print(e.getMessage());
		}
	}

	
	/**
	 * ////////////////////////////////////////////////////////////
	 * //////////////EJEMPLO DE LECTURA Y ESCRITURA////////////////
	 * //////////////////////////////////////////////////////////// 
	 */
	public static void lecturaYEscrituraFichero() {
		/*
		 * Empezamos escribiendo un fichero 
		 * En este caso intentamos persistir los datos almacenados en un Map 
		 * que contiene una serie de personajes del juego League Of Legends junto con sus habilidades
		 * 
		 * TODO: meter las habilidades de cada personaje.
		 */
		try {
			//1er paso: Abrir o Crear el fichero donde queramos escribir
			File fichero = new File("./ficheros/ficheroPrueba.txt");

			//2º comprobar si nuestro fichero se ha creado/abierto correctamente
			if(fichero.createNewFile()) {
				System.out.println("El fichero se ha creado correctamente en la ruta: "+fichero.getCanonicalPath());
			} else {
				System.out.println("El fichero ya existe en la ruta indicada");
			}

			//3º crear el flujo de escritura (con FileWriter)
			FileWriter fw = new FileWriter(fichero);

			// CREAR UN MAPA <STRING, ARRAYLIST<STRING>> . LA CLAVE ES EL NOMBRE DEL PSJ DEL LOL Y EL ARRAYLIST
			// CONTIENE LAS HABILIDADES DEL PERSONAJE.
			Map<String, ArrayList<String>> personajes = new HashMap<>();
			
			//Insertamos varias claves-valores en el MAP (Clave = String, Valor = new ArrayList<String>
			personajes.put("Yasuo", new ArrayList<String>());
			personajes.put("Garen", new ArrayList<String>());
			personajes.put("Varus", new ArrayList<String>());
			personajes.put("Caitlyn", new ArrayList<String>());
			personajes.put("Janna", new ArrayList<String>());
			personajes.put("Zed", new ArrayList<String>());
			personajes.put("VI", new ArrayList<String>());
			personajes.put("Tristana", new ArrayList<String>());
			personajes.put("Vex", new ArrayList<String>());
			
			//Populamos (llenamos, metemos, insertamos) con valores el ArrayList<String>
			personajes.get("Yasuo").add("q:");
			personajes.get("Yasuo").add("e:");
			personajes.get("Yasuo").add("w:");
			personajes.get("Yasuo").add("r:");
			personajes.get("Garen").add("q:");
			personajes.get("Garen").add("e:");
			personajes.get("Garen").add("w:");
			personajes.get("Garen").add("r:");
			personajes.get("Varus").add("q:");
			personajes.get("Varus").add("e:");
			personajes.get("Varus").add("w:");
			personajes.get("Varus").add("r:");
			personajes.get("Caitlyn").add("q:");
			personajes.get("Caitlyn").add("e:");
			personajes.get("Caitlyn").add("w:");
			personajes.get("Caitlyn").add("r:");
			personajes.get("Janna").add("q:");
			personajes.get("Janna").add("e:");
			personajes.get("Janna").add("w:");
			personajes.get("Janna").add("r:");
			personajes.get("Zed").add("q:");
			personajes.get("Zed").add("e:");
			personajes.get("Zed").add("w:");
			personajes.get("Zed").add("r:");
			personajes.get("VI").add("q:");
			personajes.get("VI").add("e:");
			personajes.get("VI").add("w:");
			personajes.get("VI").add("r:");
			personajes.get("Tristana").add("q:");
			personajes.get("Tristana").add("e:");
			personajes.get("Tristana").add("w:");
			personajes.get("Tristana").add("r:");
			personajes.get("Vex").add("q:");
			personajes.get("Vex").add("e:");
			personajes.get("Vex").add("w:");
			personajes.get("Vex").add("r:");

			//Paso 4º con Ficheros. Operar con nuestro fichero (escribir en él)
			for(Map.Entry<String, ArrayList<String>> elem : personajes.entrySet()) {
				//El nombre del psj sabemos que es la clave de nuestro mapa
				String nombre = elem.getKey();

				ArrayList<String> habilidades = elem.getValue();

				fw.write("personaje");
				fw.write(System.lineSeparator()+"\t"); //System.lineSeparator() = salto de línea..... "\t" = tabulación
				fw.write(nombre);
				fw.write(System.lineSeparator()+"\t");
				fw.write("habilidades");
				//Sabemos que tenemos que recorrer el ArrayList que contiene las habilidades...
				//pues lo recorremos con un for
				for (String hab : habilidades) {
					fw.write(System.lineSeparator()+"\t\t");
					fw.write(hab);
				}
				fw.write(System.lineSeparator());
			}

			//5º cerrar el flujo de escritura
			fw.close();


		} catch (IOException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}

		/*
		 * Procedemos con la lectura del fichero
		 */
		try {

			//1er paso. Abrimos o creamos el fichero donde queramos operar
			File fichero2 = new File("./ficheros/ficheroPrueba.txt");

			//2º paso. comprobar si se ha creado/abierto correctamente
			if(fichero2.createNewFile()) {
				System.out.println("El fichero se ha creado correctamente en la ruta: "+fichero2.getPath());
			} else {
				System.out.println("el fichero ya existe");
			}

			//3er paso. Crear/Abrir un flujo de lectura
			BufferedReader br = new BufferedReader(new FileReader(fichero2));

			//4o paso. Operar con el fichero
			// readLine() => leer una línea y devuelve un String
			// readLine() => al final, es decir, cuando ha leído el archivo COMPLETO, entonces devuelve un null
			String linea = br.readLine();
			while(linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}

			//5º Cerramos el flujo de lectura
			br.close();


		} catch (IOException e) {
			System.err.println("Error fatal " +  e.getMessage());
		}
	}
}
