package com.cg.mvc.practise.SpringDependencyAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Phone {
	
	@Autowired
	@Qualifier("snapDragon")
	CPU cpu;
	
	void display() {
		System.out.println("MY Phone"+cpu);
		
	}
}
