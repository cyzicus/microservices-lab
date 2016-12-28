package com.cyzicus.model;

public class Team {

    private final Long id;
    private final String name;
    private final String location;
    private final String mascot;

    public Team(Long id, String name, String location, String mascot) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.mascot = mascot;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getMascot() {
        return mascot;
    }
}
