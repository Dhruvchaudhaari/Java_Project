package com.project.volunteer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.volunteer.model.user;

public interface UserRepository extends JpaRepository<user, Long> {

 user findByEmail(String email);

}