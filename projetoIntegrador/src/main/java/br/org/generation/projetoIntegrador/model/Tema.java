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
	private String nome_tema;
	
	@NotNull
	@Size(min = 3 , max = 255)
	private String descricao_tema;
	
	@NotNull
	@Size(min = 3 , max = 255)
	private String palavras_chave;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome_tema() {
		return nome_tema;
	}

	public void setNome_tema(String nome_tema) {
		this.nome_tema = nome_tema;
	}

	public String getDescricao_tema() {
		return descricao_tema;
	}

	public void setDescricao_tema(String descricao_tema) {
		this.descricao_tema = descricao_tema;
	}

	public String getPalavras_chave() {
		return palavras_chave;
	}

	public void setPalavras_chave(String palavras_chave) {
		this.palavras_chave = palavras_chave;
	}
	

	
}
