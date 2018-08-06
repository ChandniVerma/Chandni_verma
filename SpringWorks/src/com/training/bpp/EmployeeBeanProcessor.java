package com.training.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.training.employee.Employee;

//since this class can handle any class 
public class EmployeeBeanProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String beanName) throws BeansException {
		System.out.println("******POSTPROCESSORBEFOREINITI");
		return arg0;
	}

	@Override
	public Object postProcessAfterInitialization(Object arg1, String beanName) throws BeansException {
		System.out.println("******POSTPROCESSORAfterINITI");
		if(arg1 instanceof Employee) {
			Employee emp=(Employee) arg1;
			emp.setEmpName(emp.getEmpName().toUpperCase());
			return emp;
		}
		return arg1;
		
	}

}
