package com.verfutapp.repository;

import com.verfutapp.domain.ItemGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemGameRepository extends JpaRepository<ItemGame, Long> {

}
