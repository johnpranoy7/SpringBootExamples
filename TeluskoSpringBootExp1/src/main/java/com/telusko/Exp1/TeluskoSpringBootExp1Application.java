package com.telusko.Exp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/* Singelton means the object is created without we asking the container. but nomatter how many objects u create it will create only one instance hence singelton
 * Prototype will create as many instances as we want, but it wont create anything without we asking it
 *  */


@SpringBootApplication
public class TeluskoSpringBootExp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext conn = SpringApplication.run(TeluskoSpringBootExp1Application.class, args);
		Alien bean = conn.getBean(Alien.class);
		Alien a1 = conn.getBean(Alien.class);
		a1.setSno(1);
		Alien a2 = conn.getBean(Alien.class);
		a2.setSno(2);
		System.out.println(a1.getSno() + " "+a2.getSno());
	}

}
