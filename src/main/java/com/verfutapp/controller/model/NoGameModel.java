package com.verfutapp.controller.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NoGameModel {

    private Long id;
    private String team;
}
