package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="queryEntity")	
public class QueryEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int queryId;
	@Column
	private String email;
	@Column
	private String name;
	@Column
	private String subject;
	@Column
	private String queryMessage;
	public int getQueryId() {
		return queryId;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getQueryMessage() {
		return queryMessage;
	}
	public void setQueryMessage(String queryMessage) {
		this.queryMessage = queryMessage;
	}


}
