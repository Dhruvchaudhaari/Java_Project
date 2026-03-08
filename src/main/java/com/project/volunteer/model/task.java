package com.project.volunteer.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class task {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String title;

 private String description;

 private String status;

 @ManyToOne
 private user user;

 @ManyToOne
 private Event event;
}