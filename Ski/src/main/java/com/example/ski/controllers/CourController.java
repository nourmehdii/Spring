package com.example.ski.controllers;

import com.example.ski.entities.Cours;
import com.example.ski.services.ICourService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cour")
@RequiredArgsConstructor
public class CourController {
    private final ICourService iCourService;

    @GetMapping
    public List<Cours> getAll() {
        return iCourService.getAll();
    }

    @GetMapping("{id}")
    public Cours getId(@PathVariable long id) {
        return iCourService.getId(id);
    }

    @PostMapping
    public Cours add(@RequestBody Cours c) {
        return iCourService.addCour(c);
    }

    @PutMapping
    public Cours update(@RequestBody Cours c) {
        return iCourService.addCour(c);
    }
}
