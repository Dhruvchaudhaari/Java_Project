package com.project.volunteer.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class user{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    private String role;
}