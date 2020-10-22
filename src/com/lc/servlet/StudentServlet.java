package com.lc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.lc.pojo.Student;
import com.lc.service.StudentService;


@WebServlet("/student")
public class StudentServlet extends HttpServlet{
	
	private StudentService studentService;
	
	@Override
	public void init() throws ServletException {
		//对service实例化
		//ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//spring和web整合后所有的信息都存放在webApplicationContext中
		ServletContext context = getServletContext();
		ApplicationContext ac= WebApplicationContextUtils.getRequiredWebApplicationContext(context);
		studentService = ac.getBean("studentService",StudentService.class);
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setAttribute("list", studentService.show());
		List<Student> s = studentService.show();
		System.out.println(s.isEmpty());
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}

}
