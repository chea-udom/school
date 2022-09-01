package com.springboot.school.service;

import java.util.List;

import com.springboot.school.model.UserModel;

public interface UserService {
    List<UserModel> getUserList();
    UserModel getUserById(Long id);
}
