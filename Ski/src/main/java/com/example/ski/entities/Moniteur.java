package com.example.ski.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Setter;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //tjr IDENTITY
    @Setter(AccessLevel.NONE) // enlève le setter de l'attribut numPiste
    private long numMoniteur;

    @OneToMany
    @JsonIgnore
    private List<Cours> cours;
    private String nomM;
    private String prenomM;
    private LocalDate dateRecru;

    public Moniteur() {
    }

    public Moniteur(long numMoniteur, List<Cours> cours, String nomM, String prenomM, LocalDate dateRecru) {
        this.numMoniteur = numMoniteur;
        this.cours = cours;
        this.nomM = nomM;
        this.prenomM = prenomM;
        this.dateRecru = dateRecru;
    }

    public long getNumMoniteur() {
        return numMoniteur;
    }

    public void setNumMoniteur(long numMoniteur) {
        this.numMoniteur = numMoniteur;
    }

    public List<Cours> getCours() {
        return cours;
    }

    public void setCours(List<Cours> cours) {
        this.cours = cours;
    }

    public String getNomM() {
        return nomM;
    }

    public void setNomM(String nomM) {
        this.nomM = nomM;
    }

    public String getPrenomM() {
        return prenomM;
    }

    public void setPrenomM(String prenomM) {
        this.prenomM = prenomM;
    }

    public LocalDate getDateRecru() {
        return dateRecru;
    }

    public void setDateRecru(LocalDate dateRecru) {
        this.dateRecru = dateRecru;
    }
}
