package com.app.services;


import com.app.dao.UserDao;
import com.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    // USERS FROM DB
    @Autowired
    private UserDao userDao;

    public List<User> getUsersDb(){
        return userDao.getUsersDb();
    }



    // USERS FROM ARRAYS
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Alduin", "Fusrodahov", "boo@inbox.lv", "+37122222222"));
        users.add(new User("Aleksej", "Pupkin", "pupok@inbox.lv", "+37124222222"));
        users.add(new User("Big", "Smoke", "green@inbox.lv", "+37123222222"));

        return users;
    }
}