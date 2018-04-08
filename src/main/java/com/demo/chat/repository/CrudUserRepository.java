package com.demo.chat.repository;

import com.demo.chat.model.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface CrudUserRepository extends JpaRepository<User, Integer> {
    @Transactional
    @Modifying
    @Query("delete from User u where u.id=:id")
    int delete(@Param("id") int id);

    @Override
    @Transactional
    User save(User save);

    @Override
    Optional<User> findById(Integer integer);

    @Override
    List<User> findAll(Sort sort);

    User getByEmail(String email);
}
