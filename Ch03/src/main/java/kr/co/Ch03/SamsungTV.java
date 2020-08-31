package kr.co.Ch03;


import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SamsungTV implements TV{
	
	@Autowired
	private Speaker spk;
	@Inject
	private Internet internet;
	
	@Override
	public void power() {
		System.out.println("SamsungTV power");
		internet.access();
	}

	@Override
	public void chUp() {
		System.out.println("SamsungTV power");
		
	}

	@Override
	public void soundUp() {
		spk.soundUp();
		
	}

}
