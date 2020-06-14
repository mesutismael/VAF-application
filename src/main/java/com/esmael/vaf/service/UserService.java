package com.esmael.vaf.service;


import com.esmael.vaf.model.User;

public interface UserService {

    public User findUserByEmail(String email);

    public void saveUser(User user);
}
