package com.verfutapp.service.mapper;

import com.verfutapp.controller.model.GameModel;
import com.verfutapp.controller.model.ItemGameModel;
import com.verfutapp.controller.model.NoGameModel;
import com.verfutapp.domain.Game;
import com.verfutapp.domain.NoGame;

import java.util.ArrayList;
import java.util.List;

public class GameDTO {

    public static List<GameModel> gameToGameDTO(List<Game> games) {

        List<GameModel> gameModels = new ArrayList<>();

        games.forEach(game -> {
            List<ItemGameModel> itemGameModels = new ArrayList<>();
            final String noGames;
            game.getItensGames().forEach(gameItem -> {
                ItemGameModel itemGameModel = ItemGameModel.builder()
                        .id(gameItem.getId())
                        .hourGame(gameItem.getHourGame())
                        .teamA(gameItem.getTeamA().getName())
                        .totalGoalsTeamA(gameItem.getTotalGoalsTeamA())
                        .pointsReceivedTeamA(gameItem.getPointsReceivedTeamA())
                        .teamB(gameItem.getTeamB().getName())
                        .totalGoalsTeamB(gameItem.getTotalGoalsTeamB())
                        .pointsReceivedTeamB(gameItem.getPointsReceivedTeamB())
                        .build();
                itemGameModels.add(itemGameModel);
            });

            String noGame = "";
            for(NoGame ng : game.getNoGames()){
                if(noGame.isBlank()){
                    noGame = ng.getTeam().getName();
                } else {
                    noGame = noGame.concat(" / " + ng.getTeam().getName());
                }

            }

            GameModel gameModel = GameModel.builder()
                    .id(game.getId())
                    .dateGame(game.getDateGame())
                    .numberRound(game.getNumberRound())
                    .itensGames(itemGameModels)
                    .noGames(noGame)
                    .build();
            gameModels.add(gameModel);
        });

        return gameModels;
    }
}
