package com.lc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lc.pojo.People;
import com.lc.pojo.PeopleFactory;

/**
 * 实例工厂测试代码
 * 
 * 具体如何实例化工厂暂时不重要，可以使用单例也可以new
 * @author lenovo
 *
 */
public class TestNewFactory {
	
	public static void main(String[] args) {
		//一般写法,实例工厂
		//PeopleFactory factory = new PeopleFactory();
		//People people = factory.newInstance();
		
		//使用IoC
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		People people = ac.getBean("peo1",People.class);
		System.out.println(people);
		
		
		//静态工厂一般写法
		//People people1 = PeopleFactory.newInstance1();
		
		//使用IoC
		People people1 = ac.getBean("peo2",People.class);
		System.out.println(people1);
		
		String [] s = ac.getBeanDefinitionNames();
		for(String ss : s) {
			System.out.println(ss);
		}
		
		
	}

}
