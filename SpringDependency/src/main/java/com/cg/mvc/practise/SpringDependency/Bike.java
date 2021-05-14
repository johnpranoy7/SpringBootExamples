package com.cg.mvc.practise.SpringDependency;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{

	public void drive() {
		System.out.println("BIKE RIDE");
	}

}
