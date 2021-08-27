package com.cdut.demo.controller;

import com.cdut.demo.entity.Classroom;
import com.cdut.demo.service.Impl.ClassroomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/classroom")
public class ClassroomController {
	@Autowired
	ClassroomServiceImpl classroomServiceImpl;

	@RequestMapping("/find/by_name")
	public List<Classroom> getClassroomByName(@RequestParam("classroom_name") String classroom_name) {
		return classroomServiceImpl.getClassroomByName(classroom_name);
	}

	@RequestMapping("/find/by_id")
	public Classroom getClassroomById(@RequestParam("classroom_id") String classroom_id) {
		return classroomServiceImpl.getClassById(classroom_id);
	}

	@RequestMapping("/find/by_campus")
	public List<Classroom> getClassroomByCampus(@RequestParam("classroom_campus") String classroom_campus) {
		return classroomServiceImpl.getClassroomByCampus(classroom_campus);
	}

	@RequestMapping("/find/by_management")
	public List<Classroom> getClassroomByManagement(@RequestParam("classroom_management") String classroom_management) {
		return classroomServiceImpl.getClassroomByManagement(classroom_management);
	}

	@RequestMapping("/find/by_type")
	public List<Classroom> getClassroomByType(@RequestParam("classroom_type") String classroom_type) {
		return classroomServiceImpl.getClassroomByType(classroom_type);
	}
}
