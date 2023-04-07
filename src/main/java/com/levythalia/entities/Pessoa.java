package com.levythalia.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "tb_pessoa")
public class Pessoa {
	
	@Id
	private Long id;
	private String nome;
	private int idade;
	private Double salario;
	
	public Pessoa() {}
	
	public Pessoa(String nome, int idade, Double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
}
