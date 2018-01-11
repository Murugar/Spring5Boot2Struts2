package com.iqmsoft.web.struts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.iqmsoft.web.struts.dao.UserDAO;
import com.iqmsoft.web.struts.model.User;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
     
    @Autowired
    private UserDAO userDAO;

    @Override
    public void putUsers() {
        userDAO.insertBatch();
    }

    @Override
    public List<User> retrieveUsers() {
        return userDAO.getUsers();
    }

}