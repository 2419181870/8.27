package com.cdut.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Classroom {
	@Id
	private int id;
	@Column(name = "classroom_id")
	String classroom_id;
	@Column(name = "classroom_name")
	String classroom_name;
	@Column(name = "classroom_exam_capacity")
	int classroom_exam_capacity;
	@Column(name = "classroom_area")
	Long classroom_area;
	@Column(name = "classroom_seats_num")
	int classroom_seats_num;
	@Column(name = "classroom_director")
	String classroom_director;
	@Column(name = "classroom_purpose")
	String classroom_purpose;
	@Column(name = "classroom_purpose_explain")
	String classroom_purpose_explain;
	@Column(name = "classroom_venue")
	String classroom_venue;
	@Column(name = "classroom_floor")
	String classroom_floor;
	@Column(name = "classroom_management")
	String classroom_management;
	@Column(name = "classroom_type")
	String classroom_type;
	@Column(name = "classroom_campus")
	String classroom_campus;
	@Column(name = "classroom_used")
	Boolean classroom_used;

	public Classroom() {

	}

	public Classroom(int id, String classroom_id, String classroom_name, int classroom_exam_capacity, Long classroom_area, int classroom_seats_num, String classroom_director, String classroom_purpose, String classroom_purpose_explain, String classroom_venue, String classroom_floor, String classroom_management, String classroom_type, String classroom_campus, Boolean classroom_used) {
		this.id = id;
		this.classroom_id = classroom_id;
		this.classroom_name = classroom_name;
		this.classroom_exam_capacity = classroom_exam_capacity;
		this.classroom_area = classroom_area;
		this.classroom_seats_num = classroom_seats_num;
		this.classroom_director = classroom_director;
		this.classroom_purpose = classroom_purpose;
		this.classroom_purpose_explain = classroom_purpose_explain;
		this.classroom_venue = classroom_venue;
		this.classroom_floor = classroom_floor;
		this.classroom_management = classroom_management;
		this.classroom_type = classroom_type;
		this.classroom_campus = classroom_campus;
		this.classroom_used = classroom_used;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassroom_id() {
		return classroom_id;
	}

	public void setClassroom_id(String classroom_id) {
		this.classroom_id = classroom_id;
	}

	public String getClassroom_name() {
		return classroom_name;
	}

	public void setClassroom_name(String classroom_name) {
		this.classroom_name = classroom_name;
	}

	public int getClassroom_exam_capacity() {
		return classroom_exam_capacity;
	}

	public void setClassroom_exam_capacity(int classroom_exam_capacity) {
		this.classroom_exam_capacity = classroom_exam_capacity;
	}

	public Long getClassroom_area() {
		return classroom_area;
	}

	public void setClassroom_area(Long classroom_area) {
		this.classroom_area = classroom_area;
	}

	public int getClassroom_seats_num() {
		return classroom_seats_num;
	}

	public void setClassroom_seats_num(int classroom_seats_num) {
		this.classroom_seats_num = classroom_seats_num;
	}

	public String getClassroom_director() {
		return classroom_director;
	}

	public void setClassroom_director(String classroom_director) {
		this.classroom_director = classroom_director;
	}

	public String getClassroom_purpose() {
		return classroom_purpose;
	}

	public void setClassroom_purpose(String classroom_purpose) {
		this.classroom_purpose = classroom_purpose;
	}

	public String getClassroom_purpose_explain() {
		return classroom_purpose_explain;
	}

	public void setClassroom_purpose_explain(String classroom_purpose_explain) {
		this.classroom_purpose_explain = classroom_purpose_explain;
	}

	public String getClassroom_venue() {
		return classroom_venue;
	}

	public void setClassroom_venue(String classroom_venue) {
		this.classroom_venue = classroom_venue;
	}

	public String getClassroom_floor() {
		return classroom_floor;
	}

	public void setClassroom_floor(String classroom_floor) {
		this.classroom_floor = classroom_floor;
	}

	public String getClassroom_management() {
		return classroom_management;
	}

	public void setClassroom_management(String classroom_management) {
		this.classroom_management = classroom_management;
	}

	public String getClassroom_type() {
		return classroom_type;
	}

	public void setClassroom_type(String classroom_type) {
		this.classroom_type = classroom_type;
	}

	public String getClassroom_campus() {
		return classroom_campus;
	}

	public void setClassroom_campus(String classroom_campus) {
		this.classroom_campus = classroom_campus;
	}

	public Boolean getClassroom_used() {
		return classroom_used;
	}

	public void setClassroom_used(Boolean classroom_used) {
		this.classroom_used = classroom_used;
	}
}
