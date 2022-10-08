package com.beaiteam.project1beai.services;

import com.beaiteam.project1beai.entities.DbUser;
import com.beaiteam.project1beai.repositories.UserRepository;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    private  UserRepository userRepository;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public DbUser getUser(String email) {
        return userRepository.findDbUserByEmail(email);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        DbUser dbUser = userRepository.findDbUserByEmail(email);
        if(Objects.nonNull(dbUser))
            return new User(dbUser.getEmail(), dbUser.getPassword(), dbUser.getRoles());
        return null;
    }
}
