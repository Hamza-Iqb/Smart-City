package com.example.smartcity.SmartCity.repositories;

import com.example.smartcity.SmartCity.entities.Registration;
import com.example.smartcity.SmartCity.services.RegistrationService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends CrudRepository<Registration, Long> {
    Registration findByUsername(String username);
}
