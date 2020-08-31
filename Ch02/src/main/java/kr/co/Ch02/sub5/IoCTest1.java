package kr.co.Ch02.sub5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 2020 08 31
 * 이름 박수오
 * 내용 스프링 어노테이션을 이용한 스프링 IoC 구현
 * */

public class IoCTest1 {
	
	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		TV LGTV = (TV) ctx.getBean("sub5LGTV");
		TV SamsungTV = (TV) ctx.getBean("sub5SamsungTV");
		
		LGTV.power();
		LGTV.chUp();
		LGTV.soundUp();

		SamsungTV.power();
		SamsungTV.chUp();
		SamsungTV.soundUp();
		
	}
	
	
}
