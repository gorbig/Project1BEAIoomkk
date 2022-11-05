package com.beaiteam.project1beai.controllers;

import com.beaiteam.project1beai.entities.DbUser;
import com.beaiteam.project1beai.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@AllArgsConstructor
public class WebController<dbuser> {
   @Autowired
   private final UserService userService;



    @GetMapping(value = "/")
    public String indexPage(Model model){
        return "index";
    }

    @GetMapping(value = "/users")
    public List<DbUser> getUsers(){
        return userService.getUser();
    }

    @PostMapping(value="/reg")
    public void registerNewUser(@RequestBody DbUser dbUser) throws IllegalAccessException {
        userService.addNewUser(dbUser);
    }

    @DeleteMapping(path = "{userId}")
    public void deleteUser(@PathVariable("userId") Long userId) throws IllegalAccessException {
        userService.delete(userId);
    }


    public void buySub(String email) throws IllegalAccessException {
        userService.buyNewSub(email);
    }

    @GetMapping(value = "/forUsers")
    public List<String> forUsersMethod(@RequestBody DbUser dbUser) throws IllegalAccessException {
        return userService.getContent(dbUser);
    }

//    @GetMapping(value="/content")
//    public List<String> getContent(@RequestBody DbUser dbUser){
//        return userService.getContentServ(dbUser);
//    }

}
