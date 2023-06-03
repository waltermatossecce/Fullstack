package com.bolsasideas.springbootbackendapirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.bolsasideas.springbootbackendapirest.models.Cliente;
import com.bolsasideas.springbootbackendapirest.service.IClienteService;

@RestController
@RequestMapping("api") 
@CrossOrigin(origins = {"http://localhost:4200"})
public class ClienteController {

	@Autowired
	private IClienteService clienteService;

	@GetMapping("/clientes")
	public List<Cliente>index(){
		return clienteService.findAll();
	}
	@GetMapping("/clientes/{id}")
	public Cliente show(@PathVariable Long id) {
		return clienteService.findById(id);
	}
	@PostMapping("/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente save(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}
	@PutMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente update(@RequestBody Cliente cliente,@PathVariable Long id) {
		Cliente ClienteActual = clienteService.findById(id);
		ClienteActual.setNombre(cliente.getNombre());
		ClienteActual.setApellido(cliente.getApellido());
		ClienteActual.setEmail(cliente.getEmail());
		
		return clienteService.save(ClienteActual); 
	}
	@DeleteMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		clienteService.delete(id);
	}
}

