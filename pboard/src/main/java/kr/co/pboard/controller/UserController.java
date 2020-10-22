package kr.co.pboard.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import kr.co.pboard.persistance.UserRepo;
import kr.co.pboard.persistance.TermsRepo;
import kr.co.pboard.vo.TermsVo;
import kr.co.pboard.vo.UserVo;
import kr.co.pboard.service.BoardService;
import kr.co.pboard.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	private UserRepo UserRepo;
	@Autowired
	private TermsRepo TermsRepo;
	
	@Autowired
	private UserService service;
	
	@Autowired
	private BoardService boardservice;
	
	@GetMapping("/user/register")
	public String register() {
		
		return "/user/register";
	}
	
	@PostMapping("/user/register")
	public String register(UserVo vo) {
		
		vo.setRdate(LocalDateTime.now().toString());
		UserRepo.save(vo);
		
		return "redirect:/login";
	}
	
	@GetMapping("/user/terms")
	public String terms(String type, Model model) {
		
		TermsVo vo = TermsRepo.findById(0).get();
		
		model.addAttribute("type", type);
		model.addAttribute(vo);
		
		return "/user/terms";
	}
	
	@GetMapping("/user/logout")
	public String logout(HttpSession sess) {
		
		sess.invalidate();
		
		return "redirect:/login";
	}
	@GetMapping("/user/userpage")
	public String userpage() {
		
		
		
		return "/user/userpage";
	}
	@GetMapping("/user/userboard")
	public String userboard() {
		
		return "/user/userboard";
	}
	@GetMapping("/user/usermodify")
	public String userusermodify() {
		
		return "/user/usermodify";
	}
	@PostMapping("/user/usermodify")
	public String userusermodify(UserVo vo) {
		
		service.updateUser(vo);
		
		return "redirect:/board/list";
	}
	
	
	@GetMapping("/user/checkpass")
	public String checkpass() {
		
		return "/user/checkpass";
	}
	@PostMapping("/user/checkpass")
	public String checkpass(UserVo vo) {
		
		UserVo user = service.selectUser(vo);
		
		if(user != null) {
			return "redirect:/user/usermodify";
		}else {
			return "redirect:/user/checkpass?success=fail";
		}
		
	}
	
	
}
