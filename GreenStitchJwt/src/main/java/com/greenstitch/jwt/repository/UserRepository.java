package com.greenstitch.jwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenstitch.jwt.entity.User;

public interface UserRepository extends JpaRepository<User,String> {

		public Optional<User> findByEmail(String email);
}
