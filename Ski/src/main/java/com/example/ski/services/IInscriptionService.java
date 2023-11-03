package com.example.ski.services;

import com.example.ski.entities.Inscription;
import java.util.List;

public interface IInscriptionService {


  Inscription add(Inscription i);
    Inscription update(Inscription i);
    List<Inscription> getAll();
    Inscription getId(long id);
    boolean deleteById (long id);
    Inscription addRegistrationAndAssignToSkieur(long idSk, Inscription inscription);
    Inscription assignRegistrationToCours(long idCr, Long idRg);

}
