package kr.co.pboard.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.pboard.vo.UserVo;

public interface UserRepo extends JpaRepository<UserVo, String> {




}
