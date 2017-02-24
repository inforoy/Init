package com.bank.credit.repository.integrationtest;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import com.bank.credit.common.AbstractRepositoryIntregrationTest;
import com.bank.credit.model.jpa.Persona;
import com.bank.credit.repository.PersonaRepository;

public class PersonaRepositoryTest extends AbstractRepositoryIntregrationTest {

	@Autowired
	private PersonaRepository personaRepository;
	
	/**
	 * Sets up test environment
	 * 
	 */
	@Before
	public void setUp() {
		
	}
	
	/**
	 * Test for {@link PersonaRepository.findAll()}
	 */
	@Test
	public void findAllTest() {
		List<Persona> personas = personaRepository.findAll();
		Assert.notNull(personas);
	}
	
	
}
