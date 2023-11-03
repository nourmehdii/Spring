package com.example.ski.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //tjr IDENTITY
    @Setter(AccessLevel.NONE) // enlève le setter de l'attribut numPiste
    private long numinscription;
    @ManyToOne
    Skieur skieur;
    @ManyToOne
    Cours cour;

    private int numSemaine;
}
