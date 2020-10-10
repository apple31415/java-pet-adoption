package com.launchacademy.petadoptions.controllers.api;

import com.launchacademy.petadoptions.models.AdoptablePet;
import com.launchacademy.petadoptions.models.PetType;
import com.launchacademy.petadoptions.repositories.AdoptablePetsRepository;
import com.launchacademy.petadoptions.repositories.PetTypeRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AdoptablePetsRestController {
  private AdoptablePetsRepository adoptablePetRepository;
  private PetTypeRepository petTypeRepository;

  private class PetNotFound extends RuntimeException{ };

  @ControllerAdvice
  private class PetNotFoundAdvice{
    @ResponseBody
    @ExceptionHandler(PetNotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String adoptablePetNotFoundHandler(PetNotFound petNotFound) {
      return petNotFound.getMessage();
    }
  }

  @Autowired
  public AdoptablePetsRestController(AdoptablePetsRepository adoptablePetRepository){
    this.adoptablePetRepository = adoptablePetRepository;
  }

  @GetMapping("pets/{petType}/{id}")
  public AdoptablePet getPetById(@PathVariable Integer id, @PathVariable String petType) {
    Optional<PetType> species = petTypeRepository.findByType(petType);
    return adoptablePetRepository.findByIdAndPetType(id, species).orElseThrow(PetNotFound::new);
  }

  @GetMapping("/pets/{petType}")
  public  Iterable<AdoptablePet> getPetsByType(@PathVariable String petType) {
    return adoptablePetRepository.findByPetTypeType(petType);
  }

}
