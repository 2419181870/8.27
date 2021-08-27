package com.cdut.demo.controller;


import com.cdut.demo.entity.Major;
import com.cdut.demo.service.Impl.MajorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("operatemajor")
public class MajorController {
	@Autowired
	MajorServiceImpl majorServiceImpl;

	@RequestMapping("/add/new/major")
	public void addNewMajor(@RequestParam("major_id") Long major_id, @RequestParam("major_name") String name) {
		majorServiceImpl.addNewMajor(major_id, name);
	}
	@RequestMapping("/find/major/by_id")
	public Major findMajorById(@RequestParam("major_id") Long id) {
		return  majorServiceImpl.findMajorById(id);
	}

	@RequestMapping("/find/major/by_name")
	public List<Major> findMajorByName(@RequestParam("major_name") String name,@RequestParam("major_level") String level) {
		return  majorServiceImpl.findMajorByName(name,level);
	}

	@RequestMapping("/delete/major/by_id")
	public String deleteMajorById(@RequestParam("major_id") Long id) {
		  return  majorServiceImpl.deleteMajor(id);
	}

	@RequestMapping("/update/major/name")
	public void updateMajorName(@RequestParam("major_id") Long major_id, @RequestParam("major_name") String name) {
		majorServiceImpl.updateMajorName(major_id, name);
	}

	@RequestMapping("/update/major/year")
	public void updateMajorYear(@RequestParam("major_id") Long major_id, @RequestParam("major_year") Long year) {
		majorServiceImpl.updateMajorYear(major_id, year);
	}

	@RequestMapping("/update/major/category")
	public void updateMajorCategory(@RequestParam("major_id") Long major_id, @RequestParam("major_category") String major_category) {
		majorServiceImpl.updateMajorCategory(major_id, major_category);
	}

	@RequestMapping("/update/major/level")
	public void updateMajorLevel(@RequestParam("major_id") Long major_id, @RequestParam("major_level") String level) {
		majorServiceImpl.updateMajorLevel(major_id, level);
	}

	@RequestMapping("/update/major/college_name")
	public void updateMajorCollege(@RequestParam("major_id") Long major_id, @RequestParam("major_college_name") String name) {
		majorServiceImpl.updateMajorCollege(major_id, name);
	}

	@RequestMapping("/update/major/student_num")
	public void updateMajorStudent(@RequestParam("major_id") Long major_id, @RequestParam("major_student_num") Long major_student_num) {
		majorServiceImpl.updateMajorStudentNum(major_id, major_student_num);
	}


}
