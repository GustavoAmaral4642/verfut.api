package com.verfutapp.service;

import com.verfutapp.controller.model.PlayerModel;
import com.verfutapp.domain.Player;

import java.util.List;

public interface PlayerService  {

    List<PlayerModel> getAll();

    Player get(Long id, String noSuchElementException);

    void save(Player item);

    void update(Player item);

    void delete(Long id);
}
