package br.edu.unespar.hotel_api.model;

import org.springframework.web.bind.annotation.GetMapping;

public class Quarto {

	private Long id;
	private int numero;
	private double valorDiaria;
	private Tipo tipo;
	
	public Quarto(Long id, int numero, double valorDiaria, Tipo tipo) {
		this.id = id;
		this.numero = numero;
		this.valorDiaria = valorDiaria;
		this.tipo = tipo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
}
