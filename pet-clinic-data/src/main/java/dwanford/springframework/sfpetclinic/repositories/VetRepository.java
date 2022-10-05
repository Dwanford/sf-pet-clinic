package dwanford.springframework.sfpetclinic.repositories;

import dwanford.springframework.sfpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
