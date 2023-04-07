package com.levythalia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.levythalia.entities.Pessoa;
import com.levythalia.repositories.PessoaRepository;
import com.levythalia.services.PessoaService;

@SpringBootTest
public class PessoaServiceTest {

	@MockBean
	PessoaRepository pessoaRepository;
	
	@Autowired
	PessoaService pessoaService;
	
	@Test
	public void findById() {
		Pessoa pessoa = new Pessoa();
		when(pessoaRepository.findById((long) 1)).thenReturn(Optional.of(pessoa));
		
		Pessoa result = pessoaService.findById((long) 1);
		
		assertEquals(pessoa, result);
	}
}
