package com.cdut.demo.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "major")
public class Major implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	/**
	 * 专业Id(Long) 专业名称(String) 专业学年(int) 招生数量(int) 学科门类(String)
	 */
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
	@Column(name="major_level")
	String major_level;
	@Column(name="major_college_name")
	String major_college_name;
	public Major(){

	}
	public Major(int id, Long major_id, String major_name, Long major_year, Long major_student_num, String major_category) {
		this.id = id;
		this.major_id = major_id;
		this.major_name = major_name;
		this.major_year = major_year;
		this.major_student_num = major_student_num;
		this.major_category = major_category;
	}

	public Major(int id, Long major_id, String major_name, Long major_year, Long major_student_num, String major_category, String major_level, String major_college_name) {
		this.id = id;
		this.major_id = major_id;
		this.major_name = major_name;
		this.major_year = major_year;
		this.major_student_num = major_student_num;
		this.major_category = major_category;
		this.major_level = major_level;
		this.major_college_name = major_college_name;
	}

	@Override
	public String toString() {
		return "Major::" +
				"id=" + id +
				", major_id=" + major_id +
				", major_name='" + major_name + '\'' +
				", major_year=" + major_year +
				", major_student_num=" + major_student_num +
				", major_category='" + major_category + '\'' +
				", major_level='" + major_level + '\'' +
				", major_college_name='" + major_college_name + '\'';
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
}
