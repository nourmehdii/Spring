package com.example.ski.entities;

import com.example.ski.entities.enums.Couleur;
import com.example.ski.entities.enums.TypeAbonnement;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Setter;

import java.time.LocalDate;

@Entity
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE) // enlève le setter de l'attribut numPiste
    private int numAbon;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private float prixAbon;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon;


    public Abonnement() {
    }

    public Abonnement(int numAbon, LocalDate dateDebut, LocalDate dateFin, float prixAbon, TypeAbonnement typeAbon) {
        this.numAbon = numAbon;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.prixAbon = prixAbon;
        this.typeAbon = typeAbon;
    }

    public int getNumAbon() {
        return numAbon;
    }

    public void setNumAbon(int numAbon) {
        this.numAbon = numAbon;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public float getPrixAbon() {
        return prixAbon;
    }

    public void setPrixAbon(float prixAbon) {
        this.prixAbon = prixAbon;
    }

    public TypeAbonnement getTypeAbon() {
        return typeAbon;
    }

    public void setTypeAbon(TypeAbonnement typeAbon) {
        this.typeAbon = typeAbon;
    }
}
