package com.trainings.profile;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

// Dev -ORAcle,
@Profile("Development")
@Configuration

public class DevDatabaseConfig implements DatabaseConfig{

	@Override
	@Bean
	public DataSource createDataSource() {
			DriverManagerDataSource dataSource=new DriverManagerDataSource();
			System.out.println("Creating Development Database Instance");

		
		return dataSource;
	}

}
