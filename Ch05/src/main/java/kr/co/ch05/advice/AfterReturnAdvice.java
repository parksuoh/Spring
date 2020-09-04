package kr.co.ch05.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterReturnAdvice {
	
	@Pointcut("execution(* kr.co.ch05.sub2.BoardService.insert(..))")
	public void insertPointcut() {} //내용이 없는 참조 메서드
	
	@AfterReturning("insertPointcut()")
	public void afterReturn1() {
		System.out.println("횡단관심 ~ afterreturn1...");
	}
	
	public void afterReturn2() {
		System.out.println("횡단관심 ~ afterreturn2...");
	}
	
	public void afterReturn3() {
		System.out.println("횡단관심 ~ afterreturn3...");
	}
}
