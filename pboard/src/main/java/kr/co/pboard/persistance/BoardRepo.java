package kr.co.pboard.persistance;


import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.pboard.vo.ArticleVo;

public interface BoardRepo extends JpaRepository<ArticleVo, Integer> {




}
