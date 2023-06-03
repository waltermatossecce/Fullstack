package com.bolsasideas.springbootbackendapirest.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsasideas.springbootbackendapirest.dao.ClienteRepository;
import com.bolsasideas.springbootbackendapirest.models.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteRepository.findAll();
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteRepository.save(cliente);
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findById(long id) {
		// TODO Auto-generated method stub
		return clienteRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienteRepository.deleteById(id);
	}

	
	
}
