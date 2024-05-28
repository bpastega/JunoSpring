package com.juno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.juno.entities.TabelaEntity;

public interface TabelaRepository extends JpaRepository<TabelaEntity, Long>  {
	
	@Query(value = "select * from pessoas where nome=?", nativeQuery = true)
	TabelaEntity findByNome(String nome);
}
