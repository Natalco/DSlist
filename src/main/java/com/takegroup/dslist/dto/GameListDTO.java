package com.takegroup.dslist.dto;

import com.takegroup.dslist.entities.GameList;

public class GameListDTO {

    private long id;
    private String name;

    private GameListDTO() {}

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
