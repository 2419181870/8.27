package com.cdut.demo.mapper;

import com.cdut.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentLoginMapper {
	@Select("SELECT *FROM student WHERE student_id=#{student_id}")
	List<Student> getStudentById(@Param("student_id") Long student_id);

}
