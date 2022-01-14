package com.marceloprojets.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marceloprojets.dsmovie.entities.Score;
import com.marceloprojets.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
	//repositorio camada que vai acesar o banco de dados, buscar, alterar, deletar, alterar

}
