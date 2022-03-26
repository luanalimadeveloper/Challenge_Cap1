package com.luanasproject.Myproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luanasproject.Myproject.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
	

}
