package com.example.ski.repositories;

import com.example.ski.entities.Piste;
import org.springframework.data.repository.CrudRepository;

public interface PistesRepository extends CrudRepository<Piste, Long> {
}
