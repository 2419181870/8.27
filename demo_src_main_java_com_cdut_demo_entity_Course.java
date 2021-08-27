package com.cdut.demo.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "course")
public class Course implements Serializable {
	@Id
	private int id;
	/**
	 * 课程号(String) 课程名称(String) 教师Id(int),教师可能重名  课程节数(int) 已选人数(int) 课程所在教室(String) 课程上课时间(Date) 计划人数(int)
	 * 课程类型(String) 课程学分(int) 课程所属专业Id(String) 课程教学年纪(int) 课程班级 课程备注(String)
	 */
	@Column(name = "course_id")
	String course_id;
	@Column(name = "course_name")
	String course_name;
	@Column(name = "course_teacher_id")
	Long course_teacher_id;
	@Column(name = "course_times")
	int course_times;
	@Column(name = "course_student_num")
	int course_student_num;
	/**
	 * 储存course  日期-第几节课-教室位置
	 */
	@Column(name = "course_date")
	Date course_date;
	@Column(name = "course_position")
	String course_position;
	@Column(name = "course_time")
	int course_time;
	@Column(name = "course_planStudent_num")
	int course_planStudent_num;
	@Column(name = "course_type")
	String course_type;
	@Column(name = "course_credit")
	Long course_credit;
	@Column(name = "course_major_id")
	Long course_major_id;
	@Column(name = "course_class_id")
	String course_class_id;
	@Column(name = "course_remarks")
	String course_remarks;
	@Column(name = "course_academic_year")
	int course_academic_year;


	public Course() {


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

	public Date getCourse_date() {
		return course_date;
	}

	public void setCourse_date(Date course_date) {
		this.course_date = course_date;
	}

	public String getCourse_position() {
		return course_position;
	}

	public void setCourse_position(String course_position) {
		this.course_position = course_position;
	}

	public int getCourse_time() {
		return course_time;
	}

	public void setCourse_time(int course_time) {
		this.course_time = course_time;
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

	public Long getCourse_credit() {
		return course_credit;
	}

	public void setCourse_credit(Long course_credit) {
		this.course_credit = course_credit;
	}

	public Long getCourse_major_id() {
		return course_major_id;
	}

	public void setCourse_major_id(Long course_major_id) {
		this.course_major_id = course_major_id;
	}

	public String getCourse_class_id() {
		return course_class_id;
	}

	public void setCourse_class_id(String course_class_id) {
		this.course_class_id = course_class_id;
	}

	public String getCourse_remarks() {
		return course_remarks;
	}

	public void setCourse_remarks(String course_remarks) {
		this.course_remarks = course_remarks;
	}

	public int getCourse_academic_year() {
		return course_academic_year;
	}

	public void setCourse_academic_year(int course_academic_year) {
		this.course_academic_year = course_academic_year;
	}

	public Course(int id, String course_id, String course_name, Long course_teacher_id, int course_times, int course_student_num, Date course_date, String course_position, int course_time, int course_planStudent_num, String course_type, Long course_credit, Long course_major_id, String course_class_id, String course_remarks, int course_academic_year) {
		this.id = id;
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_teacher_id = course_teacher_id;
		this.course_times = course_times;
		this.course_student_num = course_student_num;
		this.course_date = course_date;
		this.course_position = course_position;
		this.course_time = course_time;
		this.course_planStudent_num = course_planStudent_num;
		this.course_type = course_type;
		this.course_credit = course_credit;
		this.course_major_id = course_major_id;
		this.course_class_id = course_class_id;
		this.course_remarks = course_remarks;
		this.course_academic_year = course_academic_year;
	}
}
