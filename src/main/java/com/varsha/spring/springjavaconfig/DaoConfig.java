package com.varsha.spring.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoConfig {
	@Bean
	public Dao getDao() {
		return new Dao();
	}
}
