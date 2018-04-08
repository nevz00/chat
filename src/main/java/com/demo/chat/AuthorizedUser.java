package com.demo.chat;

import com.demo.chat.model.User;
import com.demo.chat.to.UserTo;
import com.demo.chat.util.UserUtil;


import static java.util.Objects.requireNonNull;

public class AuthorizedUser {
//    private static final long serialVersionUID = 1L;
//
//    private UserTo userTo;
//
//    public AuthorizedUser(User user) {
//        super(user.getEmail(), user.getPassword(), user.isEnabled(), true, true, true, user.getRoles());
//        this.userTo = UserUtil.asTo(user);
//    }
//
//    public static AuthorizedUser safeGet() {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        if (auth == null) {
//            return null;
//        }
//        Object principal = auth.getPrincipal();
//        return (principal instanceof AuthorizedUser) ? (AuthorizedUser) principal : null;
//    }
//
//    public static AuthorizedUser get() {
//        AuthorizedUser user = safeGet();
//        requireNonNull(user, "No authorized user found");
//        return user;
//    }
//
//    public static int id() {
//        return get().userTo.getId();
//    }
//
//    public UserTo getUserTo() {
//        return userTo;
//    }
//
//    public void update(UserTo newTo) {
//        userTo = newTo;
//    }
//
//    @Override
//    public String toString() {
//        return userTo.toString();
//    }
}