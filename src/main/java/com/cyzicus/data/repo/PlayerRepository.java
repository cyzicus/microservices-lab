package com.cyzicus.data.repo;

import com.cyzicus.data.entity.PlayerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@Repository
@RestResource(path = "players", rel = "player")
public interface PlayerRepository extends CrudRepository<PlayerEntity, Long>{
}
