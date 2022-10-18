package com.dwanford.sfpetclinic.repositories;

import com.dwanford.sfpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
