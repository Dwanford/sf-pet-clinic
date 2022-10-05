package dwanford.springframework.sfpetclinic.repositories;

import dwanford.springframework.sfpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
