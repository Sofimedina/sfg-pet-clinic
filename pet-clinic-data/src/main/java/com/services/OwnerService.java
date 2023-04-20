package com.services;

import com.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long> {
    Set<Owner> findByLastName(String lastName);
}
