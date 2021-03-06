package com.captcha.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.captcha.dao.UserDao;
import com.captcha.model.User;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public void register(User user) throws Exception {
    userDao.register(user);
  }

  public User validateUser(User user) {
    return userDao.validateUser(user);
  }

  public User getUser(String loginUser) {
    return userDao.getUser(loginUser);
  }
  
  public void updateUser(User user, String loginUser) throws Exception {
    userDao.updateUser(user, loginUser);
  }
}
