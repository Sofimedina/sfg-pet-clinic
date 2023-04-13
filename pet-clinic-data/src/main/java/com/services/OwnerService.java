package com.services;

import com.model.Owner;
import com.model.Pet;

import java.util.Set;

public interface OwnerService {
    Owner getById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
    Set<Owner> findByLastName(String lastName);
}
