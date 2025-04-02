package com.jinhui.wmissauth.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jinhui.wmissauth.entity.User;

/**
 * DESCRIPTION_OF_YOUR_CLASS
 *
 * @author lupeng (elupeng@163.com)
 */
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}
