package com.dwanford.sfpetclinic.services;

import com.dwanford.sfpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
