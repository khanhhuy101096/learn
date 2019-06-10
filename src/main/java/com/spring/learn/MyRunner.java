package com.spring.learn;

import com.spring.learn.entity.City;
import com.spring.learn.repository.CityRepository;
import com.spring.learn.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private ICityService cityService;

    @Override
    public void run(String... args) throws Exception {
        Long id1 = 51L;
        cityService.findById(id1).ifPresent(System.out::println);
        Long id2 = 12L;
        Optional<City> city = cityService.findById(id2);
        if (city.isPresent()){
            System.out.println(city.get());
        } else {
            System.out.printf("No city found with id %d%n", id2);
        }

    }
}
