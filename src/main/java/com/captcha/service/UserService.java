package com.captcha.service;

import com.captcha.model.User;

public interface UserService {

  void register(User user) throws Exception;

  User validateUser(User user);

  User getUser(String loginUser);
  
  void updateUser(User user, String loginUser) throws Exception;
}
