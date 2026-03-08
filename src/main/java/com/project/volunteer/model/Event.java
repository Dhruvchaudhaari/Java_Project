package com.project.volunteer.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class Event {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String title;

 private String description;

 private String date;

 private String location;
}