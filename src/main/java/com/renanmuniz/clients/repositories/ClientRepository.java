package com.renanmuniz.clients.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renanmuniz.clients.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}