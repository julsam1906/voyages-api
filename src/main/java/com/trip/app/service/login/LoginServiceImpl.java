package com.trip.app.service.login;

import com.trip.app.dao.login.LoginDao;
import com.trip.app.dto.LoginDTO;
import com.trip.app.dto.UserInfoDTO;
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

    @Override
    public int createUser(LoginDTO login) {
        Login compte = mapLoginDto(login);
        String password = login.getPassword();
        String passwordVerif = login.getPassword2();
        int verif = password.compareTo(passwordVerif);
        if (verif == 0) {
            loginDao.save(compte);
        }
        return verif;
    }

    @Override
    public void deleteUser(UserInfoDTO userInfoDTO) {
        loginDao.deleteByUserInfo(userInfoDTO.getPseudo(), userInfoDTO.getName(), userInfoDTO.getDateNaissance());
    }

    /**
     * @param loginDTO dto du login
     * @return Login
     */
    private Login mapLoginDto(LoginDTO loginDTO) {
        Login login = new Login();
        login.setNom(loginDTO.getNom());
        login.setPrenom(loginDTO.getPrenom());
        login.setEmail(loginDTO.getEmail());
        login.setDateNaissance(loginDTO.getDateNaissance());
        login.setPassword(loginDTO.getPassword());
        login.setPseudo(loginDTO.getPseudo());
        login.setGenre(loginDTO.getGenre());
        return login;
    }
}
