package com.candresramirez.apirest.service;



import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.candresramirez.apirest.dto.Characteristic;
import com.candresramirez.apirest.dto.DetailPokemon;
import com.candresramirez.apirest.dto.EvolutionChains;
import com.candresramirez.apirest.dto.EvolutionTriggers;
import com.candresramirez.apirest.dto.Evolutions;
import com.candresramirez.apirest.dto.Pokemon;
import com.candresramirez.apirest.dto.ResponseDetailPokemon;
import com.candresramirez.apirest.dto.ResponseGenericDTO;
import com.candresramirez.apirest.dto.ResponseListPokemon;

@Service
public class PokemonService {
	
	final Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private RestTemplate restTemplate;
	
    
    private String getRootUrl() {
        return "https://pokeapi.co/api/v2";
    }
    
    private HttpEntity<String> getHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("user-agent", "Application");
		HttpEntity<String> entity = new HttpEntity<>(headers);
		
		return entity;
    }
	
	public  ResponseGenericDTO listPokemon() {
		try {
			List<ResponseListPokemon> response = listApi();
			return new ResponseGenericDTO(response, true, Integer.toString(HttpStatus.OK.value()), HttpStatus.OK);
		} catch (Exception e) {
			logger.error("listPokemon error: " + e.getMessage());
			return new ResponseGenericDTO(null, false, Integer.toString(HttpStatus.INTERNAL_SERVER_ERROR.value()), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

	public ResponseGenericDTO  detailPokemon(String name) {
		try {
			ResponseDetailPokemon response = detailApi(name);
			return new ResponseGenericDTO(response, true, Integer.toString(HttpStatus.OK.value()), HttpStatus.OK);
		} catch (Exception e) {
			logger.error("listPokemon error: " + e.getMessage());
			return new ResponseGenericDTO(null, false, Integer.toString(HttpStatus.INTERNAL_SERVER_ERROR.value()), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public List<ResponseListPokemon> listApi() {
		
		Pokemon response = restTemplate.exchange(getRootUrl() + "/pokemon?offset=0&limit=10", HttpMethod.GET, getHeaders(), Pokemon.class).getBody();
		List<ResponseListPokemon> resp = new ArrayList<>();	
		for (int i = 0; i < response.getResults().length; i++) {
			ResponseListPokemon dto = listApi(response.getResults()[i].getName());
			resp.add(dto);
		}
		
		return resp;
	}
	
	public ResponseDetailPokemon detailApi(String name) {
				
		DetailPokemon response = restTemplate.exchange(getRootUrl() + "/pokemon/" + name, HttpMethod.GET, getHeaders(), DetailPokemon.class).getBody();
		
		ResponseDetailPokemon detail = new ResponseDetailPokemon();
		detail.setName(response.getName());
		detail.setWeight(response.getWeight());
		detail.setTypes(response.getTypes());
		detail.setAbilities(response.getAbilities());
		detail.setDescriptions(characteristicApi(response.getId()));
		detail.setEvolutions(evolutions(response.getId()));
		return detail;
	}
	
	public ResponseListPokemon listApi(String name) {
		
		DetailPokemon response = restTemplate.exchange(getRootUrl() + "/pokemon/" + name, HttpMethod.GET, getHeaders(), DetailPokemon.class).getBody();
		
		ResponseListPokemon detail = new ResponseListPokemon();
		detail.setName(response.getName());
		detail.setWeight(response.getWeight());
		detail.setTypes(response.getTypes());
		detail.setAbilities(response.getAbilities());
		return detail;
	}
	
	public Object characteristicApi(Integer id) {
		
		Characteristic response = restTemplate.exchange(getRootUrl() + "/characteristic/" + id, HttpMethod.GET, getHeaders(), Characteristic.class).getBody();
		
		return response.getDescriptions()[0];
	}
	
	public Evolutions evolutions(Integer id) {
		
		Evolutions evolutions = new Evolutions();
		evolutions.setEvolutionChains(evolutionchainApi(id));
		evolutions.setEvolutionTriggers(evolutiontriggerApi(id));
		
		return evolutions;
	}
	
	public EvolutionTriggers evolutiontriggerApi(Integer id) {
		
		EvolutionTriggers evolutiontrigger = restTemplate.exchange(getRootUrl() + "/evolution-trigger/" + id, HttpMethod.GET, getHeaders(), EvolutionTriggers.class).getBody();
		
		return evolutiontrigger;
	}
	
	public EvolutionChains evolutionchainApi(Integer id) {
		
		EvolutionChains evolutiontrigger = restTemplate.exchange(getRootUrl() + "/evolution-chain/" + id, HttpMethod.GET, getHeaders(), EvolutionChains.class).getBody();
		
		return evolutiontrigger;
	}
}
