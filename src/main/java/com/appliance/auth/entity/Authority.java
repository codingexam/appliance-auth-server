package com.appliance.auth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "authorities", uniqueConstraints = {@UniqueConstraint(columnNames = {"username"})})
public class Authority {
	@Id       
	private Long id;
	
	@Column(name = "username")
	@NotNull(message = "username should not be null")
	private String username;

	@Column(name = "authority")
	private String authority;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "users.username")
	private User user;
	
	public Authority() {}
	
	public Authority(String username, String authority) {
		super();
		this.username = username;
		this.authority = authority;
	}

	public String getUsername() {
		return username;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	 
}
