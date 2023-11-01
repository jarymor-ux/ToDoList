package com.ostap.todolist.controller;


import com.ostap.todolist.Entity.Users;
import com.ostap.todolist.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;


@Controller("/api")
public class APIRestController {

    private UserRepository userRepository;
    @PostMapping("/addNewUser")
    public Users  addUser(Users user){

        return userRepository.save(user);

    }


}
