package com.launchacademy.petadoptions.controllers.api;

import com.launchacademy.petadoptions.models.AdoptablePet;
import com.launchacademy.petadoptions.repositories.AdoptablePetsRepository;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AdoptablePetsRestController {
  private AdoptablePetsRepository adoptablePetRepository;

  @Autowired
  public AdoptablePetsRestController(AdoptablePetsRepository adoptablePetRepository){
    this.adoptablePetRepository = adoptablePetRepository;
  }


  @GetMapping("/pets/{petType}")
  public  Iterable<AdoptablePet> getPetsByType(@PathVariable String petType) {
    return adoptablePetRepository.findByPetTypeType(petType);
  }

}
