package com.daw.tema6.teoria;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;

public class EscribirPedido {
	
	/**
	 * M�todo que escribe un fichero de texto plano en formato XML.
	 * Este fichero almacenar� todos los pedidos que se han hecho.
	 * @param mp Mapa con clave tipo Integer y valor tipo String
	 * @param fw Flujo de escritura tipo Writer (gen�rico)
	 * @throws IOException
	 */
	public void escribirXML(Map<Integer, String> mp, Writer fw) throws IOException {
		
		//Recorremos el mapa que nos viene pasado por par�metros junto con el flujo de escritura ya abierto
		for(Map.Entry<Integer, String> elem : mp.entrySet()) {
			
			//Empezamos a escribir todos los pedidos en formato XML
			fw.write("<pedido>");
			//lineSeparator = salto de l�nea. \t = tabulaci�n
			fw.write(System.lineSeparator()+"\t");
			
			fw.write("<id>"+elem.getKey()+"</id>");
			fw.write(System.lineSeparator()+"\t");
			fw.write("<producto>"+elem.getValue()+"</producto>");
			fw.write(System.lineSeparator());
			
			fw.write("</pedido>");
			fw.write(System.lineSeparator());
		}
	}
	
	/**
	 * M�todo que escribe un fichero de texto plano en formato JSON.
	 * Este fichero almacenar� todos los pedidos que se han hecho.
	 * @param mp Mapa con clave tipo Integer y valor tipo String
	 * @param fw Flujo de escritura tipo Writer (gen�rico)
	 * @throws IOException
	 */
	public void escribirJSON(Map<Integer, String> mp, Writer fw) throws IOException{
		//Recorremos el mapa que nos viene pasado por par�metros junto con el flujo de escritura ya abierto
		for(Map.Entry<Integer, String> elem : mp.entrySet()) {
			
			//Empezamos a escribir todos los pedidos en formato JSON
			fw.write("{");
			//lineSeparator = salto de l�nea. \t = tabulaci�n
			fw.write(System.lineSeparator()+"\t");
			fw.write("\"pedido\":");
			fw.write(System.lineSeparator()+"\t{");
			
			fw.write(System.lineSeparator()+"\t\t");
			fw.write("\"id\": \""+elem.getKey()+"\",");
			fw.write(System.lineSeparator()+"\t\t");
			fw.write("\"producto\": \""+elem.getValue()+"\"");
			
			fw.write(System.lineSeparator()+"\t}");
			
			fw.write(System.lineSeparator());
			fw.write("}");
			fw.write(System.lineSeparator());
		}
	}
	
}
