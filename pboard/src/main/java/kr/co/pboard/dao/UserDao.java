package kr.co.pboard.dao;



import org.springframework.stereotype.Repository;

import kr.co.pboard.vo.UserVo;


@Repository
public interface UserDao {
	
	
	public UserVo selectUser(UserVo vo);
	
	public void updateUser(UserVo vo);
	

}
