package com.personal.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.project.model.Theater;
import com.personal.project.repository.TheaterRepository;

@Service
public class TheaterService {
    @Autowired
    private TheaterRepository theaterRepository;

    public Theater findById(Long id) {
        return theaterRepository.findById(id).orElse(null);
    }

    public List<Theater> getAllTheaters() {
        return theaterRepository.findAll();
    }

    public Theater createTheater(Theater theater) {
        return theaterRepository.save(theater);
    }

    public Theater updateTheater(Long id, Theater theater) {
        if (theaterRepository.existsById(id)) {
            theater.setId(id);
            return theaterRepository.save(theater);
        } else {
            return null; // Handle not found error
        }
    }

    public void deleteTheater(Long id) {
        theaterRepository.deleteById(id);
    }
}
