package com.verfutapp.service;

import com.verfutapp.controller.model.ChampionshipModel;
import com.verfutapp.domain.Championship;

import java.util.List;

public interface ChampionshipService  {

    List<ChampionshipModel> getAll();

    Championship get(Long id, String noSuchElementException);

    void save(Championship item);

    void update(Championship item);

    void delete(Long id);
}
