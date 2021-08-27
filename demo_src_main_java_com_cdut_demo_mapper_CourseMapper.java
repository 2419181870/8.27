package com.cdut.demo.mapper;

import com.cdut.demo.entity.Course;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Mapper
@Repository
public interface CourseMapper {

	void addNewCourse(@Param("course_id") String course_id, @Param("course_name") String course_name);

	List<Course> getCourseByName(@Param("course_name") String course_name);

	@Select("SELECT *FROM COURSE")
	List<Course> getAllCourseInfo();

	@Select("SELECT *FROM COURSE WHERE course_id=#{course_id}")
	List<Course> getCourseById(@Param("course_id") String course_id);

	@Select("SELECT *FROM COURSE WHERE course_type=#{course_type}")
	List<Course> getCourseByType(@Param("course_type") String course_type);

	@Update("UPDATE COURSE SET course_plan_student_num=#{course_plan_student_num} WHERE course_id=#{course_id}")
	void updateCoursePlanStudentNumById(@Param("course_id") String course_id, @Param("course_plan_student_num") int course_plan_student_num);

	@Update("UPDATE COURSE SET course_student_num=#{course_student_num} WHERE course_id=#{course_id}")
	void updateCourseStudentNumById(@Param("course_id") String course_id, @Param("course_student_num") int course_student_num);

	@Update("UPDATE COURSE SET course_teacher_id=#{course_teacher_id} WHERE course_id=#{course_id}")
	void updateCourseTeacherById(@Param("course_id") String course_id, @Param("course_teacher_id") Long course_teacher_id);

	@Update("UPDATE COURSE SET course_position=#{course_position} WHERE course_id=#{course_id} AND course_date=#{course_date}")
	void updateCoursePositionById(@Param("course_id") String course_id, @Param("course_position") String course_position,@Param("course_date")Date course_date);

	@Update("UPDATE COURSE SET course_name=#{course_name} WHERE course_id=#{course_id}")
	void updateCourseNameById(@Param("course_id") String course_id, @Param("course_name") String course_name);

	@Update("UPDATE COURSE SET course_date=#{course_date} WHERE course_id=#{course_id}")
	void updateCourseDayById(@Param("course_id") String course_id, @Param("course_date") Date course_date);

	@Update("UPDATE COURSE SET course_type=#{course_type} WHERE course_id=#{course_id}")
	void updateCourseTypeById(@Param("course_id") String course_id, @Param("course_type") String course_type);

	@Update("UPDATE COURSE SET course_credit=#{course_credit} WHERE course_id=#{course_id}")
	void updateCourseCreditById(@Param("course_id") String course_id, @Param("course_credit") Long course_credit);

	@Update("UPDATE COURSE SET course_remarks=#{course_remarks} WHERE course_id=#{course_id}")
	void updateCourseRemarksById(@Param("course_id") String course_id, @Param("course_remarks") String course_remarks);

	@Update("UPDATE COURSE SET course_major_id=#{course_major_id} WHERE course_id=#{course_id}")
	void updateCourseMajorsById(@Param("course_id") String course_id, @Param("course_major_id") String course_major_id);

	@Update("UPDATE COURSE SET course_class_id=#{course_class_id} WHERE course_id=#{course_id}")
	void updateCourseClassById(@Param("course_id") String course_id, @Param("course_class_id") String course_class_id);

	@Update("UPDATE COURSE SET course_times=#{course_times} WHERE course_id=#{course_id}")
	void updateCourseTimesById(@Param("course_id") String course_id, @Param("course_times") int course_times);


	@Delete("DELETE FROM course WHERE course_id=#{course_id}")
	void deleteCourseById(@Param("course_id") String course_id);

}
