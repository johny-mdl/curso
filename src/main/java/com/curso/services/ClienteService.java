package com.curso.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.domain.Categoria;
import com.curso.domain.Cliente;
import com.curso.repositories.ClienteRepository;
import com.curso.services.exceptions.ObjectNotFoundException;;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente buscar(Integer id) {
		Optional<Cliente> cliente = repo.findById(id);

		return cliente.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nao encontrado com o id " + id + " do tipo " + Categoria.class.getName()));
	}

}
