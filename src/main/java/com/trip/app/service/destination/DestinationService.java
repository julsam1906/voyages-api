package com.trip.app.service.destination;

import com.trip.app.dto.DestinationDTO;

import java.util.List;

public interface DestinationService {

    List<DestinationDTO> getAllDestination();

    List<String> getContinents();

    List<String> getCountryByContinent(String continent);

    void createDestination(DestinationDTO destinationDTO);
}
