package com.limoncitoscompany.springboot;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.limoncitoscompany.springboot.model.Client;
import com.limoncitoscompany.springboot.model.Gobernabilidad;
import com.limoncitoscompany.springboot.repository.ClientRepository;
import com.limoncitoscompany.springboot.repository.GobernabilidadRepository;

@SpringBootApplication
public class SpringbootApplication  implements CommandLineRunner {
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private GobernabilidadRepository  gobernabilidadRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	public void run(String... args) throws Exception{
		Date date = new Date();
		clientRepository.save(new Client("Television", "Electrinics","terfrf", date,"2","1","afdadafafaff"));
	
		gobernabilidadRepository.save(new Gobernabilidad("Ingobernable"));
		gobernabilidadRepository.save(new Gobernabilidad("Gobernable"));
		gobernabilidadRepository.save(new Gobernabilidad("Peligroso"));

 
	}


}

