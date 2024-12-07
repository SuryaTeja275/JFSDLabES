package com.klu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetController {
    @RequestMapping("/greet")
    public String greetUser(@RequestParam("username") String username, Model model) {
        model.addAttribute("username", username);
        return "greet";
    }
}