package com.example.smartcity.SmartCity.repositories;

import com.example.smartcity.SmartCity.entities.Registration;
import com.example.smartcity.SmartCity.entities.Tourist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TouristRepository extends CrudRepository<Tourist, Long> {
    Tourist findByUsername(String username);
}
