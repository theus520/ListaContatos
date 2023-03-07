package com.estudos;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContatosControle {

	private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();

	static {

		LISTA_CONTATOS.add(new Contato("1", "Matheus", "1234765432"));
		LISTA_CONTATOS.add(new Contato("2", "Marcos", "1234765432"));
		LISTA_CONTATOS.add(new Contato("3", "Junior", "1234765432"));
		LISTA_CONTATOS.add(new Contato("4", "Marcelo", "1234765432"));

	}

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/contatos")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("listar");
		modelAndView.addObject("contatos", LISTA_CONTATOS);
		return modelAndView;
	}
}
