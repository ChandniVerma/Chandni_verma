package com.trainings.messagesource;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		ApplicationContext  context=new ClassPathXmlApplicationContext("message-resource-context.xml");
		
		String engGoodMorning=context.getMessage("goodmorning", new Object[] {},null);
		String frGoodMorning=context.getMessage("goodmorning", new Object[] {},new Locale("Fr"));
		String grGoodMorning=context.getMessage("goodmorning", new Object[] {},new Locale("GR"));
		
		System.out.println(engGoodMorning);
		System.out.println(frGoodMorning);
		System.out.println(grGoodMorning);
		
		System.out.println("--------------------------------------");
		HelloWorld helloWorld=context.getBean("helloWorld", HelloWorld.class);
		helloWorld.sayHelloWorld();
		helloWorld.sayHelloWorld_fr();
		helloWorld.sayHelloWorld_ger();
		
		
	}

}
