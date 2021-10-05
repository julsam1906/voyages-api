package com.trip.app.dao.adress;

import com.trip.app.entity.Adress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AdressDao extends JpaRepository<Adress, Long> {

    @Query("SELECT a FROM Adress a WHERE ID=:id")
    Adress findById(@Param("id") Integer id);
}
