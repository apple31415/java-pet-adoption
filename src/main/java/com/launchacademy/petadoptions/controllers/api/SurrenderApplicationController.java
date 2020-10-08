package com.launchacademy.petadoptions.controllers.api;

import com.launchacademy.petadoptions.models.PetType;
import com.launchacademy.petadoptions.models.SurrenderPet;
import com.launchacademy.petadoptions.repositories.PetTypeRepository;
import com.launchacademy.petadoptions.repositories.SurrenderPetRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SurrenderApplicationController {
  private SurrenderPetRepository surrenderPetRepository;
  private PetTypeRepository petTypeRepository;

  @Autowired
  public SurrenderApplicationController(SurrenderPetRepository surrenderPetRepository, PetTypeRepository petTypeRepository){
    this.surrenderPetRepository = surrenderPetRepository;
    this.petTypeRepository = petTypeRepository;
  }

  @PostMapping("/adoptions/new/{typeId}")
  public SurrenderPet newSurrenderPet(@RequestBody SurrenderPet surrenderPet, @PathVariable Integer typeId) {
    Optional<PetType> petType = petTypeRepository.findById(typeId);
    surrenderPet.setPetType(petType.get());
    surrenderPet.setApplicationStatus(false);
    return surrenderPetRepository.save(surrenderPet);
  }



}
