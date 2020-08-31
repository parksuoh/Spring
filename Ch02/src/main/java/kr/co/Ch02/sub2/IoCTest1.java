package kr.co.Ch02.sub2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 2020 08 31
 * 이름 박수오
 * 내용 스프링 IoC 실습하기
 * */

public class IoCTest1 {
	
	public static void main(String[] args) {
		
		//Ioc 적용을 Setter DI 로 적용할경우
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		TV LGTV = (TV) ctx.getBean("LGTV");
		TV SamsungTV = (TV) ctx.getBean("SamsungTV");
		
		LGTV.power();
		LGTV.chUp();
		LGTV.soundUp();

		SamsungTV.power();
		SamsungTV.chUp();
		SamsungTV.soundUp();
		
	}
	
	
}
