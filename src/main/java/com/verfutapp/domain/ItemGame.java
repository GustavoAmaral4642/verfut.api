package com.verfutapp.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "`item_game`")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemGame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_game_id")
    private Long id;

    @Column(name = "hour_game", nullable = false)
    private String hourGame;

    @ManyToOne
    @JoinColumn(name = "team_a_id")
    private Team teamA;

    @Column(name = "total_goals_team_a")
    private String totalGoalsTeamA;

    @Column(name = "points_received_team_a")
    private String pointsReceivedTeamA;

    @ManyToOne
    @JoinColumn(name = "team_b_id")
    private Team teamB;

    @Column(name = "total_goals_team_b")
    private String totalGoalsTeamB;

    @Column(name = "points_received_team_b")
    private String pointsReceivedTeamB;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

}
