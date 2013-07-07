package com.springinaction.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

	public static void main(String[] args) throws Exception {

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"knights.xml")) {
			Knight knight = (Knight) context.getBean("knight");
			knight.embarkOnQuest();
		}
	}
}
