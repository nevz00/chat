package com.demo.chat.util;

import com.demo.chat.model.Role;
import com.demo.chat.model.User;
import com.demo.chat.to.UserTo;

public class UserUtil {
    public static User createNewFromTo(UserTo newUser) {
        return new User(null, newUser.getFirstName(),newUser.getLastName(), newUser.getEmail().toLowerCase(), newUser.getPassword(), Role.ROLE_USER);
    }

    public static UserTo asTo(User user) {
        return new UserTo(user.getId(), user.getFirstName(),user.getLastName(), user.getEmail(), user.getPassword());
    }

    public static User updateFromTo(User user, UserTo userTo) {
        user.setFirstName(userTo.getFirstName());
        user.setLastName(userTo.getLastName());
        user.setEmail(userTo.getEmail().toLowerCase());
        user.setPassword(userTo.getPassword());
        return user;
    }
}
