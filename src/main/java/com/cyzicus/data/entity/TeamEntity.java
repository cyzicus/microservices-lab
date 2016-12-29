package com.cyzicus.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Data
@Builder
public class TeamEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String location;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="teamId")
    private Set<PlayerEntity> players;
}
