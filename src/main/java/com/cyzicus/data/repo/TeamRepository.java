package com.cyzicus.data.repo;

import com.cyzicus.data.entity.TeamEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@Repository
@RestResource(path = "teams", rel = "team")
public interface TeamRepository extends CrudRepository<TeamEntity, Long> {
}
