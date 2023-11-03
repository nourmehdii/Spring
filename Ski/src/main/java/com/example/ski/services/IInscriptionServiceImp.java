package com.example.ski.services;

import com.example.ski.entities.Cours;
import com.example.ski.entities.Inscription;
import com.example.ski.entities.Skieur;
import com.example.ski.repositories.CoursRepository;
import com.example.ski.repositories.InscriptionsRepository;
import com.example.ski.repositories.SkieursRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IInscriptionServiceImp implements IInscriptionService{

    private final InscriptionsRepository InscriptionRep;
    private final SkieursRepository skieursRepository;
    private final CoursRepository coursRepository;

    @Override
    public Inscription add(Inscription i) {
        return InscriptionRep.save(i);
    }

    @Override
    public Inscription update(Inscription i) {
        return InscriptionRep.save(i);
    }

    @Override
    public List<Inscription> getAll() {
        return (List<Inscription>) InscriptionRep.findAll();
    }

    @Override
    public Inscription getId(long id) {
        return InscriptionRep.findById(id).orElse(null);
    }

    @Override
    public boolean deleteById(long id) {
        InscriptionRep.deleteById(id);
        return !(InscriptionRep.existsById(id));
    }

    @Override
    public Inscription addRegistrationAndAssignToSkieur(long idSk, Inscription inscription) {
        Skieur skieur=skieursRepository.findById(idSk).orElse(null);
        inscription.setSkieur(skieur);
        return InscriptionRep.save(inscription);
    }


  @Transactional //rollback yaani ay erreur tsir entre temps raja3li kol chay kima ken ama a  condition lezem tebda deja managed entity yaani andhom une reference fi west ioc
  //yaani ki yebdew deja f db w ena bech nrecuperihom (moch beech naadihom f parametere yetsan3ou bel wakkt)
  //ki nestaamloha maghir ma nokood naayet l coursrepository.save ()


  @Override
  public Inscription assignRegistrationToCours(long idCr, Long idRg) {
    Cours cour= coursRepository.findById(idCr).orElse(null);
    Inscription inscription=InscriptionRep.findById(idRg).orElse(null);;
    inscription.setCour(cour);
    return inscription;
  }
  }


