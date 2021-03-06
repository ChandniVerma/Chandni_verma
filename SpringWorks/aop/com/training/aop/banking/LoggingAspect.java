package com.training.aop.banking;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	//this will scan for any package n any class
	//@Before("execution(public String getAccName())")
	
	//fully qualified name
	//@Before("execution(public double com.training.aop.model.CAAccount.showBalance()) ")
	
	//regular expression to log all getters
	
	//log take getter which has altleast one parameter
	//@Before("execution( * get*(*))")
	
	//log can take getters who have or not any param
	//@Before("execution( * get*(..))")
	
	@Before("execution(* com.training.aop.model.*.getBalance())")
	public void loggingAdviceBefore() {
		System.out.println("*******Logginf Before Called*********");
	}
	
		
		@Before("allGetters()")
		public void secondAdvise() {
			System.out.println("Second aspect Invoked ");
	}
		@Before("allGettersSBAccount()")
		public void secondAdviseForSBAccount() {
			System.out.println("Second advise from SBA ");
		}
	
	@Pointcut("execution( * get*(..))")
	public void allGetters() {
		System.out.println("this data should not ");
	}
	 
	@Pointcut("execution(* com.training.aop.model.*.getAcc())")
	public void allGettersSBAccount() {
		System.out.println("SBA GETTERS:::::::::::::");
	}
	
	@Before("allGetters()|| allGettersSBAccount()")
	public void compoundAdvise() {
		System.out.println("only for compound...........");
	}
	
}
