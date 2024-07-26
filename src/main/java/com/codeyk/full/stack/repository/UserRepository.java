package com.codeyk.full.stack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeyk.full.stack.model.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
