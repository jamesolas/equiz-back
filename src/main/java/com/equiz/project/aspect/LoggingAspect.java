package com.equiz.project.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Before("execution(* com.equiz.project.service..*(..) )")
	public void logBeforeService(JoinPoint jp) {
		log.info(jp.getSignature().getName() );
	}
	
	@Before("execution(* com.equiz.project.controller..*(..) )")
	public void logBeforeController(JoinPoint jp) {
		log.info(jp.getSignature().getName() );
	}
	
	@AfterReturning(pointcut = "execution(* com.equiz.project.service..*(..) )", returning = "result")
	public void logAfterService(JoinPoint jp, Object result) {
		String methodName = jp.getSignature().toShortString();
		Object[] args = jp.getArgs();
		log.info("Method: {}, Arguments: {}, Result: {}", methodName, Arrays.toString(args), result);
	}
	
	@AfterReturning(pointcut = "execution(* com.equiz.project.repository..*(..) )", returning = "result")
	public void logAfterRepository(JoinPoint jp, Object result) {
		String methodName = jp.getSignature().toShortString();
		Object[] args = jp.getArgs();
		log.info("Method: {}, Arguments: {}, Result: {}", methodName, Arrays.toString(args), result);
	}
	
//	@Before("execution(* com.equiz.project.service..*(..) )")
//	public void logBeforeService2(JoinPoint jp, Object result) {
//		String methodName = jp.getSignature().toShortString();
//		Object[] args = jp.getArgs();
//		log.info("Method: {}, Arguments: {}, Result: {}", methodName, Arrays.toString(args), result);
//		log.info("test");
//	}

}
