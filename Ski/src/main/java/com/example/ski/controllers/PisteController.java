package com.example.ski.controllers;

import com.example.ski.entities.Abonnement;
import com.example.ski.entities.Piste;
import com.example.ski.services.IAbonnementService;
import com.example.ski.services.IPisteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("piste")
@RequiredArgsConstructor
public class PisteController {

    private final IPisteService iPisteService;

    @GetMapping
    public List<Piste> getAll() {
        return iPisteService.getAll();
    }

    @GetMapping("{id}")
    public Piste getId(@PathVariable long id) {
        return iPisteService.getId(id);
    }

    @PostMapping
    public Piste add(@RequestBody Piste p) {
        return iPisteService.add(p);
    }

    @PutMapping
    public Piste update(@RequestBody Piste p) {
        return iPisteService.add(p);
    }
}
