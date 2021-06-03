package br.org.generation.projetoIntegrador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_tema")
public class Tema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 3 , max = 255)
	private String nomeTema; //nome dos temas
	
	@NotNull
	@Size(min = 3 , max = 500)
	private String descricaoTema;
	
	@NotNull
	@Size(min = 3 , max = 255)
	private String palavrasChaveTema;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeTema() {
		return nomeTema;
	}

	public void setNomeTema(String nomeTema) {
		this.nomeTema = nomeTema;
	}

	public String getDescricaoTema() {
		return descricaoTema;
	}

	public void setDescricaoTema(String descricaoTema) {
		this.descricaoTema = descricaoTema;
	}

	public String getPalavrasChaveTema() {
		return palavrasChaveTema;
	}

	public void setPalavrasChaveTema(String palavrasChaveTema) {
		this.palavrasChaveTema = palavrasChaveTema;
	}
}
