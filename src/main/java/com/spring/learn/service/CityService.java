package com.spring.learn.service;

import com.spring.learn.entity.City;
import com.spring.learn.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityService implements ICityService{

    @Autowired
    private CityRepository repository;

    @Override
    public Optional<City> findById(Long id) {
        return repository.findById(id);
    }
}
