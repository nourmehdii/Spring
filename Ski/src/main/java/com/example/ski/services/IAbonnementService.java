package com.example.ski.services;

import com.example.ski.entities.Abonnement;
import java.util.List;

public interface IAbonnementService {
    Abonnement add(Abonnement a);
    Abonnement update(Abonnement a);
    List<Abonnement> getAll();
    Abonnement getId(long id);
    boolean deleteById (long id);
}
