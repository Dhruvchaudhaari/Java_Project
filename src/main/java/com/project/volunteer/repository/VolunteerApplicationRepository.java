package com.project.volunteer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.volunteer.VolunteerApplication;

public interface VolunteerApplicationRepository extends JpaRepository<VolunteerApplication, Long> {
}