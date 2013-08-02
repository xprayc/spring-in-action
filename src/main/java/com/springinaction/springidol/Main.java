package com.springinaction.springidol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws Exception {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springinaction/springidol/spring-idol-auto.xml")) {
			Performer performer = context.getBean("eddie", Performer.class);
			performer.perform();
			
//			Performer kenny = context.getBean("kenny", Performer.class);
//			kenny.perform();
		}
	}
}
