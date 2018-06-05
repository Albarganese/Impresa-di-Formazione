package it.uniroma3.spring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.spring.model.Allievo;

public interface AllievoRepository extends CrudRepository<Allievo, Long> {

	 List<Allievo> findByCognome(String lastName);

	 List<Allievo> findByNome(String lastName);
	 
	 List<Allievo> findByNomeAndCognomeAndEmail(String nome, String cognome, String email);
	 
	    
}
