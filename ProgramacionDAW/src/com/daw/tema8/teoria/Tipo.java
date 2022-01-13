package com.daw.tema8.teoria;

public enum Tipo {
	
	NORMAL,
	FIGHTING,
	FLYING,
	POISON,
	GROUND,
	ROCK,
	BUG,
	GHOST,
	STEEL,
	FIRE,
	WATER,
	GRASS,
	ELECTRIC,
	PSYCHIC,
	ICE,
	DRAGON,
	DARK,
	FAIRY,
	UNKNOWN,
	SHADOW;
	
	public static Tipo setTipo(String tipo) {
		
		return Tipo.valueOf(tipo.toUpperCase());
		
	}
	
	
}
