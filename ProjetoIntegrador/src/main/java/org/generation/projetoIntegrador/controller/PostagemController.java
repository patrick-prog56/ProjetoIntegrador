package org.generation.projetoIntegrador.controller;

import java.util.List;

import org.generation.projetoIntegrador.model.Postagem;
import org.generation.projetoIntegrador.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostagemController {

	@Autowired
	private PostagemRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Postagem> GetById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/titulo/{conteudoPostagem}")
	public ResponseEntity<List<Postagem>> GetByConteudoPostagem(@PathVariable String conteudoPostagem){
		return ResponseEntity.ok(repository.findAllByConteudoPostagemContainingIgnoreCase(conteudoPostagem));
	}
	
	@PostMapping
	public ResponseEntity<Postagem> post (@RequestBody Postagem postagem){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
	}
	
	@PutMapping
	public ResponseEntity<Postagem> putPostagem(@RequestBody Postagem postagem){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
	}
	
	@DeleteMapping("/{id}")
	public void deletaPostagem(@PathVariable long id) {//por causa do void que não precisa de return na próxima linha e tem que ser long, pq na model id foi definido como long
		repository.deleteById(id);
	}
}
