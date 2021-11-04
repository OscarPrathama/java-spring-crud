package com.cruds.controllers;

import com.cruds.models.User;
import com.cruds.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    
    @Autowired
	private UserService userService;

    @GetMapping("/users")
    // @RequestMapping(value="/", method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("users", userService.getAllUsers());
        
        return "users/index";
    }

    @GetMapping("/users/create")
    public String create(Model model){
        User user = new User();
        model.addAttribute("user", user);

        return "users/create";
    }

    @PostMapping("/users/store")
    public String store(@ModelAttribute("user") User user){
        userService.saveUser(user);

        return "redirect:/users";
    }

}
