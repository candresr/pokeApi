package com.candresramirez.apirest.controller;


import java.util.List;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.candresramirez.apirest.dto.ResponseGenericDTO;
import com.candresramirez.apirest.service.PokemonService;

@RestController
@RequestMapping("/v1/apirest")
public class PokemonController {
	
	final Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private PokemonService service;
	
	@GetMapping("/listPokemon")
	public ResponseGenericDTO listPokemon() {
		logger.info("PokemonController - listPokemon()");
		return service.listPokemon();
	}
	
	@GetMapping("/detailPokemon/{name}")
	public ResponseGenericDTO detailPokemon(@PathVariable("name") String name) {
		logger.info("PokemonController - detailPokemon()");
		return service.detailPokemon(name);
	}

}
