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
@Table(name = "hr_basic_profile")
public class HrBasicProfile {
	@Id
	@GenericGenerator(name = "leave", strategy = "increment")
	@GeneratedValue(generator = "leave")
	@Column(name = "hr_basic_id")
	private int hr_basic_id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;
	@Column(name = "hr_first_name")
	private String hr_first_name;
	@Column(name = "hr_last_name")
	private String hr_last_name;
	@Column(name = "hr_join_date")
	private Date hr_join_date;
	@Column(name = "hr_profile_pic")
	private byte[] hr_profile_pic;
	@Column(name = "hr_gender")
	private String hr_gender;
	@Column(name = "hr_email")
	private String hr_email;
	@Column(name = "hr_mobile_number")
	private int hr_mobile_number;
	public int getHr_basic_id() {
		return hr_basic_id;
	}
	public void setHr_basic_id(int hr_basic_id) {
		this.hr_basic_id = hr_basic_id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getHr_first_name() {
		return hr_first_name;
	}
	public void setHr_first_name(String hr_first_name) {
		this.hr_first_name = hr_first_name;
	}
	public String getHr_last_name() {
		return hr_last_name;
	}
	public void setHr_last_name(String hr_last_name) {
		this.hr_last_name = hr_last_name;
	}
	public Date getHr_join_date() {
		return hr_join_date;
	}
	public void setHr_join_date(Date hr_join_date) {
		this.hr_join_date = hr_join_date;
	}
	public byte[] getHr_profile_pic() {
		return hr_profile_pic;
	}
	public void setHr_profile_pic(byte[] hr_profile_pic) {
		this.hr_profile_pic = hr_profile_pic;
	}
	public String getHr_gender() {
		return hr_gender;
	}
	public void setHr_gender(String hr_gender) {
		this.hr_gender = hr_gender;
	}
	public String getHr_email() {
		return hr_email;
	}
	public void setHr_email(String hr_email) {
		this.hr_email = hr_email;
	}
	public int getHr_mobile_number() {
		return hr_mobile_number;
	}
	public void setHr_mobile_number(int hr_mobile_number) {
		this.hr_mobile_number = hr_mobile_number;
	}
	
}
