package kr.co.Ch02.sub5;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component("sub5LGTV")
public class LGTV implements TV{
	
	@Inject
	private Speaker spk;
	
	
	@Override
	public void power() {
		System.out.println("sub5 LGTV power");
		
	}

	@Override
	public void chUp() {
		System.out.println("sub5 LGTV chUp");
		
	}

	@Override
	public void soundUp() {
		spk.soundUp();
		
	}
	
}
