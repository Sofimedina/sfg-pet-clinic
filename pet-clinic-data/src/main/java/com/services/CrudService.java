package com.services;

import com.model.Owner;

import java.util.Set;

public interface CrudService<T, ID>  {
    Set<T> findAll();
    T findById(ID id);
    T save(T t);
    void delete(T object);
    void deleteById(ID id);



}
