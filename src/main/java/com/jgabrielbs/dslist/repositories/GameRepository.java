package com.jgabrielbs.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jgabrielbs.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
