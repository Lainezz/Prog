package com.daw.tema9.teoria;

public class Principal {

	public static void main(String[] args) {
		
		
		String nombre1 = "Francia";
		String nombre2 = "Portugal";
		
		Pais portugal = new Pais(nombre2); 
		
		Pais francia = new Pais(nombre1);
				
		francia.toString();
		
		
		
		System.out.println(francia.getNombre());
		System.out.println(portugal.getNombre());
		
		System.out.println(francia.toString());
	}

}
