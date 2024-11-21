package com.verfutapp.service;

import com.verfutapp.controller.model.GameModel;
import com.verfutapp.domain.Game;

import java.util.List;

public interface GameService {

    List<GameModel> getAll();

    Game get(Long id, String noSuchElementException);

    void save(Game item);

    void update(Game item);

    void delete(Long id);
}
