package com.trip.app.service.placetovisit;

import com.trip.app.dao.placetovisit.PlaceToVisitDao;
import com.trip.app.entity.PlaceToVisit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaceToVisitServiceImpl implements PlaceToVisitService {

    @Autowired
    private PlaceToVisitDao placeToVisitDao;

    @Override
    public void createPlace(PlaceToVisit placeToVisit) {
        placeToVisitDao.save(placeToVisit);
    }

    @Override
    public void deletePlace(PlaceToVisit placeToVisit) {
        placeToVisitDao.delete(placeToVisit);
    }
}
