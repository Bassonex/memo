package com.app.services;

import com.app.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Alduin", "Fusrodahov", "boo@inbox.lv", "+37122222222"));
        users.add(new User("Aleksej", "Pupkin", "pupok@inbox.lv", "+37124222222"));
        users.add(new User("Big", "Smoke", "green@inbox.lv", "+37123222222"));

        return users;
    }
}