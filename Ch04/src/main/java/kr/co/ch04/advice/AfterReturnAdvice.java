package kr.co.ch04.advice;

import org.springframework.stereotype.Component;

@Component
public class AfterReturnAdvice {
	public void afterReturn1() {
		System.out.println("횡단관심 ~ after1...");
	}
	
	public void afterReturn2() {
		System.out.println("횡단관심 ~ after2...");
	}
	
	public void afterReturn3() {
		System.out.println("횡단관심 ~ after3...");
	}
}
