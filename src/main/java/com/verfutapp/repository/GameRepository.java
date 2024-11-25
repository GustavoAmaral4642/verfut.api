package com.verfutapp.repository;

import com.verfutapp.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

    @Query("from Game g order by g.id DESC")
    List<Game> findAll();
}
