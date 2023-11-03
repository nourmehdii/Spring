package com.example.ski.services;

import com.example.ski.entities.Cours;

import java.util.List;

public interface ICourService {
    Cours addCour(Cours c);
    Cours updateCours(Cours c);
    List<Cours>  getAll();
    Cours getId(long id);
    boolean deleteById (long id);

}
