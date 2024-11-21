package com.verfutapp.service.mapper;

import com.verfutapp.controller.model.GameModel;
import com.verfutapp.controller.model.ItemGameModel;
import com.verfutapp.domain.Game;

import java.util.ArrayList;
import java.util.List;

public class GameDTO {

    public static List<GameModel> gameToGameDTO(List<Game> games) {

        List<GameModel> gameModels = new ArrayList<>();
        List<ItemGameModel> itemGameModels = new ArrayList<>();

        games.forEach(game -> {

            game.getItensGames().forEach(gameItem -> {
                ItemGameModel itemGameModel = ItemGameModel.builder()
                        .id(gameItem.getId())
                        .hourGame(gameItem.getHourGame())
                        .teamA(gameItem.getTeamA().getName())
                        .teamB(gameItem.getTeamB().getName())
                        .build();
                itemGameModels.add(itemGameModel);
            });

            GameModel gameModel = GameModel.builder()
                    .id(game.getId())
                    .dateGame(game.getDateGame())
                    .numberRound(game.getNumberRound())
                    .itensGames(itemGameModels)
                    .build();
            gameModels.add(gameModel);
        });

        return gameModels;
    }
}
