package com.cdut.demo.mapper;

import com.cdut.demo.entity.Major;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MajorMapper {
	@Select("SELECT * FROM major WHERE major_id=#{major_id}")
	Major getMajorById(@Param("major_id") Long major_id);

	@Delete("DELETE  FROM major WHERE major_id=#{major_id}")
	void  deleteMajorById(@Param("major_id")Long major_id);

	List<Major> getMajorByName(@Param("major_name") String major_name,@Param("major_level")String major_level);

	@Update("UPDATE major SET major_name=#{major_name} WHERE major_id=#{major_id}")
	void updateMajorName(@Param("major_name") String major_name, @Param("major_id") Long major_id);

	@Update("UPDATE major SET major_level=#{major_level} WHERE major_id=#{major_id}")
	void updateMajorLevel(@Param("major_level") String major_level, @Param("major_id") Long major_id);

	@Update("UPDATE major SET major_year=#{major_year} WHERE major_id=#{major_id}")
	void updateMajorYear(@Param("major_year") Long major_year, @Param("major_id") Long major_id);

	@Update("UPDATE major SET major_category=#{major_category} WHERE major_id=#{major_id}")
	void updateMajorCategory(@Param("major_category") String major_category, @Param("major_id") Long major_id);

	@Update("UPDATE major SET major_college_name=#{major_college_name} WHERE major_id=#{major_id}")
	void updateMajorCollege(@Param("major_college_name") String major_college_name, @Param("major_id") Long major_id);

	@Update("UPDATE major SET major_student_num=#{major_student_num} WHERE major_id=#{major_id}")
	void updateMajorStudentNumber(@Param("major_student_num") Long major_student_num, @Param("major_id") Long major_id);

	void addNewMajor(@Param("major_id") Long major_id, @Param("major_name") String major_name);
}
