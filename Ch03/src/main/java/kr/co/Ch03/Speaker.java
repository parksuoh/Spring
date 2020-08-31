package kr.co.Ch03;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class Speaker {
	
	public void soundUp() {
		System.out.println("sub5 Speaker soundUp...");
	}
	public void soundDown() {
		System.out.println("sub5 Speaker soundDown...");
	}
	
	
}
