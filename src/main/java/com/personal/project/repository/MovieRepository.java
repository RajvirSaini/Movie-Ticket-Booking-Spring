package com.personal.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.project.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    
}

