package com.baryshnikov.SpringSecurityStudy.repository;

import com.baryshnikov.SpringSecurityStudy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
