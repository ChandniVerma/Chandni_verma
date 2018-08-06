package com.training.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		//ApplicationContext context=new ClassPathXmlApplicationContext("springworks.xml");
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("springworks.xml");
		Employee employee=context.getBean("d", Employee.class);
		//Employee employee1=context.getBean("t", Employee.class);
		
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpSal());
		System.out.println(employee.hashCode());
		
		System.out.println("**************************");
		
		employee=context.getBean("d", Employee.class);
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpSal());
		System.out.println(employee.hashCode());
		context.registerShutdownHook();
		
	}

}
