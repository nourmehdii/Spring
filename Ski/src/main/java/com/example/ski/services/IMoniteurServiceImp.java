package com.example.ski.services;

import com.example.ski.entities.Cours;
import com.example.ski.entities.Moniteur;
import com.example.ski.repositories.CoursRepository;
import com.example.ski.repositories.MoniteursRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IMoniteurServiceImp implements IMoniteurService{

    private final MoniteursRepository MoniteurRep;
    private final CoursRepository coursRepository;

    @Override
    public Moniteur add(Moniteur m) {
        return MoniteurRep.save(m);

    }

    @Override
    public Moniteur update(Moniteur m) {
        return MoniteurRep.save(m);
    }

    @Override
    public List<Moniteur> getAll() {
        return (List<Moniteur>) MoniteurRep.findAll();
    }

    @Override
    public Moniteur getId(long id) {
        return MoniteurRep.findById(id).orElse(null);
    }

    @Override
    public boolean deleteById(long id) {
        MoniteurRep.deleteById(id);
        return !(MoniteurRep.existsById(id));    }

    @Override
    public Moniteur addRegistrationAndAssignToCours(long idC, Moniteur moniteur) {
        //Cours cour= coursRepository.findById(idC).orElse(null);
        //moniteur.setCours(List<Cours> cour);
        //return MoniteurRep.save(moniteur);
        return moniteur;
    }
}
