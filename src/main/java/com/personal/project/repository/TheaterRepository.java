package com.personal.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.project.model.Theater;

@Repository
public interface TheaterRepository extends JpaRepository<Theater, Long> {
    
}
