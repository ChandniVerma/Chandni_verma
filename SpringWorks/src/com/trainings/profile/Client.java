package com.trainings.profile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Client {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext();
		((AnnotationConfigApplicationContext)applicationContext).getEnvironment().setActiveProfiles("Production","Development");
		
		//scans the mentioned packages n registered all the component available in spring
		
		((AnnotationConfigApplicationContext)applicationContext).scan("com.trainings.profile");
		((AnnotationConfigApplicationContext)applicationContext).refresh();
		((AnnotationConfigApplicationContext)applicationContext).close();
		
		
	}

}
