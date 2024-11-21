package com.verfutapp.service.impl;

import com.verfutapp.controller.model.ChampionshipModel;
import com.verfutapp.domain.Championship;
import com.verfutapp.domain.Team;
import com.verfutapp.repository.ChampionshipRepository;
import com.verfutapp.repository.TeamRepository;
import com.verfutapp.service.ChampionshipService;
import com.verfutapp.service.TeamService;
import com.verfutapp.service.mapper.ChampionshipDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChampionshipServiceImpl implements ChampionshipService {

    @Autowired
    private ChampionshipRepository championshipRepository;

    @Override
    public void save(Championship championship) {
        try {
            championshipRepository.save(championship);
        } catch (Exception e) {
            throw e;
        }
    }


    @Override
    public List<ChampionshipModel> getAll(){

        List<Championship> championships =  championshipRepository.findAll();

        return ChampionshipDTO.championshipToChampionshipDTO(championships);
    }

    @Override
    public Championship get(Long id, String noSuchElementException) {
        return null;
    }


    @Override
    public void update(Championship item) {

    }

    @Override
    public void delete(Long id) {

    }

}
