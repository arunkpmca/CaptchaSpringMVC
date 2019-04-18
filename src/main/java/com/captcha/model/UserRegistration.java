package com.captcha.model;

public class UserRegistration {

  private String username;
  private String password;
  private String name;
  private String email;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    System.out.println("username: " + username);
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

 
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}