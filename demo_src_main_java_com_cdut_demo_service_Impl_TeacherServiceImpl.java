package com.cdut.demo.service.Impl;

import com.cdut.demo.entity.Teacher;
import com.cdut.demo.mapper.TeacherMapper;
import com.cdut.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	TeacherMapper teacherMapper;

	/**
	 * 筛选出该部门的教职工
	 */
	public List<Teacher> getTeacherByDepartment(int teacher_depart){
		return  teacherMapper.getTeacherByDepartment(teacher_depart);
	}
	/**
	 * 筛选出符合查询名字的 的该部门教职工
	 */
	public List<Teacher> getTeacherByDepartmentAndName(int teacher_depart,String name){
		return  teacherMapper.getTeacherByDepartmentAndName(teacher_depart,name);
	}
}
