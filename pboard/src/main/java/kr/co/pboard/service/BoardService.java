package kr.co.pboard.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.pboard.dao.BoardDao;
import kr.co.pboard.persistance.BoardRepo;
import kr.co.pboard.vo.ArticleVo;
import kr.co.pboard.vo.CommentVo;

@Service
public class BoardService {
	
	@Autowired
	private BoardDao dao;
	
	@Autowired
	private BoardRepo repo;
	
	public void insertArticle(ArticleVo vo) {
		dao.insertArticle(vo);
	}
	
	public List<ArticleVo> selectArticles(int start){
		return dao.selectArticles(start);
	}
	
	public List<ArticleVo> selectArticlesBySearch(int start,String opt, String keyword){
		return dao.selectArticlesBySearch(start, opt, keyword);
	};
	
	public ArticleVo selectArticle(int seq) {
		return dao.selectArticle(seq);
	}
	
	public void modifyArticle(ArticleVo vo) {
		dao.modifyArticle(vo);
	}
	
	public void deleteArticle(int seq) {
		dao.deleteArticle(seq);
	}

	public void goodArticle(ArticleVo vo) {
		dao.goodArticle(vo);
	}
	
	public void bedArticle(ArticleVo vo) {
		dao.bedArticle(vo);
	}
	
	public void hitArticle(ArticleVo vo) {
		dao.hitArticle(vo);
	}
	
	public void insertComment(CommentVo vo) {
		dao.insertComment(vo);
	}
	
	public void updateComment(CommentVo vo) {
		dao.updateComment(vo);
	}
	
	public List<CommentVo> selectComments(int seq){
		return dao.selectComments(seq);
	}
	public void deleteComment(int seq) {
		dao.deleteComment(seq);
	}
	
	
	
	//Limit start 계산
			public int getLimitStart(String pg) {
				if(pg == null) {
					return 0;
				}else {
					int page = Integer.parseInt(pg);
					return (page - 1) * 10;
				}
				
			}
			
			//전체 게시물 개수
			public int selectCountArticles(){
				return dao.selectCountArticles();
			}
			
			
			//페이지 번호 계산
			public int getPageEnd(int total) {
				int pageEnd = 0;
				
				if(total % 10 == 0) {
					pageEnd = total / 10;
				}else {
					pageEnd = (total / 10) + 1;
				}
				
				return pageEnd;
			}
			
			
			//list count 계산
			public int getListCount(int total, int start) {
				return (total - start) + 1;
			}
}
