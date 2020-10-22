package com.lc.service.impl;

import java.util.List;

import com.lc.mapper.StudentMapper;
import com.lc.pojo.Student;
import com.lc.service.StudentService;

public class StudentServiceImpl implements StudentService {
	
	private StudentMapper studentMapper;
	
	
	public StudentMapper getStudentMapper() {
		return studentMapper;
	}


	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}


	@Override
	public List<Student> show() {
	
		return studentMapper.selectAll();
	}

}
