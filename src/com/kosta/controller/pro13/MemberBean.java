package com.kosta.controller.pro13;

import java.sql.Date;

public class MemberBean {
	private String id;
	private String pwd;
	private String name;
	private String email;
	private Date joinDate;
	
	//bean는 vo, dto랑 동일
	public MemberBean() {
		System.out.println("MemberBean default생성자");
	}


	public MemberBean(String id, String pwd, String name, String email) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		System.out.println("MemberBean arg4개 생성자");
	}


	public String getId() {
		System.out.println("getId()함수:"+id);
		return id;
	}


	public void setId(String id) {
		this.id = id;
		System.out.println("setId()함수:"+id);
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getJoinDate() {
		return joinDate;
	}


	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
}
