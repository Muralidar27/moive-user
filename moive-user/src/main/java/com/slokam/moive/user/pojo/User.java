package com.slokam.moive.user.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int userId;

	@Column(name = "userName")
	private String user_name;

	@Column(name = "user_phno")
	private Long userPhno;

	// toString
	@Override
	public String toString() {
		return "User [userId=" + userId + ", user_name=" + user_name + ", userPhno=" + userPhno + "]";
	}

	// getters and setters
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public Long getUserPhno() {
		return userPhno;
	}

	public void setUserPhno(Long userPhno) {
		this.userPhno = userPhno;
	}

}
