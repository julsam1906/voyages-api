package com.trip.app.dao.login;

import com.trip.app.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LoginDao extends JpaRepository<Login, Long> {

    @Query("SELECT a FROM Login a WHERE PSEUDO=:pseudo AND PASSWORD=:password")
    Login findByIdentifiants(@Param("pseudo") String pseudo, @Param("password") String password);
}
