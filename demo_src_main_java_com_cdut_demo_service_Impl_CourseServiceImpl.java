package com.cdut.demo.service.Impl;

import com.cdut.demo.entity.Course;
import com.cdut.demo.entity.CourseTeacher;
import com.cdut.demo.mapper.CourseMajorMapper;
import com.cdut.demo.mapper.CourseMapper;
import com.cdut.demo.mapper.CourseTeacherMapper;
import com.cdut.demo.service.CourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	CourseMapper courseMapper;
	@Autowired
	CourseTeacherMapper courseTeacherMapper;
	@Autowired
	CourseMajorMapper courseMajorMapper;
	private static final Logger logger = LoggerFactory.getLogger(CourseServiceImpl.class);

	/**
	 * 新开课程
	 */
	@Override
	public void addNewCourse(String course_id, String course_name) {
		//courseId 不能重复 只有不存在该Id的，可以新添加
		if (IsExsit(course_id)) {
			courseMapper.addNewCourse(course_id, course_name);
		}
	}

	/**
	 * 选课，返回选课状态
	 */
	@Override
	public int selectCourse(String course_id) {
		if (IsExsit(course_id)) {
			Course course = courseMapper.getCourseById(course_id).get(0);
			if (course.getCourse_student_num() < course.getCourse_planStudent_num()) {
				courseMapper.updateCourseStudentNumById(course_id, course.getCourse_student_num() + 1);
				logger.info("选课成功");
				return 1;
			}
			if (course.getCourse_student_num() == course.getCourse_planStudent_num()) {
				logger.info("选课已满");
				return 2;
			}
			logger.info("选课失败");
			return 3;
		}
		logger.info("没有该课程");
		return 4;
	}

	/**
	 * 按课程名称，模糊查询课程
	 */
	public List<Course> getCourseByCourseName(String course_name) {
		List<Course> courseList = courseMapper.getCourseByName(course_name);
		return courseList;
	}

	/**
	 * 按教师名称，模糊查询课程
	 */
	public List<Course> getCourseByTeacherName(String teacher_name) {
		List<Course> courseList = courseTeacherMapper.getCourseByTeacherName(teacher_name);
		return courseList;
	}

	/**
	 * 获取所有课程类型为 计划课,公共选修课的课程
	 */
	public List<Course> getPublicClass(String course_type) {
		List<Course> courseList = courseMapper.getCourseByType(course_type);
		return courseList;
	}

	/**
	 * 根据专业查询课程，需要院系名称，专业Id ,课程学年，班级Id
	 */
	public List<Course> getCourseByMajor(String major_college_name, Long major_id,int course_academic_year,String course_class_id) {
		return courseMajorMapper.getCourseByMajor(major_id, major_college_name,course_academic_year,course_class_id);
	}

	/**
	 * 根据课程Id获取课程
	 */

	public List<Course> getCourseById(String id) {
		return courseMapper.getCourseById(id);
	}


	/**
	 * 更新课程名称
	 */
	public void updateCourseName(String course_id, String course_name) {
		if (IsExsit(course_id)) {
			courseMapper.updateCourseNameById(course_id, course_name);
		}
	}

	/**
	 * 更新课程教师
	 */
	public void updateCourseTeacher(String course_id, Long course_teacher_id) {
		if (IsExsit(course_id)) {
			courseMapper.updateCourseTeacherById(course_id, course_teacher_id);
		}
	}

	/**
	 * 更新课程上课地点
	 */
	public void updateCoursePosition(String course_id, String course_position,Date course_date) {
//		if (IsExsit(course_id)) {
			courseMapper.updateCoursePositionById(course_id, course_position,course_date);
//		}
	}

	/**
	 * 更新课程日期
	 */
	public void updateCourseDate(String course_id, Date course_date) {
		if (IsExsit(course_id)) {
			courseMapper.updateCourseDayById(course_id, course_date);
		}
	}

	/**
	 * 更新课程最大人数
	 */
	public void updateCoursePlanNumber(String course_id, int course_planStudent_num) {
		if (IsExsit(course_id)) {
			courseMapper.updateCoursePlanStudentNumById(course_id, course_planStudent_num);
		}
	}

	/**
	 * 判断该是否有课程Id
	 */

	public boolean IsExsit(String course_id) {
		if (getCourseById(course_id)== null) {
			return false;
		}
		return true;
	}

	/**
	 * 更新课程类型
	 */
	public void updateCourseType(String course_id, String course_type) {
		if (IsExsit(course_id)) {
			courseMapper.updateCourseTypeById(course_id, course_type);
		}
	}

	/**
	 * 更新课程学分
	 */
	public void updateCourseCredit(String course_id, Long course_credit) {
		if (IsExsit(course_id)) {
			courseMapper.updateCourseCreditById(course_id, course_credit);
		}
	}

	/**
	 * 更新课程备注
	 */
	public void updateCourseRemarks(String course_id, String course_remarks) {
		if (IsExsit(course_id)) {
			courseMapper.updateCourseRemarksById(course_id, course_remarks);
		}
	}

	/**
	 * 更新课程班级字符串
	 */
	public void updateCourseClass(String course_id, String course_class_id) {
		if (IsExsit(course_id)) {
			courseMapper.updateCourseClassById(course_id, course_class_id);
		}
	}

	/**
	 * 更新课程所属专业
	 */
	public void updateCourseMajor(String course_id, String course_major_id) {
		if (IsExsit(course_id)) {
			courseMapper.updateCourseMajorsById(course_id, course_major_id);
		}
	}

	/**
	 * 更新课程节数
	 */
	public void updateCourseTimes(String course_id, int course_times) {
		if (IsExsit(course_id)) {
			courseMapper.updateCourseTimesById(course_id, course_times);
		}
	}

	/**
	 * 删除课程
	 */
	@Transactional
	public void deleteCourse(String course_id) {
		if (IsExsit(course_id)) {
			courseMapper.deleteCourseById(course_id);
		}
	}


}
