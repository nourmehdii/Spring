package com.example.ski.services;

import com.example.ski.entities.Piste;

import java.util.List;

public interface IPisteService {
    Piste add(Piste p);
    Piste update(Piste p);
    List<Piste> getAll();
    Piste getId(long id);
    boolean deleteById (long id);
}
