package com.cg.mvc.practise.SpringDependencyAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Amd implements CPU{
	
	String cname;
	public void cpuName() {
		System.out.println(cname);
	}
	@Override
	public String toString() {
		return "Amd [cname=" + cname + "]";
	}
	
}
