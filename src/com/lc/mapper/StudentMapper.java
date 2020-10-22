package com.lc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.lc.pojo.Student;

public interface StudentMapper {
	
	@Select("select * from student")
	List<Student> selectAll();

}
