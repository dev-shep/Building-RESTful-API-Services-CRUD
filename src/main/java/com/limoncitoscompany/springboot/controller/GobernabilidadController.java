package com.limoncitoscompany.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.limoncitoscompany.springboot.model.Gobernabilidad;

import com.limoncitoscompany.springboot.service.GobernabilidadService;

@RestController
public class GobernabilidadController {

	@Autowired
	private GobernabilidadService gobernabilidadService;

	@GetMapping("/gobernabilidad")
	public List<Gobernabilidad> getAllGobernabilidad() {

		return gobernabilidadService.getAllGobernabilidades();
	}
	}

