package com.cdut.demo.controller;

import com.cdut.demo.entity.Teacher;
import com.cdut.demo.service.Impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/teacher")
@RestController
public class TeacherController {
	@Autowired
	TeacherServiceImpl teacherServiceImpl;
	@RequestMapping("/find/department")
	public List<Teacher> getDepartMentTeacher(@RequestParam("teacher_department")int teacher_department){
		return  teacherServiceImpl.getTeacherByDepartment(teacher_department);
	}

	@RequestMapping("/find/department/name")
	public List<Teacher> getDepartMentTeacherByName(@RequestParam("teacher_department")int teacher_department,@RequestParam("teacher_name") String teacher_name){
		return  teacherServiceImpl.getTeacherByDepartmentAndName(teacher_department,teacher_name);
	}
}
