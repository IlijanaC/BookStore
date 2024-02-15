package com.bookStore.service;

import com.bookStore.entity.User;
import com.bookStore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsService  implements org.springframework.security.core.userdetails.UserDetailsService{
    @Autowired
    UserRepository repository;

    @Override
    public com.bookStore.entity.UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        User u = repository.findByEmail(username);
        return new com.bookStore.entity.UserDetails(u);
    }
}
