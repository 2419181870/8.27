package com.cdut.demo.mapper;

import com.cdut.demo.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeacherMapper {
	@Select("SELECT *FROM teacher where teacher_department=#{teacher_department} ORDER BY teacher_id")
	List<Teacher> getTeacherByDepartment(@Param("teacher_department")int teacher_department);

	List<Teacher> getTeacherByDepartmentAndName(@Param("teacher_department")int teacher_department,@Param("teacher_name")String teacher_name);
}
