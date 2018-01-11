package com.iqmsoft.web.struts.service;


import java.util.List;

import com.iqmsoft.web.struts.model.User;

public interface UserService {
    void putUsers();
    List<User> retrieveUsers();
}