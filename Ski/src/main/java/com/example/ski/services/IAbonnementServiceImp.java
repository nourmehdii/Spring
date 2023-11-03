package com.example.ski.services;

import com.example.ski.entities.Abonnement;
import com.example.ski.repositories.AbonnementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IAbonnementServiceImp implements IAbonnementService{
    @Autowired
    AbonnementsRepository abonnementRep;

    @Override
    public Abonnement add(Abonnement a) {
        return abonnementRep.save(a);
    }

    @Override
    public Abonnement update(Abonnement a) {
        return abonnementRep.save(a);    }

    @Override
    public List<Abonnement> getAll() {
        return (List<Abonnement>) abonnementRep.findAll();
    }

    @Override
    public Abonnement getId(long id) {
        return abonnementRep.findById(id).orElse(null);
    }

    @Override
    public boolean deleteById(long id) {
        abonnementRep.deleteById(id);
        return !(abonnementRep.existsById(id));
    }
}
