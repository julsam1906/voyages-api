package com.trip.app.service.login;

import com.trip.app.dto.LoginDTO;
import com.trip.app.dto.UserInfoDTO;
import com.trip.app.entity.Login;

public interface LoginService {

    Login getInfosUser(String pseudo, String password);

    int createUser(LoginDTO login);

    void deleteUser(UserInfoDTO userInfoDTO);
}
