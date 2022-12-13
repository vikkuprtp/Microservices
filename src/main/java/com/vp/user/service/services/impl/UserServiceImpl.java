package com.vp.user.service.services.impl;

import com.vp.user.service.entities.User;
import com.vp.user.service.exception.ResourceNotFoundException;
import com.vp.user.service.repositories.UserRepository;
import com.vp.user.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        String randomUserId= UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String UserId) {
        return userRepository.findById(Long.valueOf(UserId)).orElseThrow(()-> new ResourceNotFoundException());
    }
}
