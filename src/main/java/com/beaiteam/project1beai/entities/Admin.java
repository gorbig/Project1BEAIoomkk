package com.beaiteam.project1beai.entities;

import com.beaiteam.project1beai.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
public class Admin extends Role{
    private final UserService userService;
    public String indexPage(Model model){
        return "intdex.html";
    }


    public List<DbUser> getUsers(){
        return userService.getUser();
    }


    public void registerNewUser(@RequestBody DbUser dbUser) throws IllegalAccessException {
        userService.addNewUser(dbUser);
    }


    public void deleteUser(@PathVariable("userId") Long userId) throws IllegalAccessException {
        userService.delete(userId);
    }


    public void buySub(String email) throws IllegalAccessException {
        userService.buyNewSub(email);
    }

}
