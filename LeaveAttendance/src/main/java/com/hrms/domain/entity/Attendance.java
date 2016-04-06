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
@Table(name = "attendance")
public class Attendance {
	
	@Id
	@GenericGenerator(name = "leave", strategy = "increment")
	@GeneratedValue(generator = "leave")
	@Column(name = "attendance_id")
	private int attendance_id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;
	@Column(name = "date")
	private Date date;
	@Column(name = "login_time")
	private Date login_time;
	@Column(name = "logout_time")
	private Date logout_time;
	public int getAttendance_id() {
		return attendance_id;
	}
	public void setAttendance_id(int attendance_id) {
		this.attendance_id = attendance_id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getLogin_time() {
		return login_time;
	}
	public void setLogin_time(Date login_time) {
		this.login_time = login_time;
	}
	public Date getLogout_time() {
		return logout_time;
	}
	public void setLogout_time(Date logout_time) {
		this.logout_time = logout_time;
	}
	
}
