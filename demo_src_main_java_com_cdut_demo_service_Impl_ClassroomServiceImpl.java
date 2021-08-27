package com.cdut.demo.service.Impl;


import com.cdut.demo.entity.Classroom;
import com.cdut.demo.mapper.ClassroomMapper;
import com.cdut.demo.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomServiceImpl implements ClassroomService {

	@Autowired
	ClassroomMapper classroomMapper;
	/**
	 * 根据教室Id获取教室
	 */
	public Classroom getClassById(String id){
		return  classroomMapper.findclassroomById(id);
	}

	/**
	 * 根据名称模糊查询教室
	 */
	public List<Classroom> getClassroomByName(String name) {
		return classroomMapper.findclassroomByName(name);
	}

	/**
	 * 查询所属校区教室
	 */
	public List<Classroom> getClassroomByCampus(String campus) {
		return classroomMapper.findclassroomBySchoolCampus(campus);
	}

	/**
	 * 查询所属教学楼的教室
	 */
	public List<Classroom> getClassroomByVenue(String venue) {
		return classroomMapper.findclassroomByVenue(venue);
	}

	/**
	 * 查询符合类型的教室
	 */
	public List<Classroom> getClassroomByType(String type) {
		return classroomMapper.findclassroomByType(type);
	}

	/**
	 * 查询部门管理下的教室
	 */
	public List<Classroom> getClassroomByManagement(String management) {
		return classroomMapper.findclassroomByName(management);
	}

	/**
	 * 设置教室是否被使用
	 */
	public void setClassroomUsed(String classroom_id,Boolean classroom_used){
		classroomMapper.setClassroomUsed(classroom_id,classroom_used);
	}

}
