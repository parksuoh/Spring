package kr.co.ch04.advice;

import org.springframework.stereotype.Component;

@Component
public class BeforeAdvice {
	public void before1() {
		
		System.out.println("횡단관심 ~ after1...");
	}
	
	public void before2() {
		System.out.println("횡단관심 ~ after2...");
	}
	
	public void before3() {
		System.out.println("횡단관심 ~ after3...");
	}
}
