package com.demo.chat.service;

import com.demo.chat.AuthorizedUser;
import com.demo.chat.model.User;
import com.demo.chat.repository.UserRepository;
import com.demo.chat.to.UserTo;
import com.demo.chat.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.List;

import static com.demo.chat.util.ValidationUtil.checkNotFound;
import static com.demo.chat.util.ValidationUtil.checkNotFoundWithId;

@Service
public class UserServiceImpl implements UserService /*UserDetailsService*/ {

    @Qualifier("database")
    final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository=userRepository;
    }

    @CacheEvict(value = "users", allEntries = true)
    @Override
    public User create(User user) {
        Assert.notNull(user,"user must not be null");
        return userRepository.save(user);
    }

    @CacheEvict(value = "users", allEntries = true)
    @Override
    public void delete(int id) {
        checkNotFoundWithId(userRepository.delete(id),id);
    }

    @Override
    public User get(int id) {
        return checkNotFoundWithId(userRepository.get(id),id);
    }

    @Override
    public User getByEmail(String email) {
        Assert.notNull(email, "email must not be null");
        return checkNotFound(userRepository.getByEmail(email),"email="+ email);
    }

    @CacheEvict(value = "users", allEntries = true)
    @Override
    public void update(User user) {
        Assert.notNull(user,"user must not be null");
        checkNotFoundWithId(userRepository.save(user),user.getId());

    }

    @CacheEvict(value = "users", allEntries = true)
    @Override
    @Transactional
    public void update(UserTo userTo) {
        User user = get(userTo.getId());
        userRepository.save(UserUtil.updateFromTo(user,userTo));
    }

    @Cacheable("users")
    @Override
    public List<User> getAll() {
        return userRepository.getAll();
    }

    @CacheEvict(value = "users", allEntries = true)
    @Override
    @Transactional
    public void enable(int id, boolean enabled) {
        User user = get(id);
        user.setEnabled(enabled);
        userRepository.save(user);
    }

    /*@Override
    public AuthorizedUser loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.getByEmail(email.toLowerCase());
        if (user==null){
            throw new UsernameNotFoundException("User " + email + " is not found");
        }
        return new AuthorizedUser(user);
    }*/
}
