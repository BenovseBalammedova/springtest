package com.example.springtest.service;

import com.example.springtest.entity.User;

import java.util.List;

public interface UserService {
    List<User>getAll();
    void delete(int id);
    void create(User user);
    User getById(int id);

}
