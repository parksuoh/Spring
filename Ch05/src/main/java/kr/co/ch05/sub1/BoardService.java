package kr.co.ch05.sub1;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class BoardService {
	
	
	
	public void insert() {
		System.out.println("핵심관심 ~ insert...");
	}
	
	public void select() {
		System.out.println("핵심관심 ~ select...");
		
	}
	
	public void update(int seq) {
		System.out.println("핵심관심 ~ update...");
		
	}
	
	public void delete(int seq, String uid) {
		System.out.println("핵심관심 ~ delete...");
		
	}
	
	
}
