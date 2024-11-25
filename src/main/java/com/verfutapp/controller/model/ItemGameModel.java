package com.verfutapp.controller.model;

import com.verfutapp.domain.ItemGame;
import com.verfutapp.domain.Team;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class ItemGameModel {

    private Long id;
    private String hourGame;
    private String teamA;
    private String totalGoalsTeamA;
    private String pointsReceivedTeamA;
    private String teamB;
    private String totalGoalsTeamB;
    private String pointsReceivedTeamB;
}
