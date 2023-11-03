package com.example.ski.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Setter
@Getter
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE) // enlève le setter de l'attribut numPiste
    private int numSkieur;
    @ManyToMany(mappedBy = "skieurs") //la classe Piste gère la classe Skieur c pk il y a un mapped by dans la relation ManyToMany
    Set<Piste> pistes;

    @OneToMany(mappedBy = "skieur")
    @JsonIgnore
    List<Inscription> inscriptions;

    @OneToOne(cascade =CascadeType.ALL)
    private Abonnement abon;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String ville;


    public int getNumSkieur() {
        return numSkieur;
    }

    public void setNumSkieur(int numSkieur) {
        this.numSkieur = numSkieur;
    }

    public Set<Piste> getPistes() {
        return pistes;
    }

    public void setPistes(Set<Piste> pistes) {
        this.pistes = pistes;
    }

    public List<Inscription> getInscriptions() {
        return inscriptions;
    }

    public void setInscriptions(List<Inscription> inscriptions) {
        this.inscriptions = inscriptions;
    }

    public Abonnement getAbon() {
        return abon;
    }

    public void setAbon(Abonnement abon) {
        this.abon = abon;
    }

    public String getNomS() {
        return nomS;
    }

    public void setNomS(String nomS) {
        this.nomS = nomS;
    }

    public String getPrenomS() {
        return prenomS;
    }

    public void setPrenomS(String prenomS) {
        this.prenomS = prenomS;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Skieur() {
    }

    public Skieur(int numSkieur, Set<Piste> pistes, List<Inscription> inscriptions, Abonnement abon, String nomS, String prenomS, LocalDate dateNaissance, String ville) {
        this.numSkieur = numSkieur;
        this.pistes = pistes;
        this.inscriptions = inscriptions;
        this.abon = abon;
        this.nomS = nomS;
        this.prenomS = prenomS;
        this.dateNaissance = dateNaissance;
        this.ville = ville;
    }
}
