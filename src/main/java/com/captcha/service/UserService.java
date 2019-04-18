package com.captcha.service;

import com.captcha.model.UserRegistration;

public interface UserService {

  void register(UserRegistration userRegistration);

  //User validateUser(Login login);
}
