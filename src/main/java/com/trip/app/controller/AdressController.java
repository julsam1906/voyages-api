package com.trip.app.controller;

import com.trip.app.entity.Adress;
import com.trip.app.service.adress.AdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voyages/adress")
public class AdressController {

    @Autowired
    private AdressService adressService;

    @GetMapping(value = "")
    @ResponseBody
    public ResponseEntity<List<Adress>> getAdresses(){
        return new ResponseEntity<>(adressService.getAdress(), HttpStatus.OK);
    }

    @PostMapping(value = "")
    @ResponseBody
    public ResponseEntity<String> createAdress(@RequestBody Adress adress){
        adressService.createAdress(adress);
        return new ResponseEntity<>(HttpStatus.OK);
    }



    @DeleteMapping(value = "")
    @ResponseBody
    public ResponseEntity<String> deleteAdress(@RequestParam Integer id){
        adressService.deleteAdress(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
