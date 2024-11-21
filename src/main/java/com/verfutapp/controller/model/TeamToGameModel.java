package com.verfutapp.controller.model;

import com.verfutapp.domain.Championship;
import com.verfutapp.domain.Player;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class TeamToGameModel {

    private Long id;
    private String name;
}
