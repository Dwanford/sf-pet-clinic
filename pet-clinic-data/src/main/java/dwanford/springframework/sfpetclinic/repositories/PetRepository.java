package dwanford.springframework.sfpetclinic.repositories;

import dwanford.springframework.sfpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
