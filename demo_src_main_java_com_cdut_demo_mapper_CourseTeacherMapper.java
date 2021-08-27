package com.cdut.demo.mapper;

import com.cdut.demo.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CourseTeacherMapper {
	List<Course> getCourseByTeacherName(@Param("teacher_name") String teacher_name);
}
