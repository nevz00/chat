package com.demo.chat.service;

import com.demo.chat.model.User;
import com.demo.chat.to.UserTo;

import java.util.List;

public interface UserService {
    User create(User user);

    void delete(int id);

    User get(int id);

    User getByEmail(String email);

    void update(User user);

    void update(UserTo user);

    void enable(int id, boolean enable);

    List<User> getAll();
}
