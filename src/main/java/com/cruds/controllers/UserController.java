package com.cruds.controllers;

import com.cruds.models.User;
import com.cruds.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("users")
public class UserController {
    
    @Autowired
	private UserService userService;

    @GetMapping("")
    // @RequestMapping(value="/", method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("users", userService.getAllUsers());
        
        return "users/index";
    }

    @GetMapping("/create")
    public String create(Model model){
        User user = new User();
        model.addAttribute("user", user);

        return "users/create";
    }

    @PostMapping("/store")
    public String store(@ModelAttribute("user") User user){

        userService.saveUser(user);

        return "redirect:/users";
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable(value = "id") long id, Model model){
        User user = userService.getUserById(id);
        model.addAttribute("user", user);

        return "users/view";

    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable(value = "id") long id, Model model){
        User user = userService.getUserById(id);
        model.addAttribute("user", user);

        return "users/edit";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable (value = "id") long id){
        this.userService.deleteUserById(id);

        return "redirect:/users";
    }

}
