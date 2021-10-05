package com.trip.app.dao.placetovisit;

import com.trip.app.entity.PlaceToVisit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PlaceToVisitDao extends JpaRepository<PlaceToVisit, Long> {

    @Query("SELECT a FROM PlaceToVisit a WHERE ID=:id")
    PlaceToVisit findById(@Param("id") Integer id);
}
