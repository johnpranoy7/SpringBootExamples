package com.telusko.Exp3.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {
	@Id
	private int sid;
	private String sname;
	private String tech;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public Alien(int sid, String sname, String tech) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.tech = tech;
	}
	public Alien() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Alien [sid=" + sid + ", sname=" + sname + ", tech=" + tech + "]";
	}
	
}
