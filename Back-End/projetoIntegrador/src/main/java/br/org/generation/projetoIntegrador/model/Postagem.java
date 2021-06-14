package br.org.generation.projetoIntegrador.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name= "tb_postagem")
public class Postagem {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 3, max = 500)
	private String conteudoPostagem;
	

    @Temporal(TemporalType.TIMESTAMP)
    private Date criadoEm = new java.sql.Date(System.currentTimeMillis());
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date atualizadoEm = new java.sql.Date(System.currentTimeMillis());
    
    
    @NotNull
    private boolean emergencia;
    
    
    @ManyToOne
    @JsonIgnoreProperties("postagem")
    private Tema tema;
    
    @ManyToOne
    @JsonIgnoreProperties("postagem")
    private Usuario usuario;



	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getConteudoPostagem() {
		return conteudoPostagem;
	}


	public void setConteudoPostagem(String conteudoPostagem) {
		this.conteudoPostagem = conteudoPostagem;
	}


	public Date getCriadoEm() {
		return criadoEm;
	}


	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}


	public Date getAtualizadoEm() {
		return atualizadoEm;
	}


	public void setAtualizadoEm(Date atualizadoEm) {
		this.atualizadoEm = atualizadoEm;
	}


	public boolean isEmergencia() {
		return emergencia;
	}


	public void setEmergencia(boolean emergencia) {
		this.emergencia = emergencia;
	}


	public Tema getTema() {
		return tema;
	}


	public void setTema(Tema tema) {
		this.tema = tema;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
    
	
    
    
	
	
	
	
	
	

}
