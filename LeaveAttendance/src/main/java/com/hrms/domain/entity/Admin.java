package com.hrms.domain.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Admin {
	@Id
	@GenericGenerator(name="leave", strategy="increment")
	@GeneratedValue(generator="leave")
	@Column(name="admin_id")
	private int admin_id;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private User user;
	@Column(name="admin_first_name")
	private String admin_first_name;
	@Column(name="admin_last_name")
	private String admin_last_name;
	@Column(name="admin_profile_pic")
	private byte[] admin_profile_pic;
	@Column(name="admin_gender")
	private String admin_gender;
	@Column(name="admin_email")
	private String admin_email;
	@Column(name="admin_mobile_number")
	private int admin_mobile_number;
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getAdmin_first_name() {
		return admin_first_name;
	}
	public void setAdmin_first_name(String admin_first_name) {
		this.admin_first_name = admin_first_name;
	}
	public String getAdmin_last_name() {
		return admin_last_name;
	}
	public void setAdmin_last_name(String admin_last_name) {
		this.admin_last_name = admin_last_name;
	}
	public byte[] getAdmin_profile_pic() {
		return admin_profile_pic;
	}
	public void setAdmin_profile_pic(byte[] admin_profile_pic) {
		this.admin_profile_pic = admin_profile_pic;
	}
	public String getAdmin_gender() {
		return admin_gender;
	}
	public void setAdmin_gender(String admin_gender) {
		this.admin_gender = admin_gender;
	}
	public String getAdmin_email() {
		return admin_email;
	}
	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}
	public int getAdmin_mobile_number() {
		return admin_mobile_number;
	}
	public void setAdmin_mobile_number(int admin_mobile_number) {
		this.admin_mobile_number = admin_mobile_number;
	}
	
}
