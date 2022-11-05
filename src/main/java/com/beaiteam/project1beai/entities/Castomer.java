package com.beaiteam.project1beai.entities;

import com.beaiteam.project1beai.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@AllArgsConstructor
public class Castomer extends Role{
    private final UserService userService;
    public String indexPage(Model model){
        return "in-dex";
    }


    public List<DbUser> getUsers(){
        return userService.getUser();
    }


    public void registerNewUser(@RequestBody DbUser dbUser) throws IllegalAccessException {
        userService.addNewUser(dbUser);
    }
}
