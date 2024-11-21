package com.verfutapp.service.mapper;

import com.verfutapp.controller.model.TeamModel;
import com.verfutapp.domain.Team;

import java.util.ArrayList;
import java.util.List;

public class TeamDTO {

    public static List<TeamModel> teamToTeamDTO(List<Team> teams) {

        List<TeamModel> teamModels = new ArrayList<>();

        teams.forEach(team -> {
            TeamModel teamModel = TeamModel.builder()
                    .id(team.getId())
                    .name(team.getName())
                    .championshipName(team.getChampionship().getName())
                    .championshipId(team.getChampionship().getId())
                    .players(team.getPlayers())
                    .build();
            teamModels.add(teamModel);
        });

        return teamModels;
    }
}
