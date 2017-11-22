package com.krishna;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("/spring.xml");

		Object o = ac.getBean("k");

		Client c = (Client) o;
		c.hello();
	}
}
