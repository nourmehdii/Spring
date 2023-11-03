package com.example.ski.services;

import com.example.ski.entities.Piste;
import com.example.ski.repositories.PistesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class IpisteServiceImp implements IPisteService{
    @Autowired
    PistesRepository pisteRep;

    @Override
    public Piste add(Piste p) {
        return pisteRep.save(p);
    }

    @Override
    public Piste update(Piste p) {
        return pisteRep.save(p);
    }

    @Override
    public List<Piste> getAll() {
        return (List<Piste>) pisteRep.findAll();
    }

    @Override
    public Piste getId(long id) {
        return pisteRep.findById(id).orElse(null);
    }

    @Override
    public boolean deleteById(long id) {
        pisteRep.deleteById(id);
        return !(pisteRep.existsById(id));
    }
}
