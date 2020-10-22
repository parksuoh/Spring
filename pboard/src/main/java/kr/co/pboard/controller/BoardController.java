package kr.co.pboard.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.pboard.service.BoardService;
import kr.co.pboard.vo.ArticleVo;
import kr.co.pboard.vo.CommentVo;
import kr.co.pboard.vo.UserVo;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	
	@GetMapping("/board/list")
	public String list(HttpSession sess , Model model, String pg) {
		
		int start = service.getLimitStart(pg);
		int total = service.selectCountArticles();
		int pageEnd = service.getPageEnd(total);
		
		UserVo user = (UserVo) sess.getAttribute("user");
		List<ArticleVo> articles = service.selectArticles(start);
		model.addAttribute("user", user);
		model.addAttribute("articles", articles);
		model.addAttribute("pageEnd", pageEnd);
		model.addAttribute("currentPg", pg);
		
		return "/board/list";
		
	}
	
	@GetMapping("/board/search")
	public String search(HttpSession sess , Model model, String pg, String keyword, String opt) {
		
		int start = service.getLimitStart(pg);
		int total = service.selectCountArticles();
		int pageEnd = service.getPageEnd(total);
		
		UserVo user = (UserVo) sess.getAttribute("user");
		List<ArticleVo> articles = service.selectArticlesBySearch(start, opt, keyword);
		model.addAttribute("user", user);
		model.addAttribute("articles", articles);
		model.addAttribute("pageEnd", pageEnd);
		model.addAttribute("currentPg", pg);
		
		return "/board/list";
		
	}
	
	
	@GetMapping("/board/write")
	public String write(HttpSession sess) {
		UserVo user = (UserVo) sess.getAttribute("user");
		if(user != null) {
			
			return "/board/write";
		}else {
			return "/login";
		}
		
	}
	@PostMapping("/board/write")
	public String write(ArticleVo vo) {
		
		service.insertArticle(vo);
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/board/view")
	public String view(int seq, ArticleVo vo , Model model) {
		
		ArticleVo article = service.selectArticle(seq);
		List<CommentVo> comments = service.selectComments(seq);
		
		service.hitArticle(vo);
		
		model.addAttribute("article", article);
		model.addAttribute("comments", comments);
		return "/board/view";
	}
	
	@GetMapping("/board/modify")
	public String modify(int seq, Model model) {
		
		ArticleVo article = service.selectArticle(seq);
		
		model.addAttribute("article", article);
		return "/board/modify";
	}
	
	@PostMapping("/board/modify/{seq}")
	public String modify(ArticleVo vo) {
		
		service.modifyArticle(vo);
		
		return "redirect:/board/list";
	}
	
	
	@GetMapping("/board/delete")
	public String delete(int seq) {
		
		service.deleteArticle(seq);
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/board/good/{seq}")
	public String good(ArticleVo vo) {
		
		service.goodArticle(vo);
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/board/bed/{seq}")
	public String bed(ArticleVo vo) {
		
		service.bedArticle(vo);
		
		return "redirect:/board/list";
	}
	
	@PostMapping("/board/comment/{seq}")
	public String comment(CommentVo vo) {
		
		service.insertComment(vo);
		
		service.updateComment(vo);
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/board/comment/delete")
	public String deleteComment(int seq) {
		
		service.deleteComment(seq);
		
		return "redirect:/board/list";
	}
	

	
}
