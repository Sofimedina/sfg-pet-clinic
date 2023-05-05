package com.services;

import com.model.Owner;

import java.util.Set;

<<<<<<< Updated upstream
public interface OwnerService extends CrudService<Owner,Long> {
=======
public interface OwnerService  {
    Owner getById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
>>>>>>> Stashed changes
    Set<Owner> findByLastName(String lastName);
}
