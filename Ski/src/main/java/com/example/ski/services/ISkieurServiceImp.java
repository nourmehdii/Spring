package com.example.ski.services;

import com.example.ski.entities.Abonnement;
import com.example.ski.entities.Cours;
import com.example.ski.entities.Piste;
import com.example.ski.entities.Skieur;
import com.example.ski.repositories.AbonnementsRepository;
import com.example.ski.repositories.PistesRepository;
import com.example.ski.repositories.SkieursRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ISkieurServiceImp implements ISkieurService{
    private final SkieursRepository skieurRep;
    private final PistesRepository pistesRepository;
    private final AbonnementsRepository abonnementsRepository;
    @Override
    public Skieur add(Skieur s) {
        return skieurRep.save(s);
    }

    @Override
    public Skieur update(Skieur s) {
        return skieurRep.save(s);
    }

    @Override
    public List<Skieur> getAll() {
        return (List<Skieur>) skieurRep.findAll();
    }

    @Override
    public Skieur getId(long id) {
        return skieurRep.findById(id).orElse(null);
    }

    @Override
    public boolean deleteById(long id) {
        skieurRep.deleteById(id);
        return !(skieurRep.existsById(id));
    }

    @Override
    public Skieur addRegistrationAndAssignToAbonnement(long idAbon, Skieur skieur) {
        Abonnement abonnement = abonnementsRepository.findById(idAbon).orElse(null);
        skieur.setAbon(abonnement);
        return skieurRep.save(skieur);
    }

    @Override
    public Skieur assignSkierToPiste(long numSkieur, long numPiste) {
        Skieur skieur=skieurRep.findById(numSkieur).orElse(null);
        Piste piste=pistesRepository.findById(numPiste).orElse(null);
        skieur.getPistes().add(piste);
        return skieurRep.save(skieur);    }


}
