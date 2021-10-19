package com.trip.app.controller;

import com.trip.app.entity.PlaceToVisit;
import com.trip.app.service.placetovisit.PlaceToVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trip/place")
public class PlaceToVisitController {

    @Autowired
    private PlaceToVisitService placeToVisitService;

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<PlaceToVisit>> getAllPlaces(){
        List<PlaceToVisit> places = placeToVisitService.getAllPlaces();
        return new ResponseEntity<>(places, HttpStatus.OK);
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<PlaceToVisit>> getPlacesByName(@PathVariable String name){
        List<PlaceToVisit> places = placeToVisitService.getPlacesByName(name);
        return new ResponseEntity<>(places, HttpStatus.OK);
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<String> createPlace(@RequestBody PlaceToVisit placeToVisit){
        placeToVisitService.createPlace(placeToVisit);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping
    @ResponseBody
    public ResponseEntity<String> deletePlace(@RequestParam PlaceToVisit placeToVisit){
        placeToVisitService.deletePlace(placeToVisit);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
