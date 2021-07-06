package org.generation.projetoIntegrador.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String nome;

	@NotNull
	@Size(min = 5, max = 100)
	private String usuario;

	@NotNull
	@Size(max=255)
	@Email
	private String email;
	
	@NotNull
	@Size(min = 5)
	private String senha;

	@NotNull
	private String pfSaude;

	private Integer numRegistro;

	
	public Usuario() {}
	
	public Usuario(String nome, String usuario, String email, String senha, String pfSaude, Integer numRegistro) {
		this.nome = nome;
		this.usuario = usuario;
		this.email = email;
		this.senha = senha;
		this.pfSaude = pfSaude;
		this.numRegistro = numRegistro;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

    public String getPfSaude() {
        return pfSaude;
    }

    public void setPfSaude(String pfSaude) {
        this.pfSaude = pfSaude;
    }

    public Integer getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(Integer numRegistro) {
		this.numRegistro = numRegistro;
	}
}
