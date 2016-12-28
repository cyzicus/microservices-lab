package com.cyzicus.controller;

import com.cyzicus.model.Team;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TeamController {

    @GetMapping(value = "/teams")
    public List<Team> getTeams() {

        List<Team> teams = Arrays.asList(
                new Team(0l, "Globetrotters", "Harlem", "Globetrotters"),
                new Team(1l, "Generals", "Washington", "Generals")

        );
        return teams;
    }
}
