package com.epam.victor.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@Entity
@Table(name ="booking_event")
public class Event{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String title;

    Instant date;

    public Event(String title, Instant date) {
        this.title = title;
        this.date = date;
    }
}
