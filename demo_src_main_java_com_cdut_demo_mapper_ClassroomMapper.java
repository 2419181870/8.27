package com.cdut.demo.mapper;

import com.cdut.demo.entity.Classroom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ClassroomMapper {
	@Select("SELECT * FROM classroom WHERE classroom_id=#{classroom_id}")
	Classroom findclassroomById(@Param("classroom_id") String classroom_id);

	@Select("SELECT * FROM classroom WHERE classroom_campus=#{classroom_campus}")
	List<Classroom> findclassroomBySchoolCampus(@Param("classroom_campus") String classroom_campus);

	@Select("SELECT * FROM classroom WHERE classroom_name LIKE #{classroom_campus}")
	List<Classroom> findclassroomByName(@Param("classroom_name") String classroom_name);

	@Select("SELECT * FROM classroom WHERE classroom_venue=#{classroom_venue}")
	List<Classroom> findclassroomByVenue(@Param("classroom_venue") String classroom_venue);

	@Select("SELECT * FROM classroom WHERE classroom_Type=#{classroom_Type}")
	List<Classroom> findclassroomByType(@Param("classroom_Type") String classroom_Type);

	@Select("SELECT * FROM classroom WHERE classroom_campus=#{classroom_campus}")
	List<Classroom> findclassroomByManagement(@Param("classroom_campus") String classroom_campus);

	@Update("UPDATE classroom  SET classroom_used=#{classroom_used) WHERE classroom_id=#{classroom_id}")
	void setClassroomUsed(@Param("classroom_id") String classroom_id,@Param("classroom_used")boolean classroom_used);



}
