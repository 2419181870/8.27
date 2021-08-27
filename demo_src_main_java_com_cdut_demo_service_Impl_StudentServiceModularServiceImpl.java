package com.cdut.demo.service.Impl;

import com.cdut.demo.entity.StudentServiceModular;
import com.cdut.demo.mapper.StudentServiceModularMapper;
import com.cdut.demo.service.StudentServiceModularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@EnableCaching
public class StudentServiceModularServiceImpl implements StudentServiceModularService {
	@Autowired
	StudentServiceModularMapper studentServiceModularMapper;

	/**
	 * 获取所有的模块信息
	 * @return
	 */
	@Override
	public List<StudentServiceModular> getAllStudentServiceModoular() {
		return    studentServiceModularMapper.getStudentService();
	}

	/**
	 * 增加学生服务新模块(管理员)
	 */
	public void setNewServiceModular(int id,String name,int ser_id){
	}
}
