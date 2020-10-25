package com.candresramirez.apirest.dto;

public class EvolutionTriggers {
	
	private Integer id;
	private String name;
	private Object names[];
	private Object pokemon_species[];
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object[] getNames() {
		return names;
	}
	public void setNames(Object[] names) {
		this.names = names;
	}
	public Object[] getPokemon_species() {
		return pokemon_species;
	}
	public void setPokemon_species(Object[] pokemon_species) {
		this.pokemon_species = pokemon_species;
	}
	
	
}
