package com.annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Students")
public class Students {
	@Id
	@Column(name="Sid")
	private int Sid;
	
	@Column(name="Sname")
	private String  Sname;
	
	@Column(name="Smark")
	private int Smark;
	
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public int getSmark() {
		return Smark;
	}
	public void setSmark(int smark) {
		Smark = smark;
	}
	
	

}
