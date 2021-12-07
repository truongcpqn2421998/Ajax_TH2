package com.codegym.service;

import com.codegym.model.Smartphone;

import java.util.Optional;

public interface ISmartPhoneService {
    Iterable<Smartphone> findAll();

    Optional<Smartphone> findById(Long id);

    Smartphone save(Smartphone smartPhone);

    void remove(Long id);
}
