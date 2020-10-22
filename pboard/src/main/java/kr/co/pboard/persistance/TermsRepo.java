package kr.co.pboard.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.pboard.vo.TermsVo;

public interface TermsRepo extends JpaRepository<TermsVo, Integer> {

}
