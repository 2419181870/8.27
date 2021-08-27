package com.cdut.demo.mapper;

import com.cdut.demo.entity.StudentServiceModular;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentServiceModularMapper {
	@Select("SELECT *From student_service_modular")
	List<StudentServiceModular> getStudentService();
}
