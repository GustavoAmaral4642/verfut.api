package com.verfutapp.controller;

import com.verfutapp.controller.model.ChampionshipModel;
import com.verfutapp.domain.Championship;
import com.verfutapp.service.ChampionshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/championships")
public class ChampionshipController{

    @Autowired
    private ChampionshipService championshipService;

    @GetMapping
    public ResponseEntity<List<ChampionshipModel>> getAll(){
        List<ChampionshipModel> championships = championshipService.getAll();
        return new ResponseEntity<>(championships, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody Championship championship){
        championshipService.save(championship);
        return ResponseEntity.ok().build();
    }

}
