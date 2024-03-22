package com.limoncitoscompany.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.limoncitoscompany.springboot.model.Client;
import com.limoncitoscompany.springboot.model.Gobernabilidad;
import com.limoncitoscompany.springboot.service.GobernabilidadService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class ClientWebController {
   @Autowired
   ClientController clientController;
   @Autowired
    GobernabilidadController gobernabilidadController;

   @GetMapping("/")
   public String getAllClients(Model model) {
       
       List<Client> clientsList = clientController.getAllclients();

       model.addAttribute("clients", clientsList);

       return "list_clients";
   }

   @GetMapping("/new_client")
   public String addClient(Model model) {

       Client client = new Client();
	   Gobernabilidad gobernabilidad = new Gobernabilidad();

	   model.addAttribute("client", client);
	   List<Gobernabilidad> gobernabilidades = gobernabilidadController.getAllGobernabilidad();

	   model.addAttribute("gobernabilidades", gobernabilidades);

       return "new_client";
   }

	@PostMapping(value = "/save_new")
	public String saveNewClient(@ModelAttribute("client") Client client) {
		
		clientController.addClient(client);

		return "redirect:/";
	}


	@GetMapping("/update_client/{pId}")
	public String editClient(@PathVariable(name = "pId") Long id, Model model) {

		model.addAttribute("client", clientController.getClient(id));
		List<Gobernabilidad> gobernabilidades = gobernabilidadController.getAllGobernabilidad();

		model.addAttribute("gobernabilidades", gobernabilidades);
		return "update_client";
	}


	@PostMapping(value = "/save_update")
	public String saveUpdateClient(@ModelAttribute("client") Client client) {
		
		clientController.updateClient(client, client.getId());

		return "redirect:/";
	}

    
	@GetMapping("/delete_client/{pId}")
	public String deleteClient(@PathVariable("pId") Long id, Model model)  {

		model.addAttribute("client", clientController.getClient(id));

		return "delete_client";
	}
	
	
	@PostMapping("/save_delete")
	public String saveDeleteClient(@ModelAttribute("client") Client client)  {

		clientController.deleteClient(client.getId());

		return "redirect:/";
	}
}

