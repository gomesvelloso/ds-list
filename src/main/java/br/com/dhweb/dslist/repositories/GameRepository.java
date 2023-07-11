package br.com.dhweb.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dhweb.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	


}
