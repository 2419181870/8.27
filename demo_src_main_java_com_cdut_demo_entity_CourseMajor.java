package com.cdut.demo.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class CourseMajor {
	@Id
	private int id;
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
	@Column(name = "course_position")
	String course_position;
	@Column(name = "course_date")
	Date course_date;
	@Column(name = "course_planStudent_num")
	int course_planStudent_num;
	@Column(name = "course_type")
	String course_type;
	@Column(name = "course_credit")
	Long course_credit;
	@Column(name = "course_major_id")
	String course_major_id;
	@Column(name = "course_class_id")
	String course_class_id;
	@Column(name = "course_remarks")
	String course_remarks;
	@Column(name = "course_academic_year")
	int course_academic_year;
	@Column(name = "major_id")
	Long major_id;
	@Column(name = "major_name")
	String major_name;
	@Column(name = "major_year")
	Long major_year;
	@Column(name = "major_student_num")
	Long major_student_num;
	@Column(name = "major_category")
	String major_category;
	@Column(name = "major_level")
	String major_level;
	@Column(name = "major_college_name")
	String major_college_name;

	public CourseMajor() {

	}

	public CourseMajor(int id, String course_id, String course_name, Long course_teacher_id, int course_times, int course_student_num, String course_position, Date course_date, int course_planStudent_num, String course_type, Long course_credit, String course_major_id, String course_class_id, String course_remarks, int course_academic_year, Long major_id, String major_name, Long major_year, Long major_student_num, String major_category, String major_level, String major_college_name) {
		this.id = id;
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_teacher_id = course_teacher_id;
		this.course_times = course_times;
		this.course_student_num = course_student_num;
		this.course_position = course_position;
		this.course_date = course_date;
		this.course_planStudent_num = course_planStudent_num;
		this.course_type = course_type;
		this.course_credit = course_credit;
		this.course_major_id = course_major_id;
		this.course_class_id = course_class_id;
		this.course_remarks = course_remarks;
		this.course_academic_year = course_academic_year;
		this.major_id = major_id;
		this.major_name = major_name;
		this.major_year = major_year;
		this.major_student_num = major_student_num;
		this.major_category = major_category;
		this.major_level = major_level;
		this.major_college_name = major_college_name;
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

	public Long getCourse_credit() {
		return course_credit;
	}

	public void setCourse_credit(Long course_credit) {
		this.course_credit = course_credit;
	}

	public String getCourse_major_id() {
		return course_major_id;
	}

	public void setCourse_major_id(String course_major_id) {
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

	public Long getMajor_id() {
		return major_id;
	}

	public void setMajor_id(Long major_id) {
		this.major_id = major_id;
	}

	public String getMajor_name() {
		return major_name;
	}

	public void setMajor_name(String major_name) {
		this.major_name = major_name;
	}

	public Long getMajor_year() {
		return major_year;
	}

	public void setMajor_year(Long major_year) {
		this.major_year = major_year;
	}

	public Long getMajor_student_num() {
		return major_student_num;
	}

	public void setMajor_student_num(Long major_student_num) {
		this.major_student_num = major_student_num;
	}

	public String getMajor_category() {
		return major_category;
	}

	public void setMajor_category(String major_category) {
		this.major_category = major_category;
	}

	public String getMajor_level() {
		return major_level;
	}

	public void setMajor_level(String major_level) {
		this.major_level = major_level;
	}

	public String getMajor_college_name() {
		return major_college_name;
	}

	public void setMajor_college_name(String major_college_name) {
		this.major_college_name = major_college_name;
	}
}

