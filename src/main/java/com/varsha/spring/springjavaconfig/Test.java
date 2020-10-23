package com.varsha.spring.springjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		Service serv1 = ctx.getBean(Service.class);
		Service serv2 = ctx.getBean(Service.class);
		serv1.save();
		System.out.println(serv1.hashCode());
		serv2.save();
		System.out.println(serv2.hashCode());
		ctx.close();
	}

}
