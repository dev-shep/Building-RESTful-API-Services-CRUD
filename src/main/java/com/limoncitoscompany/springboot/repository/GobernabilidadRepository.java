package com.limoncitoscompany.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.limoncitoscompany.springboot.model.Gobernabilidad;
@Repository
public interface GobernabilidadRepository extends CrudRepository<Gobernabilidad, Long>{

}
