package com.verfutapp.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "`championship`")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Championship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "champ_id")
    private Long id;

    @Column(name = "champ_name", nullable = false)
    private String name;

    @Column(name = "category_name", nullable = false)
    private String categoryName;

    @Column(name = "inital_age_category", nullable = false)
    private Long initalAgeCategory;

    @Column(name = "final_age_category")
    private Long finalAgeCategory;

    @Column(name = "initial_date", nullable = false, updatable = false)
    private LocalDateTime initialDate;

    @Column(name = "final_date")
    private LocalDateTime finalDate;

    @OneToMany(mappedBy = "championship", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Team> teams = new ArrayList<>();

    @Column(nullable = false, updatable = false)
    private LocalDateTime createAt;

    @PrePersist
    protected void onCreate(){
        createAt = LocalDateTime.now();
    }
}
