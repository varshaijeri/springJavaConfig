package com.varsha.spring.springjavaconfig;

import org.springframework.stereotype.Component;

@Component
public class Dao {

	public void create() {
		System.out.println("Inside create function");
	}
}