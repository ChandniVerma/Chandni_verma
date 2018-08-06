package com.training.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.entity.Employee;
import com.training.interfaces.IEmployeeDAO;

public class EmployeeClient {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("db-context.xml");
		
		IEmployeeDAO employeeDAO=(IEmployeeDAO) applicationContext.getBean("employeeDaoTemplate");
	
		Employee e1=new Employee(001,"Tanmayee",40000);
		Employee e2=new Employee(002,"Goutam",34000);
		Employee e3=new Employee(003,"Chandni",400000);
//		
//		employeeDAO.insertEmployee(e1);
//		employeeDAO.insertEmployee(e2);
//		employeeDAO.insertEmployee(e3);
		
//		Employee employee=employeeDAO.getEmployee(001);
//		System.out.println(employee);
		
		employeeDAO.deleteEmployee(001);
		
		
		List<Employee> list=employeeDAO.getAllEmps();
		list.forEach(System.out::println);
		
		
		
	}

}
