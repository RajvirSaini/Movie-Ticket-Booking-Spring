package com.personal.project.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "theater_id")
    private Theater theater;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Embedded
    private SeatNumber seatNumber;

    private Date showTime;
    private double ticketPrice;
    private String status;

    // Constructors, getters, setters
}
