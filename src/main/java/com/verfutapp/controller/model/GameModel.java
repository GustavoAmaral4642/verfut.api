package com.verfutapp.controller.model;

import com.verfutapp.domain.Championship;
import com.verfutapp.domain.ItemGame;
import com.verfutapp.domain.Player;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class GameModel {

    private Long id;
    private String dateGame;
    private String numberRound;
    private List<ItemGameModel> itensGames = new ArrayList<>();
}
