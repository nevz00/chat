package com.demo.chat.repository;

import com.demo.chat.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Repository
//@Transactional
public class UserRepositoryImpl implements UserRepository {

    private static final Sort SORT_NAME_EMAIL = new Sort(Sort.Direction.ASC,  "email");

    @Autowired
    CrudUserRepository crudRepository;

    @Override
    public User save(User user) {
        return crudRepository.save(user);
    }

    @Override
    public boolean delete(int id) {
        return crudRepository.delete(id)!=0;
    }

    @Override
    public User get(int id) {
        return crudRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAll() {
        return crudRepository.findAll(SORT_NAME_EMAIL);
    }

    @Override
    public User getByEmail(String email) {
        return crudRepository.getByEmail(email);
    }
}
