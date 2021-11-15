package com.daw.tema6.teoria;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ficheros {

	public static void main(String[] args){
		
		
		
		
		
		
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
		
		
		
		//Crear un mapa Integer String
		Map<Integer, String> datosAlumnos = new TreeMap<Integer, String>();
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
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//
		
	}

}
