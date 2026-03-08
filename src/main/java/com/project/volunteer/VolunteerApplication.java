// package com.project.volunteer;

// import com.project.volunteer.model.Event;
// import com.project.volunteer.model.user;

// import jakarta.persistence.*;
// import lombok.*;

// @Data
// @Entity
// public class VolunteerApplication {

//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  private Long id;

//  private String status;

//  @ManyToOne
//  private user user;

//  @ManyToOne
//  private Event event;
// }
package com.project.volunteer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VolunteerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VolunteerApplication.class, args);
    }

}
