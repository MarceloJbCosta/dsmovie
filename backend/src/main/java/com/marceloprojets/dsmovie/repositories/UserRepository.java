package com.marceloprojets.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marceloprojets.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	//repositorio camada que vai acesar o banco de dados, buscar, alterar, deletar, alterar
	
	User findByEmail(String email);

}
