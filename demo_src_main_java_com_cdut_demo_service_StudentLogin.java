package com.cdut.demo.service;

public interface StudentLogin {
	int LoginJudge(Long student_id, String password);

	String getStudentName(Long student_id);

	String getStudentPassword(Long student_id);

	String getStudentMajor(Long student_id);

	String getStudentCollege(Long student_id);

	String getStudentPicture(Long student_id);

}
