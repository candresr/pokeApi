package com.candresramirez.apirest.dto;


public class DetailPokemon {
	
	private Object abilities[];
	private String base_experience;
	private Object forms[];
	private Object game_indices[];
	private Integer height;
	private Object held_items[];
	private Integer id;
	private Boolean is_default;
	private String location_area_encounters;
	private Object moves[];
	private String name;
	private Integer order;
	private Object species;
	private Object sprites;
	private Object stats[];
	private Object types[];
	private Integer weight;
	
	public Object[] getAbilities() {
		return abilities;
	}
	public void setAbilities(Object[] abilities) {
		this.abilities = abilities;
	}
	public String getBase_experience() {
		return base_experience;
	}
	public void setBase_experience(String base_experience) {
		this.base_experience = base_experience;
	}
	public Object[] getForms() {
		return forms;
	}
	public void setForms(Object[] forms) {
		this.forms = forms;
	}
	public Object[] getGame_indices() {
		return game_indices;
	}
	public void setGame_indices(Object[] game_indices) {
		this.game_indices = game_indices;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Object[] getHeld_items() {
		return held_items;
	}
	public void setHeld_items(Object[] held_items) {
		this.held_items = held_items;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getIs_default() {
		return is_default;
	}
	public void setIs_default(Boolean is_default) {
		this.is_default = is_default;
	}
	public String getLocation_area_encounters() {
		return location_area_encounters;
	}
	public void setLocation_area_encounters(String location_area_encounters) {
		this.location_area_encounters = location_area_encounters;
	}
	public Object[] getMoves() {
		return moves;
	}
	public void setMoves(Object[] moves) {
		this.moves = moves;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}
	public Object getSpecies() {
		return species;
	}
	public void setSpecies(Object species) {
		this.species = species;
	}
	public Object getSprites() {
		return sprites;
	}
	public void setSprites(Object sprites) {
		this.sprites = sprites;
	}
	public Object[] getStats() {
		return stats;
	}
	public void setStats(Object[] stats) {
		this.stats = stats;
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

}
