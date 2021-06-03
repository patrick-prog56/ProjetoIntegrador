package br.org.generation.projetoIntegrador.repository;

import br.org.generation.projetoIntegrador.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryTema extends JpaRepository<Tema, Long>  {
    public List<Tema> findAllByNomeTemaContainingIgnoreCase(String nomeTema);
}
