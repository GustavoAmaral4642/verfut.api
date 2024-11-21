package com.verfutapp.controller.model;

import com.verfutapp.domain.ItemGame;
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
    private String teamB;
}
