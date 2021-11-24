package com.example.smartcity.SmartCity.services;

import com.example.smartcity.SmartCity.entities.Businessman;
import com.example.smartcity.SmartCity.entities.Registration;
import com.example.smartcity.SmartCity.entities.Student;
import com.example.smartcity.SmartCity.entities.Tourist;
import com.example.smartcity.SmartCity.enums.UserType;
import com.example.smartcity.SmartCity.exceptions.UserNotFoundException;
import com.example.smartcity.SmartCity.repositories.BusinessmanRepository;
import com.example.smartcity.SmartCity.repositories.RegistrationRepository;
import com.example.smartcity.SmartCity.repositories.StudentRepository;
import com.example.smartcity.SmartCity.repositories.TouristRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class RegistrationService {

    private final RegistrationRepository registrationRepository;
    private final BusinessmanRepository businessmanRepository;
    private final StudentRepository studentRepository;
    private final TouristRepository touristRepository;
    private final Logger log = LoggerFactory.getLogger(RegistrationService.class);

    public List<Registration> getAllRegistered() {
        return (List<Registration>) registrationRepository.findAll();
    }

    public Registration getRegisteredId(String username) {
        Long id = registrationRepository.findByUsername(username).getId();
        boolean userExists = registrationRepository.findById(id).isPresent();

        if(!userExists){
            throw new UserNotFoundException(String.format("Account with Username: %s was not found", username));
        }
        return registrationRepository.findById(id).get();
    }

    public Registration addRegistration(Registration registration) {
        registrationRepository.save(registration);

        switch (registration.getUserType()){
            case BUSINESSMAN:
                businessmanRepository.save(new Businessman(registration));
                break;
            case STUDENT:
                studentRepository.save(new Student(registration));
                break;
            case TOURIST:
                touristRepository.save(new Tourist(registration));
                break;
        }

        return registration;
    }

    public void deleteRegistration(String username) {
        Long id = registrationRepository.findByUsername(username).getId();
        boolean userExists = registrationRepository.findById(id).isPresent();

        if(!userExists){
            throw new UserNotFoundException(String.format("Account with Username: %s was not found", username));
        }

        UserType userType = registrationRepository.findById(id).get().getUserType();

        switch (userType){
            case BUSINESSMAN:
                businessmanRepository.deleteById(id);
                break;
            case STUDENT:
                studentRepository.deleteById(id);
                break;
            case TOURIST:
                touristRepository.deleteById(id);
                break;
        }

        registrationRepository.deleteById(id);

    }
}
