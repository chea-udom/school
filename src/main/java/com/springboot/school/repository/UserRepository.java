package com.springboot.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.school.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    
}
