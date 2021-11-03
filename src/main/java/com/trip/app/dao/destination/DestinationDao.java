package com.trip.app.dao.destination;

import com.trip.app.entity.DestinationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DestinationDao extends JpaRepository<DestinationEntity, Long> {

    @Query("SELECT DISTINCT(d.continent) FROM destination d")
    List<String> findContinents();

    @Query("SELECT d.country FROM destination d WHERE d.continent=:continent")
    List<String> findCountryByContinent(String continent);
}
