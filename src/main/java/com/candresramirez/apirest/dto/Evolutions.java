package com.candresramirez.apirest.dto;

public class Evolutions {

	private EvolutionChains evolutionChains;
	private EvolutionTriggers evolutionTriggers;
	
	public EvolutionChains getEvolutionChains() {
		return evolutionChains;
	}
	public void setEvolutionChains(EvolutionChains evolutionChains) {
		this.evolutionChains = evolutionChains;
	}
	public EvolutionTriggers getEvolutionTriggers() {
		return evolutionTriggers;
	}
	public void setEvolutionTriggers(EvolutionTriggers evolutionTriggers) {
		this.evolutionTriggers = evolutionTriggers;
	}
}
