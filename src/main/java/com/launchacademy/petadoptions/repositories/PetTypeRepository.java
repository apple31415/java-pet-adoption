package com.launchacademy.petadoptions.repositories;

import com.launchacademy.petadoptions.models.AdoptablePet;
import com.launchacademy.petadoptions.models.PetType;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetTypeRepository extends PagingAndSortingRepository<PetType, Integer> {

  List findAllByType(String type);
}