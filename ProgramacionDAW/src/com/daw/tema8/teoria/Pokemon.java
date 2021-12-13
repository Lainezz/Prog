package com.daw.tema8.teoria;

import java.util.ArrayList;

public class Pokemon {
	
	private String nombre, lore, tipo;
	private int vida;
	ArrayList<Ataque> ataques;
	

	
	public Pokemon(String nombre, String tipo, int vida) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.vida = vida;
	}
	
	public Pokemon() {
		
	}
	

	public int recibirAtaque(Ataque ataque) {
		
		return this.vida - ataque.danio;
	}
	
}
