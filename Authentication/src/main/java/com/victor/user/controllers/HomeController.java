package com.victor.user.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.victor.user.models.LoginUser;
import com.victor.user.models.User;
import com.victor.user.repositories.UserRepository;
import com.victor.user.services.UserService;

@Controller
public class HomeController {
 
 // Add once service is implemented:
 @Autowired
 private UserService userServ;
 
 @Autowired
 private UserRepository userRepo;
 
 @GetMapping("/")
 public String index(Model model) {
     model.addAttribute("newUser", new User());
     model.addAttribute("newLogin", new LoginUser());
     return "index.jsp";
 }
 
 @PostMapping("/register")
 public String register(@Valid @ModelAttribute("newUser") User newUser, 
         BindingResult result, Model model, HttpSession session) {

	 
     if (! newUser.getPassword().equals(newUser.getConfirm()))
     {
    	 result.rejectValue("confirm", "Matches", "The passoword must match!");
     }
     
     if (userRepo.findByEmail(newUser.getEmail()).isPresent())
     {
    	 result.rejectValue("email", "Email", "The email address is not available!");
     }
     
     if(result.hasErrors()) {
         // Be sure to send in the empty LoginUser before 
         // re-rendering the page.
         model.addAttribute("newLogin", new LoginUser());
         return "index.jsp";
     }
     
     User user = userServ.register(newUser);
     session.setAttribute("userId", user.getId());
 
     return "redirect:/home";
 }
 
 @PostMapping("/login")
 public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
         BindingResult result, Model model, HttpSession session) {
     
     // Add once service is implemented:
     // User user = userServ.login(newLogin, result);
	 User user = userServ.login(newLogin);
	 if( user!= null)
	 {
		 session.setAttribute("userId", user.getId());
		 return "redirect:/login";
	 }
     //model.addAttribute("message", "Invalid Credentials");
	 if(result.hasFieldErrors()) {
         // Be sure to send in the empty LoginUser before 
         // re-rendering the page.
         model.addAttribute("newUser", new User());
		 return "index.jsp";
     }
     return "redirect:/home";
 }
 
 @GetMapping("/home")
 public String success(Model model, HttpSession session) {
	
	 User user = userServ.findUser((Long)session.getAttribute("userId"));
	 //System.out.println(user.toString());
	 model.addAttribute("user", user);
	 return "success.jsp";
 }
 
 @GetMapping("/logout")
 public String logout(HttpSession session) {
	 session.invalidate();
	 return "redirect:/";
 }
}
