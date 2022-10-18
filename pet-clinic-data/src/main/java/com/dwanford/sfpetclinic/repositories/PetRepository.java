package com.dwanford.sfpetclinic.repositories;

import com.dwanford.sfpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
