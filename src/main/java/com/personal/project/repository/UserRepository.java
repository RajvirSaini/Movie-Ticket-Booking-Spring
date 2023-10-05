package com.personal.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.project.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
