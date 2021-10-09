package com.liabrary.controller;


import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liabrary.dao.UserRepository;
import com.liabrary.entities.User;
import com.liabrary.helper.Message;


@Controller
public class SignupController {

	@Autowired
	private UserRepository userRepository;
	
	//@Autowired
	//private BCryptPasswordEncoder passwordEncoder;
	
	@GetMapping("/test")
	public String test() {
		
		return "api working fine";
	}
	
	@RequestMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("title","Signup-Smart Liabrary");
		model.addAttribute("user", new User());
		return "signup1";
	}
	

		
	
	//handler for sign up user
	@PostMapping("/do_signup")
	public String signupUser(@Valid @ModelAttribute("user") User user, BindingResult res1, Model model, HttpSession session) {
		
		try {
					
			
			if(res1.hasErrors()) {
				System.out.println(res1);
				model.addAttribute("user", user);
				return "signup1";
			}
			

			//user.setRole("ROLE_USER");
			
			//user.setPassword(passwordEncoder.encode(user.getPassword()));
			
			

			
			User result=this.userRepository.save(user);
			
			model.addAttribute("user", new User());
			session.setAttribute("message", new Message("Successfully Registered ", "alert-success"));
			return "signup1";
			
		} catch (Exception e) {

			e.printStackTrace();
			model.addAttribute("user", user);
			session.setAttribute("message", new Message("Sorry! Something went wrong !! ", "alert-danger"));
			return "signup1";
		}
		
		
		
	}
}

