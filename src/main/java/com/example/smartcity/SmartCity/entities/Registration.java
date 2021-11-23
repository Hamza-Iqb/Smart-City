package com.example.smartcity.SmartCity.entities;

import com.example.smartcity.SmartCity.enums.UserType;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
public class Registration implements Serializable {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private String username;
    private String password;
    private UserType userType;
}
