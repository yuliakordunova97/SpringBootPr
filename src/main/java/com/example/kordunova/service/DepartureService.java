package com.example.kordunova.service;

import com.example.kordunova.entity.Departure;
import com.example.kordunova.logger.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class DepartureService {

    List<Departure> departures = new ArrayList<>();

    @Autowired
    Logger logger;

    public String getMessageWithRandomNumber(){
        String message = "message with " + new Random().nextInt(10);
        logger.logMessage(message);
        return message;
    }

    public Departure addDeparture(Departure departure){
        departures.add(departure);
        return departures.stream().filter(d -> d.getId() == departure.getId()).findFirst().orElse(null);
    }

    public List<Departure> updateDeparture(int id, Departure departure){
        for (Departure d : departures){
            if (d.getId() == id){
                d.setId(departure.getId());
                d.setName(departure.getName());
                d.setLocation(departure.getLocation());
            }
        }
        return departures;
    }

    public List<Departure> getDepartures(){
        return departures;
    }
}
