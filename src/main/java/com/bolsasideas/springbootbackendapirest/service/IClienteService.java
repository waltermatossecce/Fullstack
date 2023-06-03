package com.bolsasideas.springbootbackendapirest.service;

import java.util.List;

import com.bolsasideas.springbootbackendapirest.models.Cliente;

public interface IClienteService {

	public List<Cliente>findAll();
	public Cliente save(Cliente cliente);
	public Cliente findById(long id);
	public void delete(Long id);
	
}
