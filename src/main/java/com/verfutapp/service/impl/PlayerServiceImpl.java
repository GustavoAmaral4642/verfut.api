package com.verfutapp.service.impl;

import com.verfutapp.controller.model.PlayerModel;
import com.verfutapp.controller.model.TeamModel;
import com.verfutapp.domain.Player;
import com.verfutapp.domain.Team;
import com.verfutapp.repository.PlayerRepository;
import com.verfutapp.service.PlayerService;
import com.verfutapp.service.mapper.PlayerDTO;
import com.verfutapp.service.mapper.TeamDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public void save(Player player) {
        try {
            playerRepository.save(player);
        } catch (Exception e) {
            throw e;
        }
    }

    public List<PlayerModel> getAll(){

        List<Player> players = playerRepository.findAll();

        return PlayerDTO.playerToPlayerDTO(players);
    }

    @Override
    public void update(Player item) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Player get(Long id, String noSuchElementException) {
        return null;
    }
}
