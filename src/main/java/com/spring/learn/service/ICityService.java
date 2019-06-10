package com.spring.learn.service;

import com.spring.learn.entity.City;

import java.util.List;

public interface ICityService {

    List<City> findByNameEndsWith(String name);
}
