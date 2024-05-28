package com.juno.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juno.repositories.TabelaRepository;

@Service
public class TabelaService {
	
	@Autowired
	private TabelaRepository repository;
	
	public void teste(String nome) {
		repository.findByNome(nome);
	}

}
