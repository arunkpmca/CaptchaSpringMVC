package com.captcha.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.captcha.h2.config.DataSourceConfiguration;
import com.captcha.model.UserRegistration;

public class UserDaoImpl implements UserDao {

  @Autowired
  private DataSourceConfiguration dataSourceConfiguration;
 
  public void register(UserRegistration user) {
    
    final DataSource dataSource = dataSourceConfiguration.dataSource();
    try {
        final Connection connection = dataSource.getConnection();
        final Statement statement = connection.createStatement();  

        String sql = "insert into users (username, password, name, email) values(user.getUsername(), user.getPassword(), user.getName(),user.getEmail())";
        statement.executeUpdate(sql);      
        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
  }

 /* public User validateUser(Login login) {

    String sql = "select * from users where username='" + login.getUsername() + "' and password='" + login.getPassword()
        + "'";

    List<User> users = jdbcTemplate.query(sql, new UserMapper());

    return users.size() > 0 ? users.get(0) : null;
  }*/

}

class UserMapper implements RowMapper<UserRegistration> {

  public UserRegistration mapRow(ResultSet rs, int arg1) throws SQLException {
    UserRegistration user = new UserRegistration();

    user.setUsername(rs.getString("username"));
    user.setPassword(rs.getString("password"));
    user.setName(rs.getString("firstname"));
    user.setEmail(rs.getString("email"));

    return user;
  }
}