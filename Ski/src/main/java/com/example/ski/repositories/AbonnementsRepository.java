package com.example.ski.repositories;

import com.example.ski.entities.Abonnement;
import com.example.ski.entities.enums.TypeAbonnement;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface AbonnementsRepository extends CrudRepository<Abonnement, Long> {
  List<Abonnement> findByTypeAbonOrderByDateDebut (TypeAbonnement typeAbon);
  List<Abonnement> findByDateDebutAfterAndDateFinBefore(LocalDate dateDebut, LocalDate dateFin);

}
