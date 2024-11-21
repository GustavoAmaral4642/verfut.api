package com.verfutapp.service.impl;

import com.verfutapp.controller.model.GameModel;
import com.verfutapp.domain.Game;
import com.verfutapp.repository.GameRepository;
import com.verfutapp.service.GameService;
import com.verfutapp.service.mapper.GameDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository gameRepository;

    public void save(Game game) {
        try {
            gameRepository.save(game);
        } catch (Exception e) {
            throw e;
        }
    }

    public List<GameModel> getAll(){

        List<Game> games = gameRepository.findAll();

        return GameDTO.gameToGameDTO(games);
    }

    @Override
    public Game get(Long id, String noSuchElementException) {
        return null;
    }


    @Override
    public void update(Game item) {

    }

    @Override
    public void delete(Long id) {

    }

}
