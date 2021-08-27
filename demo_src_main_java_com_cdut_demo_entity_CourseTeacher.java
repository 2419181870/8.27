package com.cdut.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


public class CourseTeacher implements Serializable {
	@Id
	private int id;

	@Column(name = "course_id")
	String course_id;
	@Column(name = "course_name")
	String course_name;
	@Column(name = "course_teacher_id")
	Long course_teacher_id;
	@Column(name = "teacher_id")
	Long teacher_id;
	@Column(name = "course_times")
	int course_times;
	@Column(name = "course_student_nu")
	int course_student_num;
	@Column(name = "course_position")
	String course_position;
	@Column(name = "course_date")
	Date course_date;
	@Column(name = "course_planStudent_num")
	int course_planStudent_num;
	@Column(name = "course_type")
	String course_type;
	@Column(name = "course_credit")
	int course_credit;
	@Column(name = "course_majorId")
	String course_majorId;
	@Column(name = "course_classId")
	String course_classId;
	@Column(name = "course_remarks")
	String course_remarks;
	@Column(name = "teacher_name")
	String teacher_name;
	@Column(name = "teacher_sex")
	String teacher_sex;
	@Column(name = "teacher_age")
	int teacher_age;
	@Column(name = "teacher_teach_post")
	String teacher_teach_post;
	public CourseTeacher(){

	}
	public CourseTeacher(int id, String course_id, String course_name, Long course_teacher_id, Long teacher_id, int course_times, int course_student_num, String course_position, Date course_date, int course_planStudent_num, String course_type, int course_credit, String course_majorId, String course_classId, String course_remarks, String teacher_name, String teacher_sex, int teacher_age, String teacher_teach_post) {
		this.id = id;
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_teacher_id = course_teacher_id;
		this.teacher_id = teacher_id;
		this.course_times = course_times;
		this.course_student_num = course_student_num;
		this.course_position = course_position;
		this.course_date = course_date;
		this.course_planStudent_num = course_planStudent_num;
		this.course_type = course_type;
		this.course_credit = course_credit;
		this.course_majorId = course_majorId;
		this.course_classId = course_classId;
		this.course_remarks = course_remarks;
		this.teacher_name = teacher_name;
		this.teacher_sex = teacher_sex;
		this.teacher_age = teacher_age;
		this.teacher_teach_post = teacher_teach_post;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse_id() {
		return course_id;
	}

	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public Long getCourse_teacher_id() {
		return course_teacher_id;
	}

	public void setCourse_teacher_id(Long course_teacher_id) {
		this.course_teacher_id = course_teacher_id;
	}

	public Long getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(Long teacher_id) {
		this.teacher_id = teacher_id;
	}

	public int getCourse_times() {
		return course_times;
	}

	public void setCourse_times(int course_times) {
		this.course_times = course_times;
	}

	public int getCourse_student_num() {
		return course_student_num;
	}

	public void setCourse_student_num(int course_student_num) {
		this.course_student_num = course_student_num;
	}

	public String getCourse_position() {
		return course_position;
	}

	public void setCourse_position(String course_position) {
		this.course_position = course_position;
	}

	public Date getCourse_date() {
		return course_date;
	}

	public void setCourse_date(Date course_date) {
		this.course_date = course_date;
	}

	public int getCourse_planStudent_num() {
		return course_planStudent_num;
	}

	public void setCourse_planStudent_num(int course_planStudent_num) {
		this.course_planStudent_num = course_planStudent_num;
	}

	public String getCourse_type() {
		return course_type;
	}

	public void setCourse_type(String course_type) {
		this.course_type = course_type;
	}

	public int getCourse_credit() {
		return course_credit;
	}

	public void setCourse_credit(int course_credit) {
		this.course_credit = course_credit;
	}

	public String getCourse_majorId() {
		return course_majorId;
	}

	public void setCourse_majorId(String course_majorId) {
		this.course_majorId = course_majorId;
	}

	public String getCourse_classId() {
		return course_classId;
	}

	public void setCourse_classId(String course_classId) {
		this.course_classId = course_classId;
	}

	public String getCourse_remarks() {
		return course_remarks;
	}

	public void setCourse_remarks(String course_remarks) {
		this.course_remarks = course_remarks;
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
}
