package com.example.springtest.controller;

import com.example.springtest.entity.User;
import com.example.springtest.manager.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }
    @GetMapping("/users")
    public List<User>getAll(){
        return userService.getAll();
    }
    @GetMapping("/users/{id}")
    public User getById(@PathVariable int id){
        return userService.getById(id);
    }
    @PostMapping("/users")
    public void create(@RequestBody User user){
        userService.create(user);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        userService.delete(id);

    }


}
