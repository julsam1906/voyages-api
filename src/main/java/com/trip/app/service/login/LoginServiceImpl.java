package com.trip.app.service.login;

import com.trip.app.dao.login.LoginDao;
import com.trip.app.entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    @Override
    public Login getInfosUser(String pseudo, String password) {
        return loginDao.findByIdentifiants(pseudo, password);
    }
}
