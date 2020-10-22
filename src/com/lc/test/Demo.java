package com.lc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public void demo1() {
		//int i = 6/0;
		System.out.println("demo1");
	}

	public void demo2() {
		System.out.println("demo2");
	}
	
	public void demo3() {
		System.out.println("demo3");
	}
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Demo demo = ac.getBean("demo",Demo.class);
		demo.demo1();
		demo.demo2();
		demo.demo3();
	}
}
