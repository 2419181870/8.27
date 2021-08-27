package com.cdut.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher {
	@Id
	private int id;
	/**
	 * 专业Id(Long) 专业名称(String) 专业学年(int) 招生数量(int) 学科门类(String)
	 */
	@Column(name = "teacher_id")
	String teacher_id;
	@Column(name = "teacher_name")
	String teacher_name;
	@Column(name = "teacher_sex")
	String teacher_sex;
	@Column(name = "teacher_age")
	int teacher_age;
	@Column(name = "teacher_teach_post")
	String teacher_teach_post;
	@Column(name = "teacher_department")
	int teacher_department;
	@Column(name = "teacher_remarks")
	String teacher_remarks;
	@Column(name = "teacher_course_id")
	String teacher_course_id;

	public Teacher() {

	}

	public Teacher(int id, String teacher_id, String teacher_name, String teacher_sex, int teacher_age, String teacher_teach_post, int teacher_department, String teacher_remarks, String teacher_course_id) {
		this.id = id;
		this.teacher_id = teacher_id;
		this.teacher_name = teacher_name;
		this.teacher_sex = teacher_sex;
		this.teacher_age = teacher_age;
		this.teacher_teach_post = teacher_teach_post;
		this.teacher_department = teacher_department;
		this.teacher_remarks = teacher_remarks;
		this.teacher_course_id = teacher_course_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}

	public String getTeacher_name() {
		return teacher_name;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	public String getTeacher_sex() {
		return teacher_sex;
	}

	public void setTeacher_sex(String teacher_sex) {
		this.teacher_sex = teacher_sex;
	}

	public int getTeacher_age() {
		return teacher_age;
	}

	public void setTeacher_age(int teacher_age) {
		this.teacher_age = teacher_age;
	}

	public String getTeacher_teach_post() {
		return teacher_teach_post;
	}

	public void setTeacher_teach_post(String teacher_teach_post) {
		this.teacher_teach_post = teacher_teach_post;
	}

	public int getTeacher_department() {
		return teacher_department;
	}

	public void setTeacher_department(int teacher_department) {
		this.teacher_department = teacher_department;
	}

	public String getTeacher_remarks() {
		return teacher_remarks;
	}

	public void setTeacher_remarks(String teacher_remarks) {
		this.teacher_remarks = teacher_remarks;
	}

	public String getTeacher_course_id() {
		return teacher_course_id;
	}

	public void setTeacher_course_id(String teacher_course_id) {
		this.teacher_course_id = teacher_course_id;
	}
}
