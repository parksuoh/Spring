package kr.co.Ch03;

import org.springframework.stereotype.Component;

@Component
public class Internet {
	
	public void access() {
		System.out.println("인터넷 연결...");
	}
}
