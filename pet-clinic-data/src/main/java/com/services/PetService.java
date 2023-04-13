package com.services;

import com.model.Pet;

import java.util.Set;

public interface PetService {
    Pet getById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
