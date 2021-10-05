package com.trip.app.controller;

import com.trip.app.entity.PlaceToVisit;
import com.trip.app.service.placetovisit.PlaceToVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/voyages/place")
public class PlaceToVisitController {

    @Autowired
    private PlaceToVisitService placeToVisitService;

    @PostMapping(value = "/create")
    @ResponseBody
    public ResponseEntity<String> createPlace(@RequestBody PlaceToVisit placeToVisit){
        placeToVisitService.createPlace(placeToVisit);
        return new ResponseEntity<>(HttpStatus.OK);
    }



    @DeleteMapping(value = "/delete")
    @ResponseBody
    public ResponseEntity<String> deletePlace(@RequestParam PlaceToVisit placeToVisit){
        placeToVisitService.deletePlace(placeToVisit);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
