package com.msprojects.expenseTracker.utils.JwtSecurity.service;

import com.msprojects.expenseTracker.utils.JwtSecurity.models.JwtUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginRepository extends JpaRepository<JwtUser, Long> {
    Optional<JwtUser> findByEmailAndPassword(String email, String password);
}
