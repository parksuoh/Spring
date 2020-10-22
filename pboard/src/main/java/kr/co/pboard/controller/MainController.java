package kr.co.pboard.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.pboard.persistance.UserRepo;
import kr.co.pboard.service.UserService;
import kr.co.pboard.vo.UserVo;

@Controller
public class MainController {
	
	@Autowired
	private UserRepo repo;
	
	@Autowired
	private UserService service;

	@GetMapping(value={"/","/login"})
	public String login() {
		
		
		return "/login";
	};
	
	@PostMapping("/login")
	public String login(UserVo vo, HttpSession sess) {
		
		UserVo user = service.selectUser(vo);
		
		if(user != null) {
			sess.setAttribute("user", user);
			sess.setAttribute("uid", user.getUid());
			sess.setAttribute("pass", user.getPass());
			sess.setAttribute("name", user.getName());
			sess.setAttribute("nick", user.getNick());
			sess.setAttribute("email", user.getEmail());
			sess.setAttribute("phone", user.getPhone());
			return "redirect:/board/list";
		}else {
			return "redirect:/login?success=fail";
		}
		
	}
	
}
