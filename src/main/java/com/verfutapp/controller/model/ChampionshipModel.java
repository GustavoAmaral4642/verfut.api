package com.verfutapp.controller.model;

import com.verfutapp.domain.Team;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class ChampionshipModel {

    private Long id;
    private String name;
    private String categoryName;
    private Long initalAgeCategory;
    private Long finalAgeCategory;
    private LocalDateTime initialDate;
    private LocalDateTime finalDate;
    private List<Team> teams = new ArrayList<>();
}
