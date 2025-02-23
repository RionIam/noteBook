package com.notebook.noteBook.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Entity
@Table(name="tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "created_date")
    private LocalDateTime createdDateTime;
    @Column(name = "updated_date")
    private LocalDateTime updatedDateTime;
    @Column(name = "date_of_task")
    private LocalDate dateOfTask;
    @Column(name = "start_time")
    private LocalTime startTimeOfTask;
    @Column(name = "end_time")
    private LocalTime endTimeOfTask;
    @Column(name = "is_done")
    private Boolean isDone;
    @Column(name = "notify")
    private Boolean notify;
    @Column(name = "title", columnDefinition = "TEXT")
    private String title;
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;


}
