package com.hrms.domain.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "employee_basic_profile")
public class EmployeeBasicProfile {
	
	
	@Id
	@GenericGenerator(name = "leave", strategy = "increment")
	@GeneratedValue(generator = "leave")
	@Column(name = "employee_basic_id")
	private int employee_basic_id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;
	@Column(name = "employee_first_name")
	private String employee_first_name;
	@Column(name = "employee_last_name")
	private String employee_last_name;
	@Column(name = "employee_designation")
	private String employee_designation;
	@Column(name = "employee_join_date")
	private Date employee_join_date;
	@Column(name = "employee_profile_pic")
	private byte[] employee_profile_pic;
	@Column(name = "employee_gender")
	private String employee_gender;
	@Column(name = "employee_email")
	private String employee_email;
	@Column(name = "employee_mobile_number")
	private int employee_mobile_number;
	public int getEmployee_basic_id() {
		return employee_basic_id;
	}
	public void setEmployee_basic_id(int employee_basic_id) {
		this.employee_basic_id = employee_basic_id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getEmployee_first_name() {
		return employee_first_name;
	}
	public void setEmployee_first_name(String employee_first_name) {
		this.employee_first_name = employee_first_name;
	}
	public String getEmployee_last_name() {
		return employee_last_name;
	}
	public void setEmployee_last_name(String employee_last_name) {
		this.employee_last_name = employee_last_name;
	}
	public String getEmployee_designation() {
		return employee_designation;
	}
	public void setEmployee_designation(String employee_designation) {
		this.employee_designation = employee_designation;
	}
	public Date getEmployee_join_date() {
		return employee_join_date;
	}
	public void setEmployee_join_date(Date employee_join_date) {
		this.employee_join_date = employee_join_date;
	}
	public byte[] getEmployee_profile_pic() {
		return employee_profile_pic;
	}
	public void setEmployee_profile_pic(byte[] employee_profile_pic) {
		this.employee_profile_pic = employee_profile_pic;
	}
	public String getEmployee_gender() {
		return employee_gender;
	}
	public void setEmployee_gender(String employee_gender) {
		this.employee_gender = employee_gender;
	}
	public String getEmployee_email() {
		return employee_email;
	}
	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}
	public int getEmployee_mobile_number() {
		return employee_mobile_number;
	}
	public void setEmployee_mobile_number(int employee_mobile_number) {
		this.employee_mobile_number = employee_mobile_number;
	}
}
