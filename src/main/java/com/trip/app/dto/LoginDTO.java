package com.trip.app.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@ToString
public class LoginDTO {

    private String genre;
    private String nom;
    private String prenom;
    private String pseudo;
    private String password;
    private String password2;
    private String email;
    private String dateNaissance;
}
