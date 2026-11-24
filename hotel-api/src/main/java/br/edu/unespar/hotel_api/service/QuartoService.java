package br.edu.unespar.hotel_api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.unespar.hotel_api.model.*;

@Service
public class QuartoService {

	private final List<Quarto> quartos = new ArrayList<>();
	private long proxId = 1;
	
	public QuartoService() {
		
		quartos.add(new Quarto(
				proxId++,
				101,
				180.0,
				Tipo.SIMPLES));
		
		quartos.add(new Quarto(
				proxId++,
				102,
				250.0,
				Tipo.DUPLO));
		
	}
	
	public List<Quarto> listar(){
		return quartos;
	}
	
	public Quarto buscarPorId(Long id) {
		return quartos.stream().filter(
				q-> q.getId().equals(id))
				.findFirst()
				.orElse(null);
	}
	
	public Quarto adicionar(Quarto quarto) {
		quarto.setId(proxId++);
		
		quartos.add(quarto);
		
		return quarto;
	}
	
	public Quarto atualizar(Long id, Quarto novosDados) {
		Quarto quarto = buscarPorId(id);
		
		if(quarto == null) {
			return null;
		}
		
		quarto.setNumero(novosDados.getNumero());
		quarto.setValorDiaria(novosDados.getValorDiaria());
		quarto.setTipo(novosDados.getTipo());
		
		return quarto;
	}
	
	public boolean remover(Long id) {
		return quartos.removeIf(
				q-> q.getId()
				.equals(id));
	}
	
	public List<Quarto> buscarPorTipo(Tipo tipo) {
		return quartos.stream()
				.filter(q-> q.getTipo() == tipo
				).toList();
	}
	
}
