package com.daw.tema8.teoria;

import java.util.ArrayList;

import com.daw.utilidades.Fichero;
import com.daw.utilidades.HandleJSON;
import com.daw.utilidades.Peticion;

public class MainPokemon {

	public static void main(String[] args) {
		
		Peticion pet = new Peticion();
		
		//OBTENER NOMBRES DE LOS POKEMONS
		//Obtengo los nombres de los pokemon
		/*
		pet.obtenerPersonajes("https://pokeapi.co/api/v2/pokemon?limit=150&offset=0", "./pokemons/nombresPokemon.json");
		*/
		
		Fichero fich = new Fichero();
		String rawJson = fich.leerFichero("./pokemons/nombresPokemon.json");
		
		HandleJSON hj = new HandleJSON();
		ArrayList<Pokemon> arrOfPoke= new ArrayList<Pokemon>();
		arrOfPoke = hj.obtenerNombresFromJson(rawJson);
		
		//Obtengo cada uno de los pokemon, recorriendo el array de Pokemons que tengo
		/*
		for(Pokemon poke : arrOfPoke) {
			pet.obtenerPersonajes(String.format("https://pokeapi.co/api/v2/pokemon/%s", poke.getNombre()), 
					String.format("./pokemons/allPokemon/%s.json", poke.getNombre()));
		}
		*/
		
		//Populo cada uno de los pokemons que tengo con los datos obtenidos de la pokeAPI
		for(Pokemon poke : arrOfPoke) {
			rawJson = "";
			rawJson = fich.leerFichero(String.format("./pokemons/allPokemon/%s.json", poke.getNombre()));
			hj.setDatosPokemonFromJson(rawJson, poke);
		}
		
		for(Pokemon poke : arrOfPoke) {
			poke.presentacion();
		}
		
		
		//OBTENER HABILIDADES DE LOS POKEMONS
		//Obtengo las habilidades de los pokemons
		/*
		pet.obtenerPersonajes("https://pokeapi.co/api/v2/ability?limit=327&offset=0", "./pokemons/nombresHabilidades.json");
		*/
		
		//OBTENER TIPOS DE LOS POKEMONS
		//Obtengo los tipos de los pokemons
		/*
		pet.obtenerPersonajes("https://pokeapi.co/api/v2/type?limit=20&offset=0", "./pokemons/nombresTipos.json");
		*/		

	}
	
	

}
