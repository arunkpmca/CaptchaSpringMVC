package com.captcha.h2.config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Service;
 
import javax.sql.DataSource;
 
@Service
public class DataSourceConfiguration {
 
    public DataSource dataSource() {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:~/strutsmigrator/db/struts_migrator");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource;
    }
}
