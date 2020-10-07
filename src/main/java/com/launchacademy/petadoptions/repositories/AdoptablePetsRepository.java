package com.launchacademy.petadoptions.repositories;

import com.launchacademy.petadoptions.models.AdoptablePet;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AdoptablePetsRepository extends PagingAndSortingRepository<AdoptablePet, Integer> {

  public Iterable<AdoptablePet> findByPetTypeType(String petType);
}
