package com.spring.learn.service;

import com.spring.learn.entity.City;

import java.util.Optional;

public interface ICityService {

    Optional<City> findById(Long id);
}
