package com.example.ski.controllers;

import com.example.ski.entities.Abonnement;
import com.example.ski.entities.Cours;
import com.example.ski.services.IAbonnementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("abonnement")
@RequiredArgsConstructor
public class AbonnementController {
    private final IAbonnementService iAbonnementService;

    @GetMapping
    public List<Abonnement> getAll() {
        return iAbonnementService.getAll();
    }

    @GetMapping("{id}")
    public Abonnement getId(@PathVariable long id) {
        return iAbonnementService.getId(id);
    }

    @PostMapping
    public Abonnement add(@RequestBody Abonnement a) {
        return iAbonnementService.add(a);
    }

    @PutMapping
    public Abonnement update(@RequestBody Abonnement a) {
        return iAbonnementService.add(a);
    }
}
