package com.cdut.demo;


import com.cdut.demo.entity.Major;
import com.cdut.demo.mapper.MajorMapper;
import com.cdut.demo.mapper.StudentServiceModularMapper;
import com.cdut.demo.service.Impl.StudentLoginImpl;
import com.cdut.demo.service.Impl.StudentServiceModularServiceImpl;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	StudentServiceModularServiceImpl studentServiceModularService;
	@Autowired
	StudentServiceModularMapper modularMapper;
	@Autowired
	StudentLoginImpl studentLogin;
	@Autowired
	MajorMapper majorMapper;
	private static final Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

	@Test
	public void entityLinkedTest(){
	System.out.println(studentServiceModularService.getAllStudentServiceModoular());
	}
	@Test
	public void loginTest(){
		String password="12345";
		Long student_id=241918187L;
		studentLogin.LoginJudge(student_id,password);
	}
}
