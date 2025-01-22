package com.takegroup.dslist.repositories;

import com.takegroup.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Integer> {
}
