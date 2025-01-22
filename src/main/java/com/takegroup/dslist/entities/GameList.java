package com.takegroup.dslist.entities;

import jakarta.persistence.*;

@Entity
@Table(name= "tb_game_list")
public class GameList {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    public GameList() {}

    public GameList(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        GameList gameList = (GameList) o;
        return getId() == gameList.getId();
    }

    @Override
    public int hashCode() {
        return Long.hashCode(getId());
    }
}
