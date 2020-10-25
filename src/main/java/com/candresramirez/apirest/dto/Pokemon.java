package com.candresramirez.apirest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon {
	
    private Integer count;
    private String next;
    private String previous;
    private DataPokemon results[];
    
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public String getPrevious() {
		return previous;
	}
	public void setPrevious(String previous) {
		this.previous = previous;
	}
	public DataPokemon[] getResults() {
		return results;
	}
	public void setResults(DataPokemon[] results) {
		this.results = results;
	}

   
}
