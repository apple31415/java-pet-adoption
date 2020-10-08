package com.launchacademy.petadoptions.repositories;

import com.launchacademy.petadoptions.models.SurrenderPet;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurrenderPetRepository extends PagingAndSortingRepository<SurrenderPet, Integer> {

}