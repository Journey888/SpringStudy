package com.lc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lc.pojo.People;


public class Test {
	
	public static void main(String[] args) {
		//加载配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		People people = ac.getBean("peo",People.class);
		System.out.println(people);
		
		
		String [] s = ac.getBeanDefinitionNames();
		for(String ss : s) {
			System.out.println(ss);
		}
		
		People p  = ac.getBean("peo3",People.class);
		System.out.println(p);
	}

}
