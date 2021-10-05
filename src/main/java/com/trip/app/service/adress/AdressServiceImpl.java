package com.trip.app.service.adress;

import com.trip.app.dao.adress.AdressDao;
import com.trip.app.entity.Adress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdressServiceImpl implements AdressService {

    @Autowired
    private AdressDao adressDao;

    @Override
    public void createAdress(Adress adress) {
       adressDao.save(adress);
    }

    @Override
    public void deleteAdress(Integer id) {
        Adress adress = adressDao.findById(id);
        adressDao.delete(adress);
    }


}
