package com.mvc.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;

@Entity
@Table(name = "acess_type")
public class AccessType implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name = "acess_id")
	private int accessTypeId;
	
	@Column(name = "acesstype")
	private String accessType;
	
	public int getId(){
		return accessTypeId; 
	}
	
	public void setId(int id){
		this.accessTypeId = id;
	}
	
	public String getAccessType(){
		return accessType;
	}
	
	public void setAccessType(String accessType){
		this.accessType = accessType;
	}
}
