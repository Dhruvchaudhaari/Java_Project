package com.project.volunteer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.volunteer.model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}