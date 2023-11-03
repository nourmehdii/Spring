package com.example.ski.controllers;

import com.example.ski.entities.Inscription;
import com.example.ski.entities.Skieur;
import com.example.ski.services.ISkieurService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("skieur")
@RequiredArgsConstructor
public class SkieursController {

    private final ISkieurService iSkieurService;

    @GetMapping
    public List<Skieur> getAll(){
        return iSkieurService.getAll();
    }

    @GetMapping("{id}")
    public Skieur getId(@PathVariable long id) {
        return iSkieurService.getId(id);
    }
    @PostMapping
    public Skieur add(@RequestBody Skieur s) {
        return iSkieurService.add(s);
    }
    @PutMapping
    public Skieur update(@RequestBody Skieur s) {
        return iSkieurService.add(s);
    }

    @PostMapping("{idabon}")
    public Skieur addRegistrationAndAssignToAbonnement(@PathVariable long idabon, Skieur skieur){
        return iSkieurService.addRegistrationAndAssignToAbonnement(idabon,skieur);
    }

    /*@PostMapping("{numSkieur}/{numPiste}")
    public Skieur assignSkierToPiste(long numSkieur, long numPiste){
        return iSkieurService.assignSkierToPiste(numSkieur,numPiste);
    }*/


}
