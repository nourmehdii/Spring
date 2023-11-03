package com.example.ski.controllers;


import com.example.ski.entities.Cours;
import com.example.ski.entities.Moniteur;
import com.example.ski.services.ICourService;
import com.example.ski.services.IMoniteurService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("moniteur")
@RequiredArgsConstructor
public class MoniteurController {

    private final IMoniteurService iMoniteurService;

    @GetMapping
    public List<Moniteur> getAll() {
        return iMoniteurService.getAll();
    }

    @GetMapping("{id}")
    public Moniteur getId(@PathVariable long id) {
        return iMoniteurService.getId(id);
    }

    @PostMapping
    public Moniteur add(@RequestBody Moniteur m) {
        return iMoniteurService.add(m);
    }

    @PutMapping
    public Moniteur update(@RequestBody Moniteur m) {
        return iMoniteurService.add(m);
    }

}
