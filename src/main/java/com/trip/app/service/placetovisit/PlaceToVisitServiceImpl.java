package com.trip.app.service.placetovisit;

import com.trip.app.dao.placetovisit.PlaceToVisitDao;
import com.trip.app.entity.PlaceToVisit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceToVisitServiceImpl implements PlaceToVisitService {

    @Autowired
    private PlaceToVisitDao placeToVisitDao;

    @Override
    public void createPlace(PlaceToVisit placeToVisit) {
        placeToVisitDao.save(placeToVisit);
    }

    @Override
    public List<PlaceToVisit> getAllPlaces() {
        return placeToVisitDao.findAll();
    }

    @Override
    public List<PlaceToVisit> getPlacesByName(String name) {
        return placeToVisitDao.findByName(name);
    }


    @Override
    public void deletePlace(PlaceToVisit placeToVisit) {
        placeToVisitDao.delete(placeToVisit);
    }
}
