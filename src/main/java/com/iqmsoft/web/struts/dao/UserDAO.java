package com.iqmsoft.web.struts.dao;


import java.util.List;
 


import com.iqmsoft.web.struts.model.User;
 
public interface UserDAO {
    List<User> getUsers();
    void insertBatch();
}