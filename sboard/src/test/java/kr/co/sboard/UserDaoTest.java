package kr.co.sboard;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.sboard.dao.UserDao;
import kr.co.sboard.vo.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context-test.xml"}) 
public class UserDaoTest {
	
	@Inject
	private UserDao dao;
	
	
	public void selectTerms() {
		dao.selectTerms();
	}
	
	public void selectUserCount() {
		int result = dao.selectUserCount("acbal");
		System.out.println("result : " +result);
	}
	
	@Test
	public void insertUser() {
		
		UserVO vo = new UserVO();
		vo.setUid("fsda");
		vo.setPass1("1234");
		vo.setName("임꺽정");
		vo.setNick("꺽정");
		vo.setEmail("fsda@dsakjb.com");
		vo.setHp("010-1478-5236");
		vo.setRegip("192.91.29.23");
		
		dao.insertUser(vo);
	}
	
}
