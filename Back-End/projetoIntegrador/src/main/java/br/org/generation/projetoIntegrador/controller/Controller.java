package br.org.generation.projetoIntegrador.controller;

import br.org.generation.projetoIntegrador.model.Tema;
import br.org.generation.projetoIntegrador.repository.RepositoryTema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/temas")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Controller {

    @Autowired
    private RepositoryTema repository;

    @GetMapping
    public ResponseEntity<List<Tema>> GetAll(){
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tema> GetById(@PathVariable long id){
        return repository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/tema/{nomeTema}")
    public ResponseEntity<List<Tema>> GetByNome(@PathVariable String nomeTema){
        return ResponseEntity.ok(repository.findAllByNomeTemaContainingIgnoreCase(nomeTema));
    }

    @PostMapping
    public ResponseEntity<Tema> post (@RequestBody Tema tema){
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(tema));
    }

    @PutMapping
    public ResponseEntity<Tema> put (@RequestBody Tema tema){
        return ResponseEntity.status(HttpStatus.OK).body(repository.save(tema));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        repository.deleteById(id);
    }

}
