package com.cyzicus.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class PlayerEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String position;
}
