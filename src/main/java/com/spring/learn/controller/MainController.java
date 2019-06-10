package com.spring.learn.controller;

import com.spring.learn.entity.City;
import com.spring.learn.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ICityService cityService;

    @GetMapping("/showCitiesEnding")
    public String findCitiesNameEndsWith(Model model, @RequestParam String name){
        List<City> cities = cityService.findByNameEndsWith(name);
        model.addAttribute("cities", cities);
        return "showCities";
    }
}
