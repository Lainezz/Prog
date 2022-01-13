package com.daw.tema8.teoria;

import java.util.ArrayList;
import java.util.Random;

public class Pokemon {

	private String nombre, url;
	private Tipo tipo;
	private int vida;
	private ArrayList<Ataque> ataques;
	boolean vivo = true;

	//CONSTRUCTORES
	public Pokemon() {
		this.ataques = new ArrayList<Ataque>();
	}

	public Pokemon(String nombre, Tipo tipo, int vida) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.vida = vida;
		this.ataques = new ArrayList<Ataque>();
	}
	
	public Pokemon(String nombre, int vida) {
		this.nombre = nombre;
		this.vida = vida;
	}



	public void presentacion() {
		System.out.format("[Pokemon %s con habilidades: [", this.nombre);
		Random random = new Random();
		int nRand = 0;
		for(int i =0; i<4; i++) {
			nRand = random.nextInt(ataques.size());
			System.out.format(" %s", ataques.get(nRand).nombre);
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
	
	
	public void probabilidadDeAmor(Pokemon pok) {
		
		if(this.tipo == pok.tipo) {
			System.out.println("Amor ciego");
		} else {
			System.out.println("También amor ciego");
		}
		
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

	public ArrayList<Ataque> getAtaques() {
		
		return ataques;
	}

	public void setAtaques(ArrayList<Ataque> ataques) {
		this.ataques = ataques;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}




}
