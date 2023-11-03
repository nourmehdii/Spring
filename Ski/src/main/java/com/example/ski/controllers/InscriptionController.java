package com.example.ski.controllers;

import com.example.ski.entities.Inscription;
import com.example.ski.services.IInscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("inscription")
@RequiredArgsConstructor
public class InscriptionController {
    private final IInscriptionService iInscriptionService;

    @PostMapping("{idSk}")
    public Inscription addRegistrationAndAssignToSkieur(@PathVariable long idSk, Inscription inscription){
        return iInscriptionService.addRegistrationAndAssignToSkieur(idSk,inscription);
    }

  @PutMapping("/assignToCourse/{numInscription}/{idCr}")
  //ki yabda 3andi zouz pathvariable nwali nhothom ezouz fil path
  public Inscription assignRegistrationToCours(@PathVariable long numInscription , @PathVariable long idCR) {
    return iInscriptionService.assignRegistrationToCours(idCR,numInscription);
  }
}
