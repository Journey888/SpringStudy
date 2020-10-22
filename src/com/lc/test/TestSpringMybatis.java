package com.lc.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lc.pojo.Student;
import com.lc.service.impl.StudentServiceImpl;

public class TestSpringMybatis {
	
	public static void main(String[] args) {
		//默认从编译后的classes文件件根目录开始寻找，所以不需要全路径
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		String[] s = ac.getBeanDefinitionNames();
		for(String ss:s) {
			System.out.println(ss);
		}
		
		StudentServiceImpl bean =  ac.getBean("studentService",StudentServiceImpl.class);
		List<Student> st =bean.show();
		System.out.println(st.isEmpty());
		for(Student S :st) {
			System.out.println(S);
		}
	}

}
