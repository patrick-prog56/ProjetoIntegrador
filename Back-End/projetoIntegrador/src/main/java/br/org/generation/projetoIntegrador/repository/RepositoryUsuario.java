package br.org.generation.projetoIntegrador.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.projetoIntegrador.model.Usuario;


public interface RepositoryUsuario extends JpaRepository<Usuario, Long>{
    public Optional<Usuario> findByUsuario(String Usuario);
}
