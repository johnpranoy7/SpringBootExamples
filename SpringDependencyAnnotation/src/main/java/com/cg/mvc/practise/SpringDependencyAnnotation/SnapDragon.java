package com.cg.mvc.practise.SpringDependencyAnnotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements CPU{

	String cname;
	public void cpuName() {
		System.out.println(cname);
	}
	@Override
	public String toString() {
		return "SnapDragon [cname=" + cname + "]";
	}
	
}
