package com.example.ski.services;

import com.example.ski.entities.Inscription;
import com.example.ski.entities.Skieur;

import java.util.List;

public interface ISkieurService {
    Skieur add(Skieur s);
    Skieur update(Skieur s);
    List<Skieur> getAll();
    Skieur getId(long id);
    boolean deleteById (long id);
    Skieur addRegistrationAndAssignToAbonnement(long idAbon, Skieur skieur);
    Skieur assignSkierToPiste(long numSkieur, long numPiste);
}
