package com.trip.app.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class Login {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "GENRE")
    private String genre;
    @Column(name = "NOM")
    private String nom;
    @Column(name = "PRENOM")
    private String prenom;
    @Column(name = "PSEUDO")
    private String pseudo;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "DATE_NAISSANCE")
    private String dateNaissance;
}
