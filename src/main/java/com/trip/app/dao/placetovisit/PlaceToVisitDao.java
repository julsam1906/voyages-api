package com.trip.app.dao.placetovisit;

import com.trip.app.entity.PlaceToVisit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlaceToVisitDao extends JpaRepository<PlaceToVisit, Long> {

    @Query("SELECT a FROM PlaceToVisit a WHERE name=:name")
    List<PlaceToVisit> findByName(@Param("name") String name);


}
