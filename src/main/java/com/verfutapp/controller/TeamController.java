package com.verfutapp.controller;

import com.verfutapp.controller.model.TeamModel;
import com.verfutapp.domain.Team;
import com.verfutapp.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/teams")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping
    public ResponseEntity<List<TeamModel>> getAll(){
        List<TeamModel> teams = teamService.getAll();
        return new ResponseEntity<>(teams, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody Team team){
        teamService.save(team);
        return ResponseEntity.ok().build();
    }
}
