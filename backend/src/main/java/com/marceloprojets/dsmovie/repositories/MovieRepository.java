package com.marceloprojets.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marceloprojets.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	//repositorio camada que vai acesar o banco de dados, buscar, alterar, deletar, alterar

}
