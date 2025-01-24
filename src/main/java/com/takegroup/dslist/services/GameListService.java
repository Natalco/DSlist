package com.takegroup.dslist.services;


import com.takegroup.dslist.dto.GameDTO;
import com.takegroup.dslist.dto.GameListDTO;
import com.takegroup.dslist.dto.GameMinDTO;
import com.takegroup.dslist.entities.Game;
import com.takegroup.dslist.entities.GameList;
import com.takegroup.dslist.projections.GameMinProjection;
import com.takegroup.dslist.repositories.GameListRepository;
import com.takegroup.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Autowired
    private GameRepository gameRepository;



    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();

    }

    @Transactional
    public void move (Long ListId, int sourceIndex,int destinationIndex) {

        List<GameMinProjection> list = gameRepository.searchByList(ListId);

        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = min; i <= max; i++) {
            gameListRepository.updateBelongingPosition(ListId, list.get(i).getId(), i );


        }

    }

}
