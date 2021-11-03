package com.trip.app.controller;

import com.trip.app.dto.DestinationDTO;
import com.trip.app.service.destination.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trip/destinations")
@CrossOrigin(origins = {"http://localhost:3000"}, allowCredentials = "true")
public class DestinationController {

    @Autowired
    private DestinationService destinationService;

    @GetMapping("/continents")
    @ResponseBody
    public ResponseEntity<List<String>> getContinents(){
        List<String> continents = destinationService.getContinents();
        return new ResponseEntity<>(continents, HttpStatus.OK);
    }

    @GetMapping("/country")
    @ResponseBody
    public ResponseEntity<List<String>> getCountryByContinent(@RequestParam String continent){
        List<String> countries = destinationService.getCountryByContinent(continent);
        return new ResponseEntity<>(countries, HttpStatus.OK);
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<String> createDestination(@RequestBody DestinationDTO destinationDTO){
        destinationService.createDestination(destinationDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
