package com.captcha.dao;

import com.captcha.model.UserRegistration;

public interface UserDao {

  void register(UserRegistration user);

//  User validateUser(Login login);
}
