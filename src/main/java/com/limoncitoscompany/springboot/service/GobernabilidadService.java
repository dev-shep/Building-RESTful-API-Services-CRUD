package com.limoncitoscompany.springboot.service;

import com.limoncitoscompany.springboot.model.Client;
import com.limoncitoscompany.springboot.model.Gobernabilidad;
import com.limoncitoscompany.springboot.repository.ClientRepository;
import com.limoncitoscompany.springboot.repository.GobernabilidadRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GobernabilidadService {
	
	@Autowired
	private GobernabilidadRepository gobernabilidadRepository;
	
	public List<Gobernabilidad> getAllGobernabilidades() {

		List<Gobernabilidad> gobernabilidad= new ArrayList<>();
		
		 gobernabilidadRepository.findAll().forEach(gobernabilidad::add);
		
		return gobernabilidad;
	}
}