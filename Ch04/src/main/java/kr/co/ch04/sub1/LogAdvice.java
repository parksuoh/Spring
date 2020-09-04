package kr.co.ch04.sub1;

import org.springframework.stereotype.Service;

@Service
public class LogAdvice {
	
	public void beforeLog() {
		
		System.out.println("====================");
		System.out.println("횡단관심 ~ boforeLog...");
	}
	public void afterLog() {
		System.out.println("--------------------");
		System.out.println("횡단관심 ~ boforeLog...");
	}
	
	
}
