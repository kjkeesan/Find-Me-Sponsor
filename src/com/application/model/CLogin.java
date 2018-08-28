package com.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


@Table(name="login")
@Entity
public class CLogin {
	@Id
	@GeneratedValue(generator = "system-increment")
	@GenericGenerator(name= "system-increment", strategy="increment")
	@Column(name="id")
	private Integer id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="CName")
	private String CName;
	
	/**
	 * @return the cName
	 */
	public String getCName() {
		return CName;
	}
	/**
	 * @param cName the cName to set
	 */
	public void setCName(String cName) {
		CName = cName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
