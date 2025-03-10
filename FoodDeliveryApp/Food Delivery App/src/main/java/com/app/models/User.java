package com.app.models;

import java.util.Date;

import com.app.enums.Role;

public class User {
	
	private int userId;
	private String name;
	private String userName;
	private String password;
	private String email;
	private String phoneNumber;
	private String address;
	private Role role;
	private Date createdDate;
	private Date lastLoginDate;
	
	public User() {
	}

	public User(String name, String userName, String password, String email, String phoneNumber,
			String address, Role role) {
		super();
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.role = role;
		
	}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", userName=" + userName + ", password=" + password
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", address=" + address + ", role=" + role
				+ ", createdDate=" + createdDate + ", lastLoginDate=" + lastLoginDate + "]";
	}
	
	
}
