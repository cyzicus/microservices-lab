package com.cyzicus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TeamEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String location;
    private String mascot;

    public TeamEntity(Long id, String name, String location, String mascot) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.mascot = mascot;
    }

    public TeamEntity() {
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
