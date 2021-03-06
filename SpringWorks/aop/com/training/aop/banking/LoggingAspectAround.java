package com.training.aop.banking;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspectAround {
	
	@Around("execution(public * get*())")
	public Object sampleMyAroundAdvise(ProceedingJoinPoint proceedingJoinPoint) {
		
		//advise should have compulsory agrument
		
		Object retval=null;
		
		
		try {
			System.out.println("Before jo goes here");
		retval=	proceedingJoinPoint.proceed();
			System.out.println("After job goes here....");
		}catch (Throwable e) {
			e.printStackTrace();
		}
		 return retval;
	}

}
