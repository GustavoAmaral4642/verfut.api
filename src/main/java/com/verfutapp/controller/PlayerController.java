package com.verfutapp.controller;

import com.verfutapp.controller.model.PlayerModel;
import com.verfutapp.domain.Player;
import com.verfutapp.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;


    @GetMapping
    public ResponseEntity<List<PlayerModel>> getAll(){
        List<PlayerModel> players = playerService.getAll();
        return new ResponseEntity<>(players, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody Player player){
        playerService.save(player);
        return ResponseEntity.ok().build();
    }
}
