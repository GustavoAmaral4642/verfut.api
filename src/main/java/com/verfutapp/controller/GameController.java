package com.verfutapp.controller;

import com.verfutapp.controller.model.GameModel;
import com.verfutapp.domain.Game;
import com.verfutapp.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameModel>> getAll(){
        List<GameModel> games = gameService.getAll();
        return new ResponseEntity<>(games, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody Game game){
        gameService.save(game);
        return ResponseEntity.ok().build();
    }
}
