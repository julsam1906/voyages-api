package com.trip.app.service.adress;

import com.trip.app.entity.Adress;

import java.util.List;

public interface AdressService {

    void createAdress(Adress adress);

    List<Adress> getAdress();

    void deleteAdress(Integer id);
}
