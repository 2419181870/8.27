package com.cdut.demo.mapper;

import com.cdut.demo.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CourseMajorMapper {
	List<Course> getCourseByMajor(@Param("major_id") Long major_id,@Param("major_college_name") String major_college_name,@Param("course_academic_year")int course_academic_year,@Param("course_class_id")String course_class_id);
}
