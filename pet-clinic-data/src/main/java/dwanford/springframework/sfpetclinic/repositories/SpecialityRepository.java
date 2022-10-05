package dwanford.springframework.sfpetclinic.repositories;

import dwanford.springframework.sfpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
