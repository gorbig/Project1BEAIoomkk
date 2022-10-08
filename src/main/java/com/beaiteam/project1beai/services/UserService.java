package com.beaiteam.project1beai.services;

import com.beaiteam.project1beai.entities.DbUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    DbUser getUser(String email);
}
