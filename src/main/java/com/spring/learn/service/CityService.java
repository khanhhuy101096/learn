package com.spring.learn.service;

import com.spring.learn.entity.City;
import com.spring.learn.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService{

    @Autowired
    private CityRepository repository;

    @Override
    public List<City> findByNameEndsWith(String name) {
        List<City> cities = repository.findByNameEndsWith(name);
        return cities;
    }
}
