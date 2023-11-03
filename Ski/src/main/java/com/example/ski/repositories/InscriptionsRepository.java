package com.example.ski.repositories;


import com.example.ski.entities.Inscription;
import org.springframework.data.repository.CrudRepository;

public interface InscriptionsRepository extends CrudRepository<Inscription, Long> {
}
