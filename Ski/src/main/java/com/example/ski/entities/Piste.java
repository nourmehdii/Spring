package com.example.ski.entities;


import com.example.ski.entities.enums.Couleur;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) //rend tous les attributs private
public class Piste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //tjr IDENTITY
    @Setter(AccessLevel.NONE) // enlève le setter de l'attribut numPiste

    private Long numPiste;

    @ManyToMany
    Set<Skieur> skieurs;

    private String nomPiste;
    private int longueur;
    private int pente;
    @Enumerated(EnumType.STRING)
    private Couleur couleur; //enumeration de la couleur / EnumTyp.String permet de préciser la valeur de lma couleur lors l'instanciation


}
