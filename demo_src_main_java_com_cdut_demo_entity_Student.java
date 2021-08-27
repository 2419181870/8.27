package com.cdut.demo.entity;

import org.omg.CORBA.portable.IDLEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "student")
public class Student implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/**
	 * 学号Id
	 */
	@Column(name = "student_id")
	private Long student_id;

	/**
	 * 学生姓名
	 */
	@Column(name = "student_name")
	private String student_name;

	/**
	 * 年龄
	 */
	@Column(name = "student_age")
	private Integer student_age;

	/**
	 * 密码
	 */
	@Column(name = "student_password")
	private String student_password;

	/**
	 * 性别
	 */
	@Column(name = "student_sex")
	private String student_sex;

	/**
	 * 院系Id
	 */
	@Column(name = "student_college")
	private String student_college;

	/**
	 * 专业Id
	 */
	@Column(name = "student_major")
	private String student_major;

	/**
	 * 所选课程Id 课程Id拼接成字符串
	 */
	@Column(name = "course_Id")
	private String course_Id;

	/**
	 * 学生照片地址
	 */
	@Column(name = "picture_id")
	private String picture_id;

	public Student() {
	}

	public Student(int id, Long student_id, String student_name, Integer student_age, String student_password, String student_sex, String student_college, String student_major, String course_Id, String picture_id) {
		this.id = id;
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_age = student_age;
		this.student_password = student_password;
		this.student_sex = student_sex;
		this.student_college = student_college;
		this.student_major = student_major;
		this.course_Id = course_Id;
		this.picture_id = picture_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Long student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public Integer getStudent_age() {
		return student_age;
	}

	public void setStudent_age(Integer student_age) {
		this.student_age = student_age;
	}

	public String getStudent_password() {
		return student_password;
	}

	public void setStudent_password(String student_password) {
		this.student_password = student_password;
	}

	public String getStudent_sex() {
		return student_sex;
	}

	public void setStudent_sex(String student_sex) {
		this.student_sex = student_sex;
	}

	public String getStudent_college() {
		return student_college;
	}

	public void setStudent_college(String student_college) {
		this.student_college = student_college;
	}

	public String getStudent_major() {
		return student_major;
	}

	public void setStudent_major(String student_major) {
		this.student_major = student_major;
	}

	public String getCourse_Id() {
		return course_Id;
	}

	public void setCourse_Id(String course_Id) {
		this.course_Id = course_Id;
	}

	public String getPicture_id() {
		return picture_id;
	}

	public void setPicture_id(String picture_id) {
		this.picture_id = picture_id;
	}
}





