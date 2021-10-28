package com.trip.app.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class PlaceToVisit {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column
    private Integer idAdress;
    @Column
    private String details;
    @Column
    private String comments;
    @Column
    private String image;


}
