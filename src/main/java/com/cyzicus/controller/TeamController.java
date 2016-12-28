package com.cyzicus.controller;

import com.cyzicus.data.TeamRepository;
import com.cyzicus.model.TeamEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

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
}
