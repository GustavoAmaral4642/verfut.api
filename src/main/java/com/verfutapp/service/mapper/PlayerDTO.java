package com.verfutapp.service.mapper;


import com.verfutapp.controller.model.PlayerModel;
import com.verfutapp.domain.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerDTO {

    public static List<PlayerModel> playerToPlayerDTO(List<Player> players) {

        List<PlayerModel> playersModels = new ArrayList<>();

        players.forEach(player -> {
            PlayerModel playerModel = PlayerModel.builder()
                    .id(player.getId())
                    .name(player.getName())
                    .age(player.getAge())
                    .range(player.getRange())
                    .build();
            playersModels.add(playerModel);
        });

        return playersModels;
    }
}
