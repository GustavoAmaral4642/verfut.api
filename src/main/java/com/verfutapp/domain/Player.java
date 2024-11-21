package com.verfutapp.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Entity
@Table(name = "`player`")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private Long id;

    @Column(name = "player_name", nullable = false)
    private String name;

    @Column(name = "player_range", nullable = false)
    private String range;

    @Column(name = "player_age", nullable = false)
    private String age;
//
//    @ManyToMany(mappedBy = "players", fetch = FetchType.LAZY)
//    private List<Team> teams;

}
