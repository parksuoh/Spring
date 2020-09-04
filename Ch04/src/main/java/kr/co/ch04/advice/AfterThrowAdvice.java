package kr.co.ch04.advice;

import org.springframework.stereotype.Component;

@Component
public class AfterThrowAdvice {
	public void afterThrow1() {
		System.out.println("횡단관심 ~ after1...");
	}
	
	public void afterThrow2() {
		System.out.println("횡단관심 ~ after2...");
	}
	
	public void afterThrow3() {
		System.out.println("횡단관심 ~ after3...");
	}
}
