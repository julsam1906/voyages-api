package com.trip.app.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class Adress {

    @GeneratedValue
    @Id
    private Integer id;
    @Column(name = "NUMBER")
    private Integer number;
    @Column(name = "STREET")
    private String street;
    @Column(name = "CODE_POSTAL")
    private String postalCode;
    @Column(name = "DISTRICT")
    private String district;
    @Column(name = "CITY")
    private String city;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "DETAILS")
    private String details;

}
