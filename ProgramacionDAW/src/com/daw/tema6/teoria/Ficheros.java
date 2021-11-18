package com.daw.tema6.teoria;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ficheros {

	public static void main(String[] args){
		
		/*
		 * /////////////////////////////////////////////////
		 * //////////////ESCRITURA DE FICHEROS//////////////
		 * /////////////////////////////////////////////////
		 */
		
		/*
		 * Ejemplo 1
		 */
		try {
			//1� Abrimos el fichero donde queramos escribir / leer
			File fichero = new File("./ficheros/prueba.txt");
						
			//2� Comprobar si el fichero se ha abierto correctamente
			if (fichero.createNewFile()) {
				System.out.println("File created: " + fichero.getName());
			} else {
				System.out.println("File already exists.");
			}
			
			//3� Crear un flujo de escritura
			FileWriter escritura = new FileWriter(fichero);
			
			//4� Operar con dicho fichero. Con el flujo de escritura que hemos creado.
			escritura.write("Hola");
			
			//5� Cerrar el flujo
			escritura.close();
			
			
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println(e.getStackTrace());
		}
		
		
		/*
		 * Ejemplo 2
		 */
		try {
			//1� Abrimos el fichero donde queramos escribir / leer
			FileWriter fich = new FileWriter("./ficheros/prueba2.txt");
			
			//3� Crear un flujo de escritura
			PrintWriter escritura2 = new PrintWriter(fich);
			
			//4� Operar con dicho fichero. Con el flujo de escritura que hemos creado.
			for (int i = 0; i < 10; i++) {
				escritura2.println("Adios");
			}
			
			//5� Cerrar el flujo
			escritura2.close();
			
			
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println(e.getStackTrace());
		}
		
		
		/*
		 * Ejemplo 3
		 */
		//Crear un mapa Integer String
		Map<Integer, String> datosAlumnos = new TreeMap<Integer, String>();
		//Voy a a�adir cosas al treeMap creado
		datosAlumnos.put(1, "Linares");
		datosAlumnos.put(2, "Aguilar");
		datosAlumnos.put(7, "Fernandez");
		datosAlumnos.put(9, "Casta�eda");
		datosAlumnos.put(5, "Gutierrez");
		datosAlumnos.put(6, "Protasio");
		datosAlumnos.put(3, "Belisario");
		//Compruebo que todo est� bien
		System.out.println("\nTreeMap con nombres asociados a una clave:\n" + datosAlumnos);
		
		//Quiero persistir los datos de los alumnos para que no se pierdan
		try {
			//1� Abrimos el fichero donde queramos escribir / leer
			FileWriter fich = new FileWriter("./ficheros/datosAlumnos.txt");
			//3� Abrir un flujo de escritura
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
		Map<Integer, String> pedidos = new TreeMap<Integer, String>();
		//Voy a a�adir cosas al treeMap creado
		pedidos.put(1, "FIFA 22");
		pedidos.put(2, "Assassin's Creed Valhalla");
		pedidos.put(7, "Assassin's Creed Valhalla");
		pedidos.put(9, "Battlefield 2042");
		pedidos.put(5, "Fornite");
		pedidos.put(6, "Fornite");
		pedidos.put(3, "Fornite");
		//Compruebo que todo est� bien
		System.out.println("\nTreeMap con nombres asociados a una clave:\n" + pedidos);
		
		EscribirPedido ep = new EscribirPedido();
		try {
			//1� Abrimos o creamos el fichero donde queramos operar
			File fich = new File("./ficheros/pedidos.txt");
			//2� Comprobamos que el fichero se haya abierto/creado correctamente. .createNewFile() crea un fichero nuevo 
			// cogiendo de nombre lo que se le ha pasado en la ruta especificada.
			if(fich.createNewFile()) {
				System.out.println("Archivo creado: "+fich.getName());
			} else {
				System.out.println("El archivo ya existe en la ruta "+fich.getCanonicalPath());
			}
			
			//3� Abrimos un flujo de escritura en nuestro fichero
			FileWriter fw = new FileWriter(fich);
			
			//4� En este punto, debemos llamar al m�todo escribirXML() de la clase EscribirPedido (objeto creado m�s arriba)
			// Aqu� lo que hacemos es operar con nuestro fichero, es decir, escribir todos los datos de los pedidos, PERSISTIR LOS DATOS.
			ep.escribirXML(pedidos, fw);
			ep.escribirJSON(pedidos, fw);
			
			//5� Cuando hemos terminado de operar con el fichero, cerramos el flujo
			fw.close();
			
		} catch (IOException e) {
			System.err.println("Error");
			System.err.print(e.getMessage());
		}
		
		/*
		 * /////////////////////////////////////////////////
		 * //////////////LECTURA DE FICHEROS//////////////
		 * /////////////////////////////////////////////////
		 */
		
		/*
		 * Ejemplo 1
		 */
		
		try {
			//1� Abrimos el fichero que queremos leer
			File fich = new File("./ficheros/pedidos.txt");
			
			//2� Realizamos una comprobaci�n para saber si el fichero se ha abierto correctamente, es decir,
			// comprobamos si existe.
			if(fich.exists()) {
				System.out.println("El fichero existe, se prosigue con la lectura");
				
				//3� Creamos/abrimos un flujo de lectura.
				BufferedReader br = new BufferedReader(new FileReader(fich));
				
				//4� Operamos con nuestro fichero. En este caso, si queremos leer todo el documento, lo hacemos con un while.
				String linea = new String(br.readLine());
				while(linea!=null) {
					System.out.println(linea);
					linea = br.readLine();
				}
				
				//5� Cerramos el flujo
				br.close();
				
			} else {
				System.out.println("El fichero no existe");
			}
			
		} catch (NullPointerException | IOException e) {
			System.err.println("Error");
			System.err.print(e.getMessage());
		}
		
	}
}
