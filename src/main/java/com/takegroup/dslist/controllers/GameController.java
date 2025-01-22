package com.takegroup.dslist.controllers;
//API

import com.takegroup.dslist.dto.GameDTO;
import com.takegroup.dslist.dto.GameMinDTO;
import com.takegroup.dslist.entities.Game;
import com.takegroup.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;


    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id) {
        GameDTO result = gameService.findById(id);
        return result;
    }
        @GetMapping
    public List<GameMinDTO> findAll() {
    List<GameMinDTO> result = gameService.findAll();
    return result;

    }


}
