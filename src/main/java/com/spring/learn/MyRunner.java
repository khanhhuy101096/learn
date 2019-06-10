package com.spring.learn;

import com.spring.learn.entity.City;
import com.spring.learn.repository.CityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(MyRunner.class);

    @Autowired
    private CityRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();

        repository.save(new City("Bratislava", 432000));
        repository.save(new City("Budapest", 1759000));
        repository.save(new City("Prague", 1280000));

        repository.findAll().forEach(city -> {
            log.info("{}", city);
        });
    }
}
