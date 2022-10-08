package com.beaiteam.project1beai.controllers;

import com.beaiteam.project1beai.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    private final UserService userService;

    public WebController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String indexPage(Model model){
        return "index";
    }

}
