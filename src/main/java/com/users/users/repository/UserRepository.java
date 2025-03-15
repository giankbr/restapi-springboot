package com.users.users.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.users.users.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // nyari user berdasarkan email
    Optional<User> findByEmail(String email);


}
