package com.daw.utilidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.json.JSONArray;
import org.json.JSONObject;

import com.daw.tema8.teoria.Ataque;
import com.daw.tema8.teoria.Pokemon;
import com.daw.tema8.teoria.Tipo;

public class HandleJSON {

	
	/**
	 * Se recibe un String cad que es el JSON que recibimos en el cuerpo de la respuesta HTTP.
	 * Ese JSON hay que tratarlo para extraer los datos que se desean.
	 * @param cad (String con un formato JSON que contiene la respuesta HTTP hecha)
	 * @return String (contiene los datos que hemos extraído del JSON)
	 */
	public ArrayList<Pokemon> obtenerNombresFromJson(String cad) {

		StringBuilder sb = new StringBuilder();
		ArrayList<Pokemon> pokeArray = new ArrayList<Pokemon>();
		JSONObject request = new JSONObject(cad);

		//JSONObject data = request.getJSONObject("results");
		for (Entry<String, Object> entry : request.toMap().entrySet()) {
			

			String key = entry.getKey();
			
			if(key.equals("results")) {
				
				if (entry.getValue() instanceof ArrayList) {
					ArrayList<HashMap<String, String>> entryArr = (ArrayList<HashMap<String, String>>) entry.getValue();
					
					for (HashMap<String, String> hm : entryArr) {
						Pokemon pok = new Pokemon();
						pok.setNombre(hm.get("name"));
						pok.setUrl(hm.get("url"));
						System.out.println();
						pokeArray.add(pok);
					}
				}			
			} 			
		}
		return pokeArray;
	}
	
	public void setDatosPokemonFromJson(String cad, Pokemon pok) {
		
		JSONObject request = new JSONObject(cad);

		//JSONObject data = request.getJSONObject("results");
		for (Entry<String, Object> entry : request.toMap().entrySet()) {
			

			String key = entry.getKey();
			
			if(key.equals("name")) {
				
				//pok.setNombre((String)entry.getValue());
			
			}else if(key.equals("moves") || key.equals("types")) {
				
				if (entry.getValue() instanceof ArrayList) {
					ArrayList<HashMap<String, Object>> entryArr = (ArrayList<HashMap<String, Object>>) entry.getValue();
					
					for (HashMap<String, Object> hm : entryArr) {
						
						if(hm.get("move") instanceof Map) {
							HashMap<String, Object> hm2 = (HashMap<String, Object>) hm.get("move");
							Ataque at = new Ataque((String)hm2.get("name"));
							pok.getAtaques().add(at); 
						}
						
						if(hm.get("type") instanceof Map) {
							if(pok.getTipo() == null) {
								HashMap<String, Object> hm2 = (HashMap<String, Object>) hm.get("type");
								pok.setTipo(Tipo.setTipo((String)hm2.get("name")));
							}
						}
						
					}
				}			
			} 			
		}
		
	}
	
	
	
	
}
