package br.edu.unespar.hotel_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unespar.hotel_api.model.Quarto;
import br.edu.unespar.hotel_api.model.Tipo;

@RestController
public class TesteController {

	@GetMapping("/teste")
	public String teste() {		
		return "SistemaHotel funcionando";	
	}
	
	@GetMapping
	public Quarto obterQuarto() {
		return new Quarto(1L, 101, 180.0, Tipo.SIMPLES);
	}
}
