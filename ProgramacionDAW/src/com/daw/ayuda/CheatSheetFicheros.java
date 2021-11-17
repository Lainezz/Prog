package com.daw.ayuda;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CheatSheetFicheros {

	
	public static void main(String[] args) {
		
		/*
		 * ESCRITURA DE ARCHIVOS CON FILEWRITER
		 */
		// Tenemos que introducir el código en el que tratemos con ficheros
		//dentro de un bloque try/catch debido a que el manejo de ficheros
		//pueden "throwear" excepciones. De esta manera las capturamos, y las tratamos.
		try {
			//1º Abrimos el fichero donde queramos escribir / leer
			File fichero = new File("./ficheros/pedidos.txt");
						
			//2º Comprobar si el fichero se ha creado correctamente
			if (fichero.createNewFile()) {
				System.out.println("File created: " + fichero.getName());
			} else {
				System.out.println("File already exists.");
			}
			
			//3º Crear un flujo de escritura
			FileWriter escritura = new FileWriter(fichero);
			
			//4º Operar con dicho fichero. Con el flujo de escritura que hemos creado.
			int pedido = 106;
			for (int i = 0; i < 10; i++) {
				
				escritura.write("<pedido>");

				escritura.write(System.lineSeparator()+"  ");
				escritura.write("<id>"+pedido+"</id>");
				escritura.write(System.lineSeparator()+"  ");
				escritura.write("<producto>prod"+i+"</producto>");
				escritura.write(System.lineSeparator()+"  ");
				escritura.write("<pagado>true</pagado>");
				escritura.write(System.lineSeparator());

				escritura.write("</pedido>");
				escritura.write(System.lineSeparator());
				pedido++;
			}
			//5º Cerrar el flujo
			escritura.close();
			
			
		} catch (IOException e) {
			// Manejamos la excepción, que en este caso es de InputOutputException.
			// Es una excepción que se suele dar cuando no se tienen los permisos 
			// suficientes para leer o escribir en el archivo.
			System.err.print(e.getMessage());
			System.err.print(". Revise los permisos de acceso de su fichero y vuelva a intentarlo.");
		}
	}
}
