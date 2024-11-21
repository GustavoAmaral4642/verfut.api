package com.verfutapp.service;

import com.verfutapp.controller.model.TeamModel;
import com.verfutapp.domain.Team;

import java.util.List;

public interface TeamService {

    List<TeamModel> getAll();

    Team get(Long id, String noSuchElementException);

    void save(Team item);

    void update(Team item);

    void delete(Long id);
}
