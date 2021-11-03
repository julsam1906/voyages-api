package com.trip.app.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "destination")
@Getter@Setter
@ToString
public class DestinationEntity {

    @GeneratedValue
    @Id
    private Integer id;
    @Column
    private String continent;
    @Column
    private String country;
}
