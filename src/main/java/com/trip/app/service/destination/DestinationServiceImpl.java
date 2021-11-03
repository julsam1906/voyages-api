package com.trip.app.service.destination;

import com.trip.app.dao.destination.DestinationDao;
import com.trip.app.dto.DestinationDTO;
import com.trip.app.entity.DestinationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DestinationServiceImpl implements DestinationService {

    @Autowired
    private DestinationDao destinationDao;

    @Override
    public List<DestinationDTO> getAllDestination() {
        List<DestinationEntity> destinations = destinationDao.findAll();
        return mapListDestination(destinations);
    }

    @Override
    public List<String> getContinents() {
        return destinationDao.findContinents();
    }

    @Override
    public List<String> getCountryByContinent(String continent) {
        return destinationDao.findCountryByContinent(continent);
    }

    @Override
    public void createDestination(DestinationDTO destinationDTO) {
        DestinationEntity destination = mapDestination(destinationDTO);
        destinationDao.save(destination);
    }

    private List<DestinationDTO> mapListDestination(List<DestinationEntity> destinations){
        return destinations.stream().map(this::mapDestination).collect(Collectors.toList());
    }

    private DestinationDTO mapDestination(DestinationEntity destination){
        DestinationDTO destinationDTO = new DestinationDTO();
        destinationDTO.setContinent(destination.getContinent());
        destinationDTO.setCountry(destination.getCountry());
        return destinationDTO;
    }

    private DestinationEntity mapDestination(DestinationDTO destinationDTO){
        DestinationEntity destinationEntity = new DestinationEntity();
        destinationEntity.setContinent(destinationDTO.getContinent());
        destinationEntity.setCountry(destinationDTO.getCountry());
        return destinationEntity;

    }
}
