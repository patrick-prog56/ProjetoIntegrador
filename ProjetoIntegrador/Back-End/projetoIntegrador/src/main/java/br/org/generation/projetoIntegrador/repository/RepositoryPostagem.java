package br.org.generation.projetoIntegrador.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.projetoIntegrador.model.Postagem;


@Repository
public interface RepositoryPostagem extends JpaRepository<Postagem,Long> {
	
	public List<Postagem> findAllByConteudoPostagemContainingIgnoreCase(String conteudoPostagem);

}
