package com.spring.learn.repository;

import com.spring.learn.entity.City;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

    @Query("select c from City c where c.name like %:name%")
    List<City> findByNameEndsWith(@Param("name") String userName);
}
