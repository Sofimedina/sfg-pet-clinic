package com.services;

import com.model.Vet;

<<<<<<< Updated upstream
public interface VetService extends CrudService<Vet,Long> {
=======
import java.util.Set;

public interface VetService {


    Vet getById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
>>>>>>> Stashed changes
}
