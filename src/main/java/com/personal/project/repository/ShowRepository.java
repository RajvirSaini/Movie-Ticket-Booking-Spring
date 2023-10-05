package com.personal.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.project.model.Show;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long> {

}
