package com.iqmsoft.web.struts.controller;

import org.springframework.beans.factory.annotation.Autowired;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iqmsoft.web.struts.model.User;
import com.iqmsoft.web.struts.service.UserService;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/api/users",
            produces = {APPLICATION_JSON_VALUE, TEXT_PLAIN_VALUE})
    public List<User> getUsers() throws Exception {
        return userService.retrieveUsers();
    }
}
