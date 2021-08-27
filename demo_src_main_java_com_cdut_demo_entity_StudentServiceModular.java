package com.cdut.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


/**
 * 学生服务模块
 */
@Entity
@Data
@Table(name = "student_service_modular")
public class StudentServiceModular implements Serializable {
	/**
	 * 主键
	 */
	@Id
	private int id;

	/**
	 * 服务类型Id
	 */
	@Column(name = "service_id")
	private int service_id;

	/**
	 * 服务类型名称
	 */
	@Column(name = "service_name")
	private String service_name;

	/**
	 * 服务对应接口Id
	 */
	@Column(name = "modular_id")
	private int modular_id;

	public StudentServiceModular(int service_id, String service_name, int modular_id) {
		this.service_id = service_id;
		this.service_name = service_name;
		this.modular_id = modular_id;
	}

	public StudentServiceModular() {
	}

	public int getService_id() {
		return service_id;
	}

	public void setService_id(int service_id) {
		this.service_id = service_id;
	}

	public String getService_name() {
		return service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
	}

	public int getModular_id() {
		return modular_id;
	}

	public void setModular_id(int modular_id) {
		this.modular_id = modular_id;
	}
}
