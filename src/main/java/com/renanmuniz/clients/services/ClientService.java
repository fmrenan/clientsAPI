package com.renanmuniz.clients.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.renanmuniz.clients.dto.ClientDTO;
import com.renanmuniz.clients.entities.Client;
import com.renanmuniz.clients.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public Page<ClientDTO> findAllPaged(PageRequest pageRequest){
		Page<Client> list = repository.findAll(pageRequest);

		return list.map(cli -> new ClientDTO(cli));
	}
	
	
}