package com.candresramirez.apirest.dto;

public class ResponseDetailPokemon {
	
	private String name;
	private Object types[];
	private Integer weight;
	private Object abilities[];
	private Object descriptions;
	private Evolutions evolutions;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object[] getTypes() {
		return types;
	}

	public void setTypes(Object[] types) {
		this.types = types;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Object[] getAbilities() {
		return abilities;
	}

	public void setAbilities(Object[] abilities) {
		this.abilities = abilities;
	}

	public Object getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(Object descriptions) {
		this.descriptions = descriptions;
	}

	public Evolutions getEvolutions() {
		return evolutions;
	}

	public void setEvolutions(Evolutions evolutions) {
		this.evolutions = evolutions;
	}
	

}
