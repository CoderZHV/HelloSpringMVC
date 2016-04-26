package com.springmvc.domain;

public class User {

	private String username;
	private String passworld;
	private String email;
	private Integer age;

	public User(String username, String passworld, String email, Integer age) {
		super();
		this.username = username;
		this.passworld = passworld;
		this.email = email;
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassworld() {
		return passworld;
	}

	public void setPassworld(String passworld) {
		this.passworld = passworld;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", passworld=" + passworld 
				+ ", email=" + email + ", age=" + age + "]";
	}

}
