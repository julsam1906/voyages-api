package com.trip.app.service.placetovisit;

import com.trip.app.entity.PlaceToVisit;

import java.util.List;

public interface PlaceToVisitService {

    void createPlace(PlaceToVisit placeToVisit);

    List<PlaceToVisit> getAllPlaces();

    List<PlaceToVisit> getPlacesByName(String name);

    void deletePlace(PlaceToVisit placeToVisit);
}
