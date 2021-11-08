package com.daw.tema5.teoria;

import java.util.*;

public class SetsYMapas {
	
	public static void main(String[] args) {
		System.out.println("SETS Y MAPS\n");
		
		//SETS
		//Tipo de colecci�n donde no puede hacer elementos repetidos
		//
		//Hashset. Colecci�n que implementa tabla Hash.
		//Para declarar un hashSet
		//Interfaz(Set)<Tipo de dato> nombre = new HashSet<Tipo de dato>();
		Set<String> setHash = new HashSet<String>();
		
		//Para a�adir elementos, hacemos igual que con el Arraylist
		setHash.add("Hola");
		setHash.add("Maniana");
		setHash.add("Diego");
		setHash.add("Almeria");
		setHash.add("Diego");
		
		
		//Al imprimir nuestra colecci�n, vemos que solo hay 1 elemento con valor "Diego", por la condici�n de los SETS de que no pueden haber elementos repetidos
		System.out.println("SetHash creado:\n"+setHash);
		
		
		//�Como hace para no insertar dos elementos iguales?
		String cadena = "Diego";
		System.out.println("\nLa cadena "+ cadena + " tiene un hashCode:"+ cadena.hashCode()+"\n");
		
		
		for(String s : setHash) {
			System.out.println(s + " tiene un hashCode: "+ s.hashCode());
		}

		//
		//TreeSet. Colecci�n que almacena sus elementos ordenados
		//Interfaz(Set)<Tipo de dato> nombre = new TreeSet<Tipo de dato>();
		Set<String> treeSet = new TreeSet<String>();
		
		//Para anadir elementos, hacemos igual que con el Arraylist e igual que el HashSet
		treeSet.add("Diego");
		treeSet.add("Biego");
		treeSet.add("Biego");
		treeSet.add("Bingo");
		treeSet.add("Zuzo");
		treeSet.add("Helicoptero");
		
		//Vemos que inserta los elementos de manera ordenada (en este caso, de forma alfab�tica)
		System.out.println("\nTreeSet creado:\n"+treeSet);
		
		
		//MAPS
		//Admite dos valores por elemento y no puede haber elementos repetidos
		//
		//HashMap. Coleccion que implementa tabla hash
		//Interfaz<tipo de dato de clave, tipo de dato de valor> nombre = new HashMap<tipo de dato de clave, tipo de dato de valor>();
		Map<String, String> hashMap = new HashMap<String, String>();
		
		hashMap.put("75186773B", "Diego"); 	//Insertamos clave - valor
		hashMap.put("75186773B","Alfonso"); //La clave ya existe... no a�ade una clave nueva, si no que sobreescribe el valor
		hashMap.put("64075662A", "Pepito"); //La clave no existe... se a�ade de forma normal sin orden espec�fico
		hashMap.put("64075662B", "Ruben");	//La clave no existe... se a�ade de forma normal sin orden espec�fico
		
		System.out.println("\nHashMap creado:\n"+hashMap); //Como vemos, los elementos se han ido a�adiendo sin un orden espec�fico
		
		System.out.println("\nClave 75186773B con valor : "+ hashMap.get("75186773B"));	//Aqu� vemos que podemos acceder a un elemento por su clave
		
		//Otro ejemplo de HashMap
		Map<Integer, String> hashMapInt = new HashMap<Integer, String>();
		hashMapInt.put(637187007, "Billy");
		hashMapInt.put(647254265, "Michael");
		hashMapInt.put(657187008, "Ed");
		System.out.println("\nHashMap con num telefono:\n"+hashMapInt);
		
		//Otro ejemplo de HashMap de clave Integer y valor Arraylist. Clave -> conjunto de valores
		Map<Integer, ArrayList<String>> hashMapInstituto = new HashMap<Integer, ArrayList<String>>();
		//Inicializo cada clave con un ArrayList dentro
		hashMapInstituto.put(1, new ArrayList<String>());
		hashMapInstituto.put(2, new ArrayList<String>());
		
		//A�ado valores al arraylist que tiene clave 1
		hashMapInstituto.get(1).add("Conrado");
		hashMapInstituto.get(1).add("Sebastian");
		hashMapInstituto.get(1).add("Alba");
		hashMapInstituto.get(1).add("Carlos");
		//A�ado valores al arraylist que tiene clave 2
		hashMapInstituto.get(2).add("Gema");
		hashMapInstituto.get(2).add("Jose Luis");
		hashMapInstituto.get(2).add("Dani");
		hashMapInstituto.get(2).add("Alvaro");
		//Imprimo mi hashmap
		System.out.println("\nHashMap con clases y alumnos de cada clase:\n"+hashMapInstituto);
		
		//
		//TreeMap. Coleccion que inserta sus elementos ordenandos por su clave
		//Interfaz<Tipo dato clave, tipo dato valor> nombre = new TreeMap<tipo dato clave, tipo dato valor>();
		Map<Integer, String> treeMapInt = new TreeMap<Integer, String>();
		treeMapInt.put(1, "Linares");
		treeMapInt.put(2, "Aguilar");
		treeMapInt.put(7, "Fernandez");
		treeMapInt.put(9, "Casta�eda");
		treeMapInt.put(5, "Gutierrez");
		treeMapInt.put(6, "Protasio");
		treeMapInt.put(3, "Belisario");
		System.out.println("\nTreeMap con nombres asociados a una clave:\n"+treeMapInt);
		
		//
		//Iteradores
		//Podemos recorrer las colecciones con un foreach
		//for ( tipo_variable nombre_variable : la lista por la que queremos iterar)
		for (String cad : setHash) {
			System.out.println("La cadena es: "+cad);
		}
		
		Set<Integer> setHashInt = new HashSet<Integer>();
		setHashInt.add(10);
		setHashInt.add(20);
		setHashInt.add(30);
		setHashInt.add(40);
		System.out.println(setHashInt);
		
		for (int numero : setHashInt) {
			System.out.println("El numero es: "+numero);
		}
		
		for (Map.Entry<Integer, String> entry : treeMapInt.entrySet()) {
			int key = entry.getKey();
			String val = entry.getValue();
			
			System.out.println("Clave "+key+ " valor "+val);
		}
		
		for (var entry : treeMapInt.entrySet()) {
			entry.getKey();
			entry.getValue();
		}
		
		
		/*
		 * 1. Crear una colecci�n por cada tipo de colecci�n. (Arraylist) (Set -> HashSet y TreeSet) (Maps -> HashMap y TreeMap)
		 * 2. Meter valores a cada una de las colecciones creadas
		 * 		a) En el caso de HashMap y TreeMap... esos valores tienen que tener sentido
		 * 3. Recorrer con un foreach cada una de las colecciones que hab�is creado.
		 */
		
		
		
		
		

	}

}
