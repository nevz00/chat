package com.demo.chat.repository;

import com.demo.chat.model.User;

import java.util.List;

public interface UserRepository {
    User save(User user);
    boolean delete(int id);
    User get(int id);
    List<User> getAll();
    User getByEmail(String email);
}
