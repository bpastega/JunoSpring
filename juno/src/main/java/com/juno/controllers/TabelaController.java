package com.juno.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juno.services.TabelaService;

@RestController
@RequestMapping
public class TabelaController {
	
	@Autowired
	private TabelaService  service;
	
	@GetMapping("/findbynome/{nome}")
	public void controllerteste(@PathVariable String nome) {
		//service.teste(nome);
		
		System.out.println(nome);
	}
}
