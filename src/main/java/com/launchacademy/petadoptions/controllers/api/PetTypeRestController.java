package com.launchacademy.petadoptions.controllers.api;

import com.launchacademy.petadoptions.models.PetType;
import com.launchacademy.petadoptions.repositories.PetTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PetTypeRestController {
  private PetTypeRepository petTypeRepository;

  @Autowired
  public PetTypeRestController(PetTypeRepository petTypeRepository){
    this.petTypeRepository = petTypeRepository;
  }

  @GetMapping("/pet_types")
  public Iterable<PetType> displayPets(){
    return petTypeRepository.findAll();
  }
}

