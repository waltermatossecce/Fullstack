package com.bolsasideas.springbootbackendapirest.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsasideas.springbootbackendapirest.models.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long>{

}
