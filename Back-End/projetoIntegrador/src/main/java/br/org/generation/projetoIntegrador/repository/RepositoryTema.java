package br.org.generation.projetoIntegrador.repository;

import br.org.generation.projetoIntegrador.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryTema extends JpaRepository<Tema, Long>  {
    public List<Tema> findAllByNomeTemaContainingIgnoreCase(String nomeTema);
}
