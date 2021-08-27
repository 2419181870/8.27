package com.cdut.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "college")
public class College implements Serializable {
	@Id
	private int id;
	/**
	 * 学院Id 学院名称 学院机构 学院简介
	 */
	@Column(name = "college_id")
	String college_id;
	@Column(name = "college_name")
	String college_name;
	@Column(name = "college_introduction")
	String college_introduction;
	@Column(name = "college_orgnization")
	String college_orgnization;

	public College(int id, String college_id, String college_name, String college_introduction, String college_orgnization) {
		this.id = id;
		this.college_id = college_id;
		this.college_name = college_name;
		this.college_introduction = college_introduction;
		this.college_orgnization = college_orgnization;
	}

	public College() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCollege_id() {
		return college_id;
	}

	public void setCollege_id(String college_id) {
		this.college_id = college_id;
	}

	public String getCollege_name() {
		return college_name;
	}

	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}

	public String getCollege_introduction() {
		return college_introduction;
	}

	public void setCollege_introduction(String college_introduction) {
		this.college_introduction = college_introduction;
	}

	public String getCollege_orgnization() {
		return college_orgnization;
	}

	public void setCollege_orgnization(String college_orgnization) {
		this.college_orgnization = college_orgnization;
	}
}
