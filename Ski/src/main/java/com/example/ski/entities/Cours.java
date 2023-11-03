package com.example.ski.entities;


import com.example.ski.entities.enums.Support;
import com.example.ski.entities.enums.TypeCours;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Setter;

import java.util.List;

@Entity
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //tjr IDENTITY
    @Setter(AccessLevel.NONE) // enlève le setter de l'attribut numPiste
    private long numCours;
    @OneToMany(mappedBy = "cour")
    //la calsse cours gere la classe inscription par ll'attribut cours
    @JsonIgnore
    List<Inscription> inscriptions;
    private int niveau;
    private float prix;
    private int creneau;
    @Enumerated(EnumType.STRING)
    private Support support;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;

    public long getNumCours() {
        return numCours;
    }

    public void setNumCours(long numCours) {
        this.numCours = numCours;
    }

    public List<Inscription> getInscriptions() {
        return inscriptions;
    }

    public void setInscriptions(List<Inscription> inscriptions) {
        this.inscriptions = inscriptions;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getCreneau() {
        return creneau;
    }

    public void setCreneau(int creneau) {
        this.creneau = creneau;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    public TypeCours getTypeCours() {
        return typeCours;
    }

    public void setTypeCours(TypeCours typeCours) {
        this.typeCours = typeCours;
    }

    public Cours() {
    }

    public Cours(long numCours, List<Inscription> inscriptions, int niveau, float prix, int creneau, Support support, TypeCours typeCours) {
        this.numCours = numCours;
        this.inscriptions = inscriptions;
        this.niveau = niveau;
        this.prix = prix;
        this.creneau = creneau;
        this.support = support;
        this.typeCours = typeCours;
    }


}
