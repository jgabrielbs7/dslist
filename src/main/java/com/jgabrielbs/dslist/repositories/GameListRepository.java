package com.jgabrielbs.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jgabrielbs.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}
