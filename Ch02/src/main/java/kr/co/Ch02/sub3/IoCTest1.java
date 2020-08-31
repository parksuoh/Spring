package kr.co.Ch02.sub3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 2020 08 31
 * 이름 박수오
 * 내용 스프링 IoC -DI Setter 적용
 * */

public class IoCTest1 {
	
	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		TV LGTV = (TV) ctx.getBean("sub3LGTV");
		TV SamsungTV = (TV) ctx.getBean("sub3SamsungTV");
		
		LGTV.power();
		LGTV.chUp();
		LGTV.soundUp();

		SamsungTV.power();
		SamsungTV.chUp();
		SamsungTV.soundUp();
		
	}
	
	
}
