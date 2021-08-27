package com.cdut.demo.service.Impl;

import com.cdut.demo.entity.Course;
import com.cdut.demo.entity.Student;
import com.cdut.demo.mapper.StudentLoginMapper;
import com.cdut.demo.service.StudentLogin;
import com.github.benmanes.caffeine.cache.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCache;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

@Service
@EnableCaching

public class StudentLoginImpl implements StudentLogin {
	@Autowired
	RedisTemplate redisTemplate;
	@Autowired
	CacheManager cacheManager;
	@Autowired
	StudentLoginMapper studentLoginMapper;
	@Autowired
	CourseServiceImpl courseServiceImpl;


	public void stats() {
		CaffeineCache caffeine = (CaffeineCache) cacheManager.getCache("SecondCache");
		Cache cache = caffeine.getNativeCache();
		Long size = cache.estimatedSize();
		ConcurrentMap map = cache.asMap();
		System.out.println("Cache数量：" + size);
		for (Object object : map.keySet()) {
			String cacheName = object.toString();
			System.out.println("key：" + cacheName);
		}
	}

	/**
	 * 登陆验证
	 *
	 * @param student_id
	 * @param password
	 * @return
	 */
	@Override
	@CacheEvict(value = "SecondCache", key = "#student_id")
	public int LoginJudge(Long student_id, String password) {
		Student student = (Student) redisTemplate.opsForHash().get(student_id + "", student_id + "");
		//在缓存中找不到该student的信息时，在数据库中找
		if (student == null) {
			student = studentLoginMapper.getStudentById(student_id).get(0);
			if (student != null) {
				//查询到后存入redis中
				redisTemplate.opsForHash().put(student_id + "", student_id + "", student);
				//在1小时候释放，减少资源消耗
				redisTemplate.expire("search:" + student_id, 60, TimeUnit.SECONDS);
				if (student.getStudent_password().equals(password)) {
					System.out.println("验证成功");
					return 1;
				} else {
					System.out.println("密码不正确");
					//密码不正确清除,在10分钟redis中的缓存过期
					redisTemplate.expire("search:" + student_id, 30, TimeUnit.SECONDS);
					return -1;
				}
			} else {
				System.out.println("该用户不存在");
				return -2;
			}
		} else if (student != null) {
			//这里比较只能用equals
			if (student.getStudent_password().equals(password)) {
				System.out.println("登陆成功");
				return 1;
			} else if (!student.getStudent_password().equals(password)) {
				System.out.println("密码不正确");
				return -1;
			}
		}
		return 3;
	}

	/**
	 * 登录界面后的我的信息
	 *
	 * @param student_id
	 * @return
	 */
	@CacheEvict(value = "SecondCache", key = "#student_id")
	public String getStudentName(Long student_id) {
		Student student = (Student) redisTemplate.opsForHash().get("" + student_id, student_id + "");
		return student.getStudent_name();
	}

	/**
	 * 获取个人信息
	 */
	@Override
	public String getStudentPassword(Long id) {
		return studentLoginMapper.getStudentById(id).get(0).getStudent_password();
	}

	public String getStudentSex(Long id) {
		return studentLoginMapper.getStudentById(id).get(0).getStudent_sex();
	}

	public int getStudentAge(Long id) {
		return studentLoginMapper.getStudentById(id).get(0).getStudent_age();
	}

	@Override
	public String getStudentMajor(Long id) {
		return studentLoginMapper.getStudentById(id).get(0).getStudent_major();
	}

	@Override
	public String getStudentCollege(Long id) {
		return studentLoginMapper.getStudentById(id).get(0).getStudent_college();
	}

	@Override
	public String getStudentPicture(Long id) {
		return studentLoginMapper.getStudentById(id).get(0).getPicture_id();
	}


	public List<Course> getStudentCourse(Long student_id) {
		List<Course> courseList = new ArrayList<>();
		List<Student> studentList = studentLoginMapper.getStudentById(student_id);
		String course_id = studentList.get(0).getCourse_Id();
		String[] parts = course_id.split("-");
		for (int i = 0; i < parts.length; i++) {
			String course_id_new = parts[i].toString();
			if (!courseServiceImpl.getCourseById(course_id_new).isEmpty()) {
				Course course = courseServiceImpl.getCourseById(course_id_new).get(0);
				courseList.add(course);
			}
		}
		return courseList;
	}

	public List<String> getStuentCourseTimeTable(Long student_id) {
		List<String> timeTable = new ArrayList<>();
		List<Student> studentList = studentLoginMapper.getStudentById(student_id);
		String course_id = "", postion = "", time = "", date = "",name="";
		if (!studentList.isEmpty()) {
			course_id = studentList.get(0).getCourse_Id();
		}
		String[] parts = course_id.split("-");
		for (int i = 0; i < parts.length; i++) {
			String course_id_new = parts[i].toString();
			List<Course> courseList = courseServiceImpl.getCourseById(course_id_new);
			if (!courseList.isEmpty()) {
				for (int j = 0; j < courseList.size(); j++) {
					postion = courseList.get(j).getCourse_position();
					name=courseList.get(j).getCourse_name();
					time = courseList.get(j).getCourse_time() + "";
					date = courseList.get(j).getCourse_date() + "";
					String str = name+" "+postion +" "+ time+" " + date;
					timeTable.add(str);
				}
			}


		}
		return timeTable;

	}
}
