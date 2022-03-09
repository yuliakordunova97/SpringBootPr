package com.example.kordunova.controller;

import com.example.kordunova.entity.Departure;
import com.example.kordunova.service.DepartureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartureController {

    @Autowired
    DepartureService departureService;

    @GetMapping("/hello")
    private String hello(){

        return departureService.getMessageWithRandomNumber();
    }

    @PostMapping("/departures")
    public Departure addDeparture(@RequestBody Departure departure){
        return departureService.addDeparture(departure);
    }

    @GetMapping("/departures")
    public List<Departure> getDepartures(){
        return departureService.getDepartures();
    }

    @PutMapping("/departures/{id}")
    public List<Departure> updateDeparture(@PathVariable int id, @RequestBody Departure departure){
        return departureService.updateDeparture(id,departure);
    }



}
