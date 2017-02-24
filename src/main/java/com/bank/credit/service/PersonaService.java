package com.bank.credit.service;

import com.bank.credit.model.jpa.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> findAll();

}
