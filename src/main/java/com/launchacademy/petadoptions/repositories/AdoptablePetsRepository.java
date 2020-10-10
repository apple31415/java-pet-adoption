package com.launchacademy.petadoptions.repositories;

import com.launchacademy.petadoptions.models.AdoptablePet;
import com.launchacademy.petadoptions.models.PetType;
import java.util.Optional;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AdoptablePetsRepository extends PagingAndSortingRepository<AdoptablePet, Integer> {

  public Iterable<AdoptablePet> findByPetTypeType(String petType);

  Optional<AdoptablePet> findByPetTypeId(Integer id);

  Optional <AdoptablePet> findByIdAndPetType(Integer petId, Optional<PetType> species);
}
