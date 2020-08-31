package kr.co.Ch03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 2020 08 31
 * 이름 박수오
 * 내용 스프링 어노테이션을 이용한 스프링 IoC 구현
 * 
 * 어노테이션 종류
 * 	 @Component
 * 	 - 스프링 컨테이너가 해당 어노테이션 선언 클래스를 등록, 관리
 * 	 - @Controller, @Service, @Repository 로 세분화
 * 
 * 	 @Autowired
 * 	 -참조변수(객체)에 객체를 주입하는 어노테이션
 * 	 -스프링 전용 어노테이션
 * 
 * 	 @Inject
 * 	 -참조변수(객체)에 객체를 주입하는 어노테이션
 * 	 -자바 전용 어노테이션
 * 
 * */

public class IoCTest1 {
	
	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		TV LgTV      = (TV) ctx.getBean("lgTV");
		TV SamsungTV = (TV) ctx.getBean("samsungTV");
		
		LgTV.power();
		LgTV.chUp();
		LgTV.soundUp();

		SamsungTV.power();
		SamsungTV.chUp();
		SamsungTV.soundUp();
		
	}
	
	
}
