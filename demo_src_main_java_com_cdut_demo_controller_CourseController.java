package com.cdut.demo.controller;


import com.cdut.demo.entity.Course;
import com.cdut.demo.service.Impl.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/operatecourse")
public class CourseController {
	@Autowired
	CourseServiceImpl courseServiceImpl;

	@RequestMapping("/getCourseByName")
	public List<Course> getCourseByCourse(@RequestParam("course_name") String course_name) {
		List<Course> courses = courseServiceImpl.getCourseByCourseName(course_name);
		return courses;
	}

	@RequestMapping("/getCourseByTeacherName")
	public List<Course> getCourseByTeacher(@RequestParam("teacher_name") String teacher_name) {
		List<Course> courses = courseServiceImpl.getCourseByTeacherName(teacher_name);
		return courses;
	}
	@RequestMapping("/getCourseByMajor")
	public List<Course> getCourseByMajor(@RequestParam("major_college_name") String major_college_name,@RequestParam("major_id") Long major_id ,@RequestParam("course_academic_year")int course_academic_year,@RequestParam("course_class_id")String course_class_id) {
		  return  courseServiceImpl.getCourseByMajor(major_college_name, major_id,course_academic_year,course_class_id);
	}


	@RequestMapping("/select/public/course")
	public List<Course> getCoursepubliccourse(@RequestParam("course_type") String course_type) {
		List<Course> courses = courseServiceImpl.getPublicClass(course_type);
		return courses;
	}

	@RequestMapping("add/new/course")
	public void addNewCourse(@RequestParam("course_name") String course_name, @RequestParam("course_id") String course_id) {
		courseServiceImpl.addNewCourse(course_id, course_name);
	}

	@RequestMapping("update/course/name")
	public void updateCourseName(@RequestParam("course_id") String course_id, @RequestParam("course_name") String course_name) {
		courseServiceImpl.updateCourseName(course_id, course_name);
	}

	@RequestMapping("update/course/date")
	public void updateCourseDate(@RequestParam("course_id") String course_id, @RequestParam("course_date") Date course_date) {
		courseServiceImpl.updateCourseDate(course_id, course_date);
	}

	@RequestMapping("update/course/position")
	public void updateCoursePosition(@RequestParam("course_id") String course_id, @RequestParam("course_position") String course_position,@RequestParam("course_date")Date course_date) {
		courseServiceImpl.updateCoursePosition(course_id, course_position,course_date);
	}

	@RequestMapping("update/course/teacher")
	public void updateCourseTeacher(@RequestParam("course_id") String course_id, @RequestParam("course_teacher_id") Long course_teacher_id) {
		courseServiceImpl.updateCourseTeacher(course_id, course_teacher_id);
	}

	@RequestMapping("update/course/plan_student_num")
	public void updateCoursePlanStudentNum(@RequestParam("course_id") String course_id, @RequestParam("course_plan_student_num") int course_plan_student_num) {
		courseServiceImpl.updateCoursePlanNumber(course_id, course_plan_student_num);
	}

	@RequestMapping("update/course/type")
	public void updateCourseType(@RequestParam("course_id") String course_id, @RequestParam("course_type") String course_type) {
		courseServiceImpl.updateCourseType(course_id, course_type);
	}
	@RequestMapping("update/course/credit")
	public void updateCourseType(@RequestParam("course_id") String course_id, @RequestParam("course_credit") Long course_credit) {
		courseServiceImpl.updateCourseCredit(course_id, course_credit);
	}

	@RequestMapping("update/course/remarks")
	public void updateCourseRemarks(@RequestParam("course_id") String course_id, @RequestParam("course_remarks") String course_remarks) {
		courseServiceImpl.updateCourseRemarks(course_id, course_remarks);
	}

	@RequestMapping("update/course/major_id")
	public void updateCourseMajor(@RequestParam("course_id") String course_id, @RequestParam("course_major_id") String course_major_id) {
		courseServiceImpl.updateCourseMajor(course_id, course_major_id);
	}

	@RequestMapping("update/course/class_id")
	public void updateCourseClass(@RequestParam("course_id") String course_id, @RequestParam("course_class_id") String course_class_id) {
		courseServiceImpl.updateCourseClass(course_id, course_class_id);
	}
	@RequestMapping("update/course/times")
	public void updateCourseTimes(@RequestParam("course_id") String course_id, @RequestParam("course_times") int course_times) {
		courseServiceImpl.updateCourseTimes(course_id, course_times);
	}
	@RequestMapping("delete/course")
	public void deleteCourse(@RequestParam("course_id") String course_id){
		courseServiceImpl.deleteCourse(course_id);
	}
}
