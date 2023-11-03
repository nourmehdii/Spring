package com.example.ski.services;

import com.example.ski.entities.Inscription;
import com.example.ski.entities.Moniteur;

import java.util.List;

public interface IMoniteurService {
    Moniteur add(Moniteur m);
    Moniteur update(Moniteur m);
    List<Moniteur> getAll();
    Moniteur getId(long id);
    boolean deleteById (long id);

    Moniteur addRegistrationAndAssignToCours(long idC, Moniteur moniteur);
}
