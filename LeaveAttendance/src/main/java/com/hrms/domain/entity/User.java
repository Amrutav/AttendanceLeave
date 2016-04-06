package com.hrms.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GenericGenerator(name = "leave", strategy = "increment")
	@GeneratedValue(generator = "leave")
	@Column(name = "user_id")
	private int user_id;
	@Column(name = "employee_code")
	private String employee_code;
	@Column(name = "user_name")
	private String user_name;
	@Column(name = "user_password")
	private String user_password;
	@Column(name = "user_first_name")
	private String user_first_name;
	@Column(name = "user_last_name")
	private String user_last_name;
	@Column(name = "user_type")
	private String user_type;
	@Column(name = "user_account_create_date")
	private Date user_account_create_date;
	@Column(name = "user_account_flag")
	private int user_account_flag;
	@Column(name = "user_profile_pic")
	private byte[] user_profile_pic;
	@Transient
	String profile_pic;
	public String getProfile_pic() {
		return profile_pic;
	}
	public void setProfile_pic(String profile_pic) {
		this.profile_pic = profile_pic;
	}
	@Column(name = "user_gender")
	private String user_gender;
	@Column(name = "user_email")
	private String user_email;
	@Column(name = "user_mobile_number")
	private int user_mobile_number;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getEmployee_code() {
		return employee_code;
	}
	public void setEmployee_code(String employee_code) {
		this.employee_code = employee_code;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_first_name() {
		return user_first_name;
	}
	public void setUser_first_name(String user_first_name) {
		this.user_first_name = user_first_name;
	}
	public String getUser_last_name() {
		return user_last_name;
	}
	public void setUser_last_name(String user_last_name) {
		this.user_last_name = user_last_name;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public Date getUser_account_create_date() {
		return user_account_create_date;
	}
	public void setUser_account_create_date(Date user_account_create_date) {
		this.user_account_create_date = user_account_create_date;
	}
	public int getUser_account_flag() {
		return user_account_flag;
	}
	public void setUser_account_flag(int user_account_flag) {
		this.user_account_flag = user_account_flag;
	}
	public byte[] getUser_profile_pic() {
		return user_profile_pic;
	}
	public void setUser_profile_pic(byte[] user_profile_pic) {
		this.user_profile_pic = user_profile_pic;
	}
	public String getUser_gender() {
		return user_gender;
	}
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public int getUser_mobile_number() {
		return user_mobile_number;
	}
	public void setUser_mobile_number(int user_mobile_number) {
		this.user_mobile_number = user_mobile_number;
	}	
	
}
