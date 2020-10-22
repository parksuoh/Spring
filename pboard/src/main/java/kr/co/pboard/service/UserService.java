package kr.co.pboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.pboard.dao.BoardDao;
import kr.co.pboard.dao.UserDao;
import kr.co.pboard.persistance.UserRepo;
import kr.co.pboard.vo.ArticleVo;
import kr.co.pboard.vo.UserVo;

@Service
public class UserService {
	
	@Autowired
	private UserDao dao;
	
	
	@Autowired
	public UserRepo userrepo;
	
	public UserVo selectUser(UserVo vo) {
		return dao.selectUser(vo);
	}
	

	public void updateUser(UserVo vo) {
		dao.updateUser(vo);
	}
	

}
