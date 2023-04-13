package com.services;

import com.model.Pet;
import com.model.Vet;

import java.util.Set;

public interface VetService {
    Vet getById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
