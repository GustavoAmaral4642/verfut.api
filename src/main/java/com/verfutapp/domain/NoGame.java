package com.verfutapp.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "`no_game`")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NoGame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no_game_id")
    private Long id;

//    @Column(name = "hour_game", nullable = false)
//    private String hourgame;

//    @Column(name = "hour_game", nullable = false)
//    private Team teamA;
//
//    @Column(name = "hour_game", nullable = false)
//    private Team TeamB;
}
