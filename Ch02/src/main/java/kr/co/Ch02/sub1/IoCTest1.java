package kr.co.Ch02.sub1;

/*
 * 날짜 2020 08 31
 * 이름 박수오
 * 내용 스프링 IoC 실습하기
 * */

public class IoCTest1 {
	
	public static void main(String[] args) {
		
		//Ioc 적용을 안할경우
		TV LGTV = new LGTV();
		LGTV.power();
		LGTV.chUp();
		LGTV.soundUp();
		
		TV SamsungTV = new SamsungTV();
		SamsungTV.power();
		SamsungTV.chUp();
		SamsungTV.soundUp();
		
	}
	
	
}
