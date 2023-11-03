package com.example.ski.services;

import com.example.ski.entities.Cours;
import com.example.ski.repositories.CoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ICourServiceImp implements ICourService{
    @Autowired
    CoursRepository courRep;
    @Override
    public Cours addCour(Cours c) {
        return courRep.save(c);
    }

    @Override
    public Cours updateCours(Cours c) {
        return courRep.save(c);
    }

    @Override
    public List<Cours> getAll() {
        return (List<Cours>) courRep.findAll();
    }

    @Override
    public Cours getId(long id) {
        return courRep.findById(id).orElse(null);
        //return courRep.findById(id).orElseThrow(() -> new IllegalArgumentException("no cours found with this id "+ id));
    }

    @Override
    public boolean deleteById(long id) {
        courRep.deleteById(id);
        return !(courRep.existsById(id));
    }
}
