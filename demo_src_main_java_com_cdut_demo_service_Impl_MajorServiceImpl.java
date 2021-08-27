package com.cdut.demo.service.Impl;

import com.cdut.demo.entity.Major;
import com.cdut.demo.mapper.MajorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MajorServiceImpl {
	@Autowired
	MajorMapper majorMapper;

	/**
	 * 添加新专业，专业ID不重复
	 */
	public void addNewMajor(Long major_id, String major_name) {
		majorMapper.addNewMajor(major_id, major_name);
	}
	/**
	 * 通过专业名称查询专业
	 */
	public List<Major> findMajorByName(String name,String level) {
		return  majorMapper.getMajorByName(name,level);
	}

	/**
	 * 获得major_id对应专业
	 */
	public Major findMajorById(Long id){
		return majorMapper.getMajorById(id);
	}

	/**
	 * 判断该专业是否存在
	 */

	public boolean IsExsit(Long major_id) {
		if (findMajorById(major_id)==null) {
			return false;
		}
		return true;
	}
	/**
	 * 删除该专业
	 */
	public String deleteMajor(Long id){
		if(IsExsit(id)) {
			majorMapper.deleteMajorById(id);
			return "已删除";
		}
		return "该专业不存在";
	}

	/**
	 * 更新专业名称
	 */
	public void updateMajorName(Long major_id, String major_name) {
		majorMapper.updateMajorName(major_name, major_id);
	}

	/**
	 * 更新专业年限
	 */
	public void updateMajorYear(Long major_id, Long major_year) {
		majorMapper.updateMajorYear(major_year, major_id);
	}

	/**
	 * 更新专业学科门类
	 */
	public void updateMajorCategory(Long major_id, String major_category) {
		majorMapper.updateMajorCategory(major_category, major_id);
	}

	/**
	 * 更新专业学生数量
	 */
	public void updateMajorStudentNum(Long major_id, Long major_student_num) {
		majorMapper.updateMajorStudentNumber(major_student_num, major_id);
	}

	/**
	 * 更新专业所属本/专科
	 */

	public void updateMajorLevel(Long major_id, String major_level) {
		majorMapper.updateMajorLevel(major_level, major_id);
	}

	/**
	 * 更新专业所属学院
	 */

	public void updateMajorCollege(Long major_id, String major_college_name) {
		majorMapper.updateMajorCollege(major_college_name, major_id);
	}


}
