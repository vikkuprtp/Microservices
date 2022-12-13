package com.vp.user.service.services;

import com.vp.user.service.entities.User;

import java.util.List;

public interface UserService {

    //create
    User saveUser(User user);

    //get all user
    List<User> getAllUser();

    //get Single user
    User getUser(Long UserId);
}
