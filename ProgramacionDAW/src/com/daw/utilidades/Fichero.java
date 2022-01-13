package com.daw.utilidades;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Fichero {
	
	/**
	 * Lee el fichero donde se ha escrito (persistido) la respuesta HTTP realizada.
	 * Esta respuesta tiene formato JSON
	 * @param ruta (Ruta en la que está el archivo que se quiere leer)
	 * @return String que contiene toda la lectura del fichero
	 */
	public String leerFichero(String ruta) {

		StringBuilder sb = new StringBuilder();
		BufferedReader br = null;
		try {
			//1º Abrimos el fichero que queremos leer
			File fich = new File(ruta);

			//2º Realizamos una comprobación para saber si el fichero se ha abierto correctamente, es decir,
			// comprobamos si existe.
			if(fich.exists()) {
				System.out.println("El fichero existe, se prosigue con la lectura");

				//3º Creamos/abrimos un flujo de lectura.
				br = new BufferedReader(new FileReader(fich));

				//4º Operamos con nuestro fichero. En este caso, si queremos leer todo el documento, lo hacemos con un while.
				String linea = new String(br.readLine());
				while(linea!=null) {
					sb.append(linea);
					linea = br.readLine();
				}

			} else {
				System.out.println("El fichero no existe");
			}


		} catch (IOException e) {
			System.err.println("Error al leer el archivo: "+e.getMessage());
		} catch (NullPointerException e) {
			System.err.println("Nullpointer "+e.getMessage());
		} finally {
			cerrarFlujos(null, br);
		}

		return sb.toString();
	}
	
	/**
	 * Escribe un fichero de texto plano dados un texto y una ruta donde se quiere crear el fichero
	 * @param texto (tipo String. Es el texto a escribir en el fichero)
	 * @param ruta (tipo String. Es la ruta donde especificamos que tiene que escribirse el fichero)
	 */
	public void escribirFichero(String texto, String ruta) {
		BufferedWriter bw = null;
		try {
			//1º Abrimos el fichero donde queramos escribir / leer
			File fichero = new File(ruta);

			//2º Comprobar si el fichero se ha abierto correctamente
			if (fichero.createNewFile()) {
				System.out.println("Fichero creado: " + fichero.getName());
			} else {
				System.out.println("El fichero existe, se prosigue con la escritura");
			}

			//3º Crear un flujo de escritura
			bw = new BufferedWriter(new FileWriter(fichero));

			//4º Operar con dicho fichero. Con el flujo de escritura que hemos creado.
			bw.write(texto);


		} catch (IOException e) {
			System.err.println("Error al escribir el archivo: "+e.getMessage());
		} finally {
			//5º Cerrar el flujo
			cerrarFlujos(bw, null);
		}

	}
	
	/**
	 * Metodo que cierra los flujos tanto de escritura como de lectura
	 * @param w (Writer de escritura)
	 * @param r (Reader de lectura)
	 */
	public void cerrarFlujos(Writer w, Reader r) {
		try {
			if(w!=null) {
				System.out.println("Flujo de escritura cerrado correctamente");
				w.close();
			}
			if(r!=null) {
				System.out.println("Flujo de lectura cerrado correctamente");
				r.close();
			}
		} catch (IOException e) {
			System.err.println("Error cerrando los flujos de Lectura/Escritura: "+e.getMessage());
		}

	}
}
