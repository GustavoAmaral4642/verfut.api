package com.verfutapp.service.impl;

import com.verfutapp.controller.model.TeamModel;
import com.verfutapp.domain.Team;
import com.verfutapp.repository.TeamRepository;
import com.verfutapp.service.TeamService;
import com.verfutapp.service.mapper.TeamDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public void save(Team team) {
        try {
            teamRepository.save(team);
        } catch (Exception e) {
            throw e;
        }
    }

    public List<TeamModel> getAll(){

        List<Team> teams = teamRepository.findAll();

        return TeamDTO.teamToTeamDTO(teams);
    }

    @Override
    public Team get(Long id, String noSuchElementException) {
        return null;
    }


    @Override
    public void update(Team item) {

    }

    @Override
    public void delete(Long id) {

    }

}
