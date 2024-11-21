package com.verfutapp.controller.model;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PlayerModel {

    private Long id;

    private String name;

    private String range;

    private String age;
}
