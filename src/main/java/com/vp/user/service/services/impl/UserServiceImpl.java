package com.vp.user.service.services.impl;

import com.vp.user.service.entities.User;
import com.vp.user.service.repositories.UserRepository;
import com.vp.user.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(Long UserId) {
        return userRepository.findById(UserId).orElseThrow();
    }
}
