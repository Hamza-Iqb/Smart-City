package com.example.smartcity.SmartCity.services;

import com.example.smartcity.SmartCity.entities.Registration;
import com.example.smartcity.SmartCity.exceptions.UserNotFoundException;
import com.example.smartcity.SmartCity.repositories.RegistrationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class RegistrationService {

    private final RegistrationRepository registrationRepository;

    public List<Registration> getAllRegistered() {
        return (List<Registration>) registrationRepository.findAll();
    }

    public Registration getRegisteredId(String username) {
        Long id = registrationRepository.findByUsername(username).getId();
        return registrationRepository.findById(id)
                .orElseThrow( () -> new UserNotFoundException(String.format("Username: %s does not exist", username)));
    }
}
