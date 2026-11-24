package br.edu.unespar.hotel_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unespar.hotel_api.model.Quarto;
import br.edu.unespar.hotel_api.model.Tipo;
import br.edu.unespar.hotel_api.service.QuartoService;

@RestController
@RequestMapping("/quartos")
public class QuartoController {

	private final QuartoService service;
	
	public QuartoController(QuartoService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Quarto> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Quarto buscar(@PathVariable Long id) {
		return service.buscarPorId(id);
	}
	
	@PostMapping
	public Quarto adicionar(@RequestBody Quarto quarto) {
		return service.adicionar(quarto);
	}
	
	@PutMapping("/{id}")
	public Quarto atualizar(@PathVariable Long id, @RequestBody Quarto quarto) {
		return service.atualizar(id, quarto);
	}
	
	@DeleteMapping("/{id}")
	public void remover(@PathVariable Long id) {
		service.remover(id);
	}
	
	@GetMapping("/tipo")
	public List<Quarto> buscarPorTipo(@RequestParam Tipo tipo){
		return service.buscarPorTipo(tipo);
	}
	
}
