package kr.co.Ch02.sub5;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sub5SamsungTV")
public class SamsungTV implements TV{
	
	@Autowired
	private Speaker spk;
	
	@Override
	public void power() {
		System.out.println("sub5 SamsungTV power");
		
	}

	@Override
	public void chUp() {
		System.out.println("sub5 SamsungTV power");
		
	}

	@Override
	public void soundUp() {
		spk.soundUp();
		
	}

}
