package com.cg.mvc.practise.SpringDependency;

import java.io.ObjectInputStream.GetField;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	ApplicationContext context = new ClassPathXmlApplicationContext("myConfiguration.xml");
        Vehicle vehicle= (Vehicle) context.getBean("car");
        vehicle.drive();
        System.out.println(vehicle);
        
//        Tyre tyre = (Tyre) context.getBean("tyre");
//        System.out.println(tyre);
    }
}
