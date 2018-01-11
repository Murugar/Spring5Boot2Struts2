package com.iqmsoft.web.struts.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.iqmsoft.web.struts.model.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {
 
    @Autowired
    private JdbcTemplate jdbcTemplate;
 
    public List<User> getUsers() {
        return jdbcTemplate.query("SELECT id, first_name, last_name, age, gender, salary FROM users",
                (rs, rowNum) -> new User(rs.getInt("id"), 
                		rs.getString("first_name"), 
                		rs.getString("last_name"), 
                		rs.getString("age"), 
                		rs.getString("gender"),
                		rs.getInt("salary")
                		));
    }
 
    public void insertBatch() {
        jdbcTemplate.execute("DROP TABLE users IF EXISTS");
        jdbcTemplate.execute("CREATE TABLE users(id SERIAL, first_name VARCHAR(255), last_name VARCHAR(255), age VARCHAR(3), gender VARCHAR(1), salary number)");
        jdbcTemplate.batchUpdate("INSERT INTO users(first_name, last_name, age, gender, salary) VALUES (?,?,?,?,?)", userData());
    }
 
    private List<Object[]> userData() {
        List<Object[]> users = new ArrayList<>();
        users.add("John Doe 25 M 10000".split(" "));
        users.add("Jane Doe 23 F 20000".split(" "));
        users.add("Sarah Bosch 34 F 30000".split(" "));
        users.add("Michael Murray 20 M 40000".split(" "));
        users.add("Barry Coy 19 M 50000".split(" "));
        users.add("Daisy Chen 19 F 60000".split(" "));
        users.add("May Williams 15 F 70000".split(" "));
        users.add("Alex Johnson 40 M 80000".split(" "));
        users.add("Ceasar McCoy 39 M 90000".split(" "));
        users.add("Paula May 22 F 100000".split(" "));
        return users;
    }
     
}