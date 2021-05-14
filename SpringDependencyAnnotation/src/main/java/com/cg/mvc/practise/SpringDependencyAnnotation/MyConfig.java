package com.cg.mvc.practise.SpringDependencyAnnotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cg.mvc.practise.SpringDependencyAnnotation")
public class MyConfig {
//	@Bean
//	public Phone getPhone()
//	{
//		return new Phone();
//	}
//	
//	@Bean
//	public Amd getAmd()
//	{
//		return new Amd();
//	}
//	
//	@Bean
//	public SnapDragon getSnapDragon()
//	{
//		return new SnapDragon();
//	}
}
