package com.example.smartcity.SmartCity.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Student {

    @Id
    private Long id;
    private String email;
    private String username;
    private String password;

    @Autowired
    public Student(Registration registration) {
        this.id = registration.getId();
        this.email = registration.getEmail();
        this.username = registration.getUsername();
        this.password = registration.getPassword();
    }
}
