package com.levythalia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.levythalia.entities.Pessoa;
import com.levythalia.repositories.PessoaRepository;

@Service
public class PessoaService {

	private final PessoaRepository pessoaRepository;

	public PessoaService(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}

	public Pessoa findById(Long id) {
		Optional<Pessoa> result = pessoaRepository.findById(id);
		return result.get();
	}

	public List<Pessoa> findAll() {
		return pessoaRepository.findAll();
	}

	public void deleteById(Long id) {
		pessoaRepository.deleteById(id);
	}
}
