package it.uniroma3.spring.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Allievo {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private String cognome;
	
	@NotNull
	private String email;
	
	@NotNull
	private Number telefono;
	
	@NotNull
	private Date datanascita;
	
	@NotNull
	private String luogonascita;
	
	@ManyToMany(mappedBy="allievo")
	private List<Attivita> attivitaregistrate;
	
	public Allievo() {
		
	}
	
	public Allievo(String nome, String cognome, String email, Number telefono,
			Date datanascita, String luogonascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.telefono = telefono;
		this.datanascita = datanascita;
		this.luogonascita = luogonascita;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Number getTelefono() {
		return telefono;
	}

	public void setTelefono(Number telefono) {
		this.telefono = telefono;
	}

	public Date getDatanascita() {
		return datanascita;
	}

	public void setDatanascita(Date datanascita) {
		this.datanascita = datanascita;
	}

	public String getLuogonascita() {
		return luogonascita;
	}

	public void setLuogonascita(String luogonascita) {
		this.luogonascita = luogonascita;
	}
	public List<Attivita> getAttivita() {
		return attivitaregistrate;
	}

	public void setEsami(List<Attivita> attivitaregistrate) {
		this.attivitaregistrate = attivitaregistrate;
	}
	
	@Override
	public String toString() {
		return this.nome + " " + this.cognome;
		
	}
	
	
}
