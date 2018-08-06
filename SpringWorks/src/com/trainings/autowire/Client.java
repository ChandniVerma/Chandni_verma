package com.trainings.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("mobile-context.xml");
		Mobile mobile=context.getBean("mobile", Mobile.class);
		System.out.println("Mobile Details");
		
		System.out.println("Mobile type: "+mobile.getCamera().getType());
		System.out.println("Spekaers details" +mobile.getSpeaker().getType() +" vol level "+ mobile.getSpeaker().getVolLevels());
		System.out.println("Screen Details : "+mobile.getScreen().getBre() +" len "+mobile.getScreen().getLen()
				
			+"   GlassType  "+mobile.getScreen().getGlassType());	
		
		
		
	}

}
