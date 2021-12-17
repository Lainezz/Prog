package com.daw.tema8.teoria;

import java.util.ArrayList;

public class Pokemon {

	private String nombre, url;
	private Tipo tipo;
	private int vida;
	private Ataque[] ataques;

	//CONSTRUCTORES
	public Pokemon() {
		this.ataques = new Ataque[4];
	}

	public Pokemon(String nombre, Tipo tipo, int vida) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.vida = vida;
		this.ataques = new Ataque[4];
	}
	
	
	
	public void presentacion() {
		System.out.format("[Pokemon %s con habilidades: [", this.nombre);
		for(Ataque at : this.ataques) {
			if(at==null) break;
			System.out.format(" %s", at.nombre);
			
		}
		System.out.format("] y es de tipo %s%n", this.tipo.toString().toLowerCase());
	}
	
	/**
	 * Método que resta vida a un pokemon al recibir un ataque
	 * @param ataque
	 * @return
	 */
	public int recibirAtaque(Ataque ataque) {

		
		return this.vida - ataque.danio;
	}
	
	/**
	 * Método que imprime por pantalla los ataques que tiene un pokemon
	 */
	public void printAtaques() {
		
		for(Ataque ataque : this.ataques) {
			System.out.format("[Ataque %s con danio %d y de tipo %s]%n", ataque.nombre, ataque.danio, ataque.tipo);
		}
	}
	
	
	//GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public Ataque[] getAtaques() {
		
		return ataques;
	}

	public void setAtaques(Ataque[] ataques) {
		this.ataques = ataques;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
	
	
}
