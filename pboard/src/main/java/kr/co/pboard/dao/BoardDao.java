package kr.co.pboard.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.pboard.vo.ArticleVo;
import kr.co.pboard.vo.CommentVo;

@Repository
public interface BoardDao {
	
	public void insertArticle(ArticleVo vo);
	
	public List<ArticleVo> selectArticles(int start);
	
	public int selectCountArticles();
	
	public List<ArticleVo> selectArticlesBySearch(int start, String opt, String keyword);
	
	public ArticleVo selectArticle(int seq);
	
	public void modifyArticle(ArticleVo vo);
	
	public void deleteArticle(int seq);
	
	public void goodArticle(ArticleVo vo);
	
	public void bedArticle(ArticleVo vo);
	
	public void hitArticle(ArticleVo vo);
	
	public void insertComment(CommentVo vo);
	
	public void updateComment(CommentVo vo);
	
	public List<CommentVo> selectComments(int seq);
	
	public void deleteComment(int seq);
	
	

}
