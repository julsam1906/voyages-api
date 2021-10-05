package com.trip.app.controller;

import com.trip.app.entity.Adress;
import com.trip.app.entity.Login;
import com.trip.app.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/voyages/login")
@CrossOrigin(origins = {"http://localhost:3000", "https://youtube.com"}, allowCredentials = "true")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping(value = "")
    @ResponseBody
    public ResponseEntity<Login> getInfosUser(@RequestParam String pseudo, @RequestParam String password){
        Login login = loginService.getInfosUser(pseudo, password);
        return new ResponseEntity<>(login, HttpStatus.OK);
    }
}
