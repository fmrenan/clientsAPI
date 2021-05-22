package com.renanmuniz.clients.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renanmuniz.clients.entities.Client;
import com.renanmuniz.clients.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;

	public List<Client> findAll() {
		List<Client> clients = repository.findAll();

		return clients;
	}

}