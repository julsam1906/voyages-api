package com.trip.app.service.login;

import com.trip.app.entity.Login;

public interface LoginService {

    Login getInfosUser(String pseudo, String password);
}
