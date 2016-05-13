package com.mvc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "registered_users")
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int userId;	
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "pswd")
	private String password;
	
	@ManyToOne
	@JoinColumn(name = "acess_id")
	private AccessType accessType;
	
	@Column(name = "active_user")
	private boolean enabled;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "regDate")
	private Date registerDate;
	
	public int getUserId(){
		return userId;
	}
	
	public void setUsertId(int id){
		this.userId = id;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public boolean isEnabled(){
		return enabled;
	}
	
	public void setEnabled(boolean enabled){
		this.enabled = enabled;
	}
	
	public Date getRegisterDate(){
		return registerDate;
	}
	
	public void setRegisterDate(Date registerDate){
		this.registerDate = registerDate;
	}
}
