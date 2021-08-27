package com.cdut.demo.controller;

import com.cdut.demo.entity.Course;
import com.cdut.demo.entity.Student;
import com.cdut.demo.service.Impl.StudentLoginImpl;
import com.cdut.demo.util.JwtUtil;
import com.github.benmanes.caffeine.cache.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCache;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/aao.cdut.edu.cn")
public class StudentLoginController {

	@Autowired
	StudentLoginImpl studentLogin;

	@RequestMapping(value = "/studentLogin", method = RequestMethod.GET)
	public String studentLogin(@RequestParam("student_id") Long student_id, @RequestParam("password") String password) {
		String str = "?";
		switch (studentLogin.LoginJudge(student_id, password)) {
			case 1:
				str = "登录成功";
				break;
			case -1:
				str = "密码不正确";
				break;
			case -2:
				str = "账户不存在";
				break;
			default:
				str = "出问题了,请重试";
				break;
		}
		return str;
	}

	@GetMapping("/stats")
	public void stats() {
		studentLogin.stats();
	}

	@GetMapping("/find/student/name")
	public String getStudentName(@RequestParam("student_id") Long student_id) {
		return studentLogin.getStudentName(student_id);
	}

	@GetMapping("/find/student/picture")
	public String getStudentPicture(@RequestParam("student_id") Long student_id) {
		return studentLogin.getStudentPicture(student_id);
	}

	@GetMapping("/find/student/major")
	public String getStudentMajor(@RequestParam("student_id") Long student_id) {
		return studentLogin.getStudentMajor(student_id);
	}

	@GetMapping("/find/student/college")
	public String getStudentCollege(@RequestParam("student_id") Long student_id) {
		return studentLogin.getStudentCollege(student_id);
	}
	@GetMapping("/find/student/sex")
	public String getStudentSex(@RequestParam("student_id") Long student_id) {
		return studentLogin.getStudentSex(student_id);
	}
	@GetMapping("/find/student/age")
	public int getStudentAge(@RequestParam("student_id") Long student_id) {
		return studentLogin.getStudentAge(student_id);
	}

	@PostMapping(value = "/login")
	public Map<String, Object> login(@RequestParam("id") Long id, @RequestParam("password") String password) {
		Map<String, Object> map = new HashMap<>();
		// 省略 账号密码验证
		int i = studentLogin.LoginJudge(id, password);
		if (i == 1) {
			// 验证成功后发送token
			String token = JwtUtil.sign(id, password);
			if (token != null) {
				map.put("code", "200");
				map.put("message", "认证成功");
				map.put("token", token);
				return map;
			}
		} else {
			map.put("code", "403");
			map.put("message", "认证失败");
			return map;
		}
		return map;
	}

	@RequestMapping("select/course")
	public List<Course> getPersonCourse(@RequestParam("student_id") Long student_id) {
		return studentLogin.getStudentCourse(student_id);
	}

	@RequestMapping("select/course/timetable")
	public List<String> getPersonCourseTimeTable(@RequestParam("student_id") Long student_id) {
		return studentLogin.getStuentCourseTimeTable(student_id);
	}
}
