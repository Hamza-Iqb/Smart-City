package com.example.smartcity.SmartCity.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Businessman {

    @Id
    private Long id;
    private String email;
    private String mobileNumber;
    private String username;
    private String password;
}
