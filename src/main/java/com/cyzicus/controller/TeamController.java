package com.cyzicus.controller;

import com.cyzicus.data.repo.TeamRepository;
import com.cyzicus.data.entity.TeamEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    private final TeamRepository teamRepository;

    @Autowired
    public TeamController(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @GetMapping(value = "/teams")
    public Iterable<TeamEntity> getTeams() {

        return teamRepository.findAll();
    }

    @GetMapping(value = "/teams/{id}")
    public TeamEntity getTeam(@PathVariable(value = "id") Long id) {
        return teamRepository.findOne(id);
    }
}
