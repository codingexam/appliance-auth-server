package com.appliance.auth.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id"})})
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private long user_id;
	
	@Column(name = "username",length=50)
	@NotNull(message = "username should not be null")
	private String username;

	@Column(name = "password",length=200)
	@NotNull(message = "password should not be null")
	private String password;
	
	@Column(name = "email",length=200)
	@NotNull(message = "email should not be null")
	private String email;
	
	@Column(name = "first_name",length=100)
	private String first_name;
	
	@Column(name = "last_name",length=100)
	private String last_name;

	@Column(name = "enabled")
	private boolean enabled;
	
	public User() {}
	
	public User(@NotNull(message = "username should not be null") String username,
			@NotNull(message = "password should not be null") String password, long user_id) {
		super();
		this.username = username;
		this.password = password;
		this.user_id = user_id;
	}
	 
	public String getUsername() {
		return username;
	}
	
	public long getUserId() {
		return user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
