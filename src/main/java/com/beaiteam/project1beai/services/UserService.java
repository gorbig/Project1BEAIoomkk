package com.beaiteam.project1beai.services;

import com.beaiteam.project1beai.entities.DbUser;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<DbUser> getUser();

    void addNewUser(DbUser dbUser) throws IllegalAccessException;

    void delete(Long userId) throws IllegalAccessException;

    void buyNewSub(String email) throws IllegalAccessException;

    List<String> getContent(DbUser dbUser) throws IllegalAccessException;

//    List<String> getContentServ();
//
//    List<String> getContentServ(DbUser dbUser);
}
