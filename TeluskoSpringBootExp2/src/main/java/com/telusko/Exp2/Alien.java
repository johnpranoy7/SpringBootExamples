package com.telusko.Exp2;

import org.springframework.stereotype.Component;

@Component
public class Alien {
	private int sno;
	private String sname;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Alien() {
		super();
		System.out.println("ALien Constructor Called");
	}
	public Alien(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Alien [sno=" + sno + ", sname=" + sname + "]";
	}
	

}

