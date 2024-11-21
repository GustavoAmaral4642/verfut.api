package com.verfutapp.service.mapper;

import com.verfutapp.controller.model.ChampionshipModel;
import com.verfutapp.domain.Championship;

import java.util.ArrayList;
import java.util.List;

public class ChampionshipDTO {

    public static List<ChampionshipModel> championshipToChampionshipDTO(List<Championship> championships) {

        List<ChampionshipModel> championshipModels = new ArrayList<>();

        championships.forEach(championship -> {
            ChampionshipModel championshipModel = ChampionshipModel.builder()
                    .id(championship.getId())
                    .name(championship.getName())
                    .teams(championship.getTeams())
                    .categoryName(championship.getCategoryName())
                    .initalAgeCategory(championship.getInitalAgeCategory())
                    .finalAgeCategory(championship.getFinalAgeCategory())
                    .initialDate(championship.getInitialDate())
                    .finalDate(championship.getFinalDate())
                    .build();
            championshipModels.add(championshipModel);
        });

        return championshipModels;
    }
}
