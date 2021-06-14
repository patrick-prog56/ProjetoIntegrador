package br.org.generation.projetoIntegrador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
public class ProjetoIntegradorApplication{

	@GetMapping
	public ModelAndView swaggerUi() {
		return new ModelAndView("redirect:/swagger-ui.html ");
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjetoIntegradorApplication.class, args);
	}

}
