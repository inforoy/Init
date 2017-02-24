package com.bank.credit.service.impl;

import com.bank.credit.model.jpa.Persona;
import com.bank.credit.repository.PersonaRepository;
import com.bank.credit.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service("personaService")
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> findAll(){
        List<Persona> list = personaRepository.findAll();
        return list;
    }

}
