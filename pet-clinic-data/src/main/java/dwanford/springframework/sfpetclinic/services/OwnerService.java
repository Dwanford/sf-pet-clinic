package dwanford.springframework.sfpetclinic.services;

import dwanford.springframework.sfpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
    
}
