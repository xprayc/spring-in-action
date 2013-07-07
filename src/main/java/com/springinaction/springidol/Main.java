package com.springinaction.springidol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws Exception {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springinaction/springidol/spring-idol.xml")) {
			Performer performer = context.getBean("poeticDuke", Performer.class);
			performer.perform();
		}
	}
}
