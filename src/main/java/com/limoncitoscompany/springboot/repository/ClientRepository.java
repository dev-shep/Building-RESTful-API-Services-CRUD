package com.limoncitoscompany.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.limoncitoscompany.springboot.model.Client;
@Repository
public interface ClientRepository extends CrudRepository<Client, Long>{

}
