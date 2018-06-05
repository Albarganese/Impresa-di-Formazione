package it.uniroma3.spring.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.spring.model.Allievo;
import it.uniroma3.spring.model.Attivita;
import it.uniroma3.spring.repository.AttivitaRepository;

@Transactional
@Service
public class AttivitaService {

	@Autowired
	private AttivitaRepository attivitaRepository;


	public Attivita save(Attivita attivita) {
		return this.attivitaRepository.save(attivita);
	}

	public List<Attivita> findByNomeAttivita(String nomeAttivita) {
		return this.attivitaRepository.findByNomeAttivita(nomeAttivita);
	}

	public List<Attivita> findByData(Date dataAttivita)	{
		return this.attivitaRepository.findByData(dataAttivita);
	}

	public List<Attivita> findAll() {
		return (List<Attivita>) this.attivitaRepository.findAll();
	}

	public List<Allievo> trovaPartecipantiAttivita(Long idAttivita) {
		return findById(idAttivita).getAllievi();
    }
	
	public Attivita findById(Long id) {
		Optional<Attivita> attivita = this.attivitaRepository.findById(id);
		if (attivita.isPresent()) 
			return attivita.get();
		else
			return null;
    }
}