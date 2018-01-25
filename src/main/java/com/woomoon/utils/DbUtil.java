package com.woomoon.utils;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Component("DbUtil")
public class DbUtil {
	
	public DbUtil () {
		try {
			dataSource.setUser("root");
			dataSource.setPassword("qwe");
			dataSource.setDriverClass("com.mysql.jdbc.Driver");
			dataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/test");
			dataSource.setInitialPoolSize(5);
			dataSource.setMaxPoolSize(20);
			System.out.println("init -----------> C3P0");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private ComboPooledDataSource dataSource = new ComboPooledDataSource();
	private NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);
	
	public NamedParameterJdbcTemplate getTemplate() {
		return template;
	}
}
