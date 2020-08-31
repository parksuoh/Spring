package kr.co.Ch02.sub1;

public class LGTV implements TV{

	@Override
	public void power() {
		System.out.println("LGTV power");
		
	}

	@Override
	public void chUp() {
		System.out.println("LGTV chUp");
		
	}

	@Override
	public void soundUp() {
		System.out.println("LGTV soundUp");
		
	}
	
}
