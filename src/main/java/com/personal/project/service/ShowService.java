package com.personal.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.project.model.Show;
import com.personal.project.repository.ShowRepository;

@Service
public class ShowService {
    @Autowired
    private ShowRepository showRepository;

    public Show findById(Long id) {
        return showRepository.findById(id).orElse(null);
    }

    public List<Show> getAllShows() {
        return showRepository.findAll();
    }

    public Show createShow(Show show) {
        return showRepository.save(show);
    }

    // Implement update and delete methods as needed
}