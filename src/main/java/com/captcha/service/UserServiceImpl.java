package com.captcha.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.captcha.dao.UserDao;
import com.captcha.model.UserRegistration;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public void register(UserRegistration user) {
    userDao.register(user);
  }

  /*public User validateUser(Login login) {
    return userDao.validateUser(login);
  }*/

}
